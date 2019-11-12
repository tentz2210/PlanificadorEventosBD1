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
}