/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycoffeeshop;
import database.databaseHelper;
import java.sql.*;
import java.util.List;
import model.user;
import model.userDAO;
/**
 *
 * @author Tung Le
 */
public class testDB {
    public static void main(String[] args) throws SQLException {
        Connection conn = new databaseHelper().getDBConnect();
        if (conn != null){
            
            System.out.println("ketnoithanh cong");
            for (user u : userDAO.getAll()){
                System.out.println(u.toString());
            }
            
        }else System.out.println("that bai");
    }
}
