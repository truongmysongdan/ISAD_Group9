/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.databaseHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author Tung Le
 */
public class userDAO {
    public static List<user> getAll(){
        Connection conn = null;
        List<user> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select account,password,NAMEtype\n" +
"from dbo.Emloyee E join dbo.EmloyeeType ET\n" +
"on E.EmloyeeTypeId=et.EmloyeeTypeId"
                    ;
            conn = databaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            
            while (rs.next()){
                user u = new user();
                u.setPasword(rs.getString(2));
                u.setUsername(rs.getString(1));
                u.setRole(rs.getString(3));
                ls.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                rs.close(); sttm.close();conn.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }
}
