/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

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
            System.out.println("Connected");
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
            //System.out.println("No more results");
            statement.close();
            
        } catch (SQLException ex) {
            Global.login_result = 0;
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}