/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import Utils.CatalogueContainer;
import Utils.Global;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lin
 */

public class MySQLConnection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/eventsproject";
    static final String DB_DRV = "com.mysql.jdbc.Driver";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "Lfmb1500";
    
    public static void checkUserLogin(String p_user_name,String p_password)
    {
        Connection connection = null;
        CallableStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.prepareCall("{call userLogin(?,?)}");
            statement.setString(1,p_user_name);
            statement.setString(2,p_password);
            boolean hadResults = statement.execute();
            while (hadResults)
            {
                resultSet = statement.getResultSet();
                while (resultSet.next())
                {
                    Global.user_id = resultSet.getInt("user_id");
                    Global.person_id = resultSet.getInt("person_id");
                    Global.user_type_id = resultSet.getInt("user_type_id");
                    Global.login_result = 1;
                }
                hadResults = statement.getMoreResults();
            }
            statement.close();
            
        } catch (SQLException ex) {
            Global.login_result = 0;
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void loadUserTypes()
    {
        Connection connection = null;
        CallableStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.prepareCall("{call getUserTypes()}");
            boolean hadResults = statement.execute();
            while (hadResults)
            {
                resultSet = statement.getResultSet();
                while (resultSet.next())
                {
                    CatalogueContainer cc = new CatalogueContainer(resultSet.getInt("user_type_id"),resultSet.getString("user_type_name"));
                    Global.userTypesInfo.add(cc);
                    Global.getInfo_result = 1;
                }
                hadResults = statement.getMoreResults();
            }
            statement.close();
            
        } catch (SQLException ex) {
            Global.getInfo_result = 0;
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void registerUser(String p_first_name,String p_middle_name,String p_last_name,int p_id,String p_birth,
                                    String p_photo,String p_username,String p_password,int p_user_type,int p_phone,String p_email)
    {
        Connection connection = null;
        CallableStatement statement = null;
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.prepareCall("{call registerUser(?,?,?,?,?,?,?,?,?,?,?)}");
            statement.setString(1,p_first_name);
            statement.setString(2,p_middle_name);
            statement.setString(3,p_last_name);
            statement.setInt(4,p_id);
            statement.setString(5,p_birth);
            statement.setString(6,p_photo);
            statement.setString(7,p_username);
            statement.setString(8,p_password);
            statement.setInt(9,p_user_type);
            statement.setInt(10,p_phone);
            statement.setString(11,p_email);
            
            statement.execute();
            Global.insert_result = 1;
            statement.close();
            
        } catch (SQLException ex) {
            Global.insert_result = 0;
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updateEmail(String p_old,String p_new, int p_person_id)
    {
        Connection connection = null;
        CallableStatement statement = null;
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.prepareCall("{call updateEmail(?,?,?)}");
            statement.setString(1,p_old);
            statement.setString(2,p_new);
            statement.setInt(3,p_person_id);
            
            statement.execute();
            statement.close();
            
            String mail = getMail(p_person_id);
            if (!mail.equals(p_new)) Global.update_result = 0;
            else Global.update_result = 1;
            System.out.println(Global.update_result);
            
        } catch (SQLException ex) {
            Global.update_result = 0;
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String getMail(int p_person_id)
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String mail = "";
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT email_address FROM email WHERE person_id = "+Global.person_id);
            
            while(resultSet.next())
            {
                System.out.println(resultSet.getString("email_address"));
                mail = resultSet.getString("email_address");
            }
            return mail;
            
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            return mail;
        }
    }
    
    public static void updatePhone(int p_old, int p_new, int p_person_id)
    {
        Connection connection = null;
        CallableStatement statement = null;
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.prepareCall("{call updatePhone(?,?,?)}");
            statement.setInt(1,p_new);
            statement.setInt(2,p_old);
            statement.setInt(3,p_person_id);
            
            statement.execute();
            statement.close();
            
            int phone = getPhone(p_person_id);
            if (phone == p_new) Global.update_result = 1;
            else Global.update_result = 0;
            System.out.println(Global.update_result);
            
        } catch (SQLException ex) {
            Global.update_result = 0;
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int getPhone(int p_person_id)
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        int phone = 0;
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT phone_number FROM phone WHERE person_id = "+Global.person_id);
            
            while(resultSet.next())
            {
                System.out.println(resultSet.getInt("phone_number"));
                phone = resultSet.getInt("phone_number");
            }
            return phone;
            
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            return phone;
        }
    }
    
    public static void updatePersonName(int p_person_id, String p_new_name)
    {
        Connection connection = null;
        CallableStatement statement = null;
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.prepareCall("{call updatePersonName(?,?)}");
            statement.setInt(1,p_person_id);
            statement.setString(2,p_new_name);
            
            statement.execute();
            statement.close();
            
            String name = getName(p_person_id);
            if (name.equals(p_new_name)) Global.update_result = 1;
            else Global.update_result = 0;
            System.out.println(Global.update_result);
            
        } catch (SQLException ex) {
            Global.update_result = 0;
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String getName(int p_person_id)
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String name = "";
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT first_name FROM person WHERE person_id = "+Global.person_id);
            
            while(resultSet.next())
            {
                System.out.println(resultSet.getString("first_name"));
                name = resultSet.getString("first_name");
            }
            return name;
            
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            return name;
        }
    }
    
    public static void updatePersonMiddleName(int p_person_id, String p_middle_name)
    {
        Connection connection = null;
        CallableStatement statement = null;
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.prepareCall("{call updatePersonMiddleName(?,?)}");
            statement.setInt(1,p_person_id);
            statement.setString(2,p_middle_name);
            
            statement.execute();
            statement.close();
            
            String middleName = getMiddleName(p_person_id);
            if (middleName.equals(p_middle_name)) Global.update_result = 1;
            else Global.update_result = 0;
            System.out.println(Global.update_result);
            
        } catch (SQLException ex) {
            Global.update_result = 0;
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String getMiddleName(int p_person_id)
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String middleName = "";
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT middle_name FROM person WHERE person_id = "+Global.person_id);
            
            while(resultSet.next())
            {
                System.out.println(resultSet.getString("middle_name"));
                middleName = resultSet.getString("middle_name");
            }
            return middleName;
            
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            return middleName;
        }
    }
    
    public static void updatePersonLastName(int p_person_id, String p_last_name)
    {
        Connection connection = null;
        CallableStatement statement = null;
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.prepareCall("{call updatePersonLastName(?,?)}");
            statement.setInt(1,p_person_id);
            statement.setString(2,p_last_name);
            
            statement.execute();
            statement.close();
            
            String last_name = getLastName(p_person_id);
            if (last_name.equals(p_last_name)) Global.update_result = 1;
            else Global.update_result = 0;
            System.out.println(Global.update_result);
            
        } catch (SQLException ex) {
            Global.update_result = 0;
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String getLastName(int p_person_id)
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String last_name = "";
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT last_name FROM person WHERE person_id = "+Global.person_id);
            
            while(resultSet.next())
            {
                System.out.println(resultSet.getString("last_name"));
                last_name = resultSet.getString("last_name");
            }
            return last_name;
            
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            return last_name;
        }
    }
    
    public static void updatePersonId(int p_person_id, int p_new_id)
    {
        Connection connection = null;
        CallableStatement statement = null;
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.prepareCall("{call updatePersonIdPass(?,?)}");
            statement.setInt(1,p_person_id);
            statement.setInt(2,p_new_id);
            
            statement.execute();
            statement.close();
            
            int id = getIdPass(p_person_id);
            if (id == p_new_id) Global.update_result = 1;
            else Global.update_result = 0;
            System.out.println(Global.update_result);
            
        } catch (SQLException ex) {
            Global.update_result = 0;
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int getIdPass(int p_person_id)
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        int id = 0;
        
        try {
            Class.forName(DB_DRV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT id FROM person WHERE person_id = "+Global.person_id);
            
            while(resultSet.next())
            {
                System.out.println(resultSet.getInt("id"));
                id = resultSet.getInt("id");
            }
            return id;
            
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            return id;
        }
    }
}