/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEProject;
import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;
import java.util.*;
/**
 *
 * 
 */
public class DBConnect {
    Connection conn= null;
    public static Connection ConnectDb()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvpresorts?zeroDateTimeBehavior=convertToNull&useSSL=false", "root", "mvp1");
            //Properties properties = new Properties();
            //properties.setProperty("user", "root");
            //properties.setProperty("password", "mvp1");
            //properties.setProperty("useSSL", "false");
            //properties.setProperty("autoReconnect", "true");
            //JOptionPane.showMessageDialog(null,"Connected");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    public static void main(String args[])
    {
        
    }
}
