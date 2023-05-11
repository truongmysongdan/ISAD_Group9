/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import com.sun.source.tree.DirectiveTree;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author Tung Le
 */
public class databaseHelper {
    public static final String connectionURL = "jdbc:sqlserver://localhost;databasename=QL;user=sa;password=123456789";
    public static Connection getDBConnect(){
        String connectionUrl = "jdbc:sqlserver://localhost;databaseName=QL;user=sa;password=123456789";

        try {
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
