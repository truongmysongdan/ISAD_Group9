/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import database.databaseHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Tung Le
 */
public class customerDAO {
    Connection con = null;
    PreparedStatement ptm = null;
    public int add (customer a){
        try {
            String SQL = "INSERT INTO Customor VALUES (?,?,?,?,?)";
            con = databaseHelper.getDBConnect();
            ptm = con.prepareStatement(SQL);
            ptm.setString(2,a.getName());
            ptm.setString(1,a.getEmail());
            ptm.setString(3,a.getAddress());
            ptm.setString(4,a.getPhone());
            ptm.setString(5,a.getType());
            if (ptm.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "add successfully");
                return 1;
            }
        } catch (Exception e) {
        }
        return -1;
    }
    public int delete (customer a){
        try {
            String SQL = "delete from customor where customorId =?";
            con = databaseHelper.getDBConnect();
            ptm = con.prepareStatement(SQL);
            ptm.setInt(1,a.getCusID());
            if (ptm.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "delete successfully");
                return 1;
            }
        } catch (Exception e) {
        }
        return -1;
    }
        public int update (customer a){
        try {
            String SQL = "update Customor set Email = ? , Name = ? , Addess = ? , Phone = ? , NameType = ?  where CustomorId = ? ";
            con = databaseHelper.getDBConnect(); 
            ptm = con.prepareStatement(SQL);
            ptm.setString(2,a.getName()); 
            ptm.setString(1,a.getEmail());
            ptm.setString(3,a.getAddress());
            ptm.setString(4,a.getPhone());
            ptm.setString(5,a.getType());
            ptm.setInt(6,a.getCusID());
            if (ptm.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "update successfully");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("ngu");
        }
            System.out.println(a.toString());
        return -1;
    }
//    public int update(customer cus)throws Exception{
//       String SQL = "update Customor set Email = ? , Name = ? , Addess = ? , Phone = ? , NameType = ?  where CustomorId = ? ";
//       try(
//               Connection con = databaseHelper.getDBConnect();
//               PreparedStatement ptm = con.prepareStatement(SQL);
//            ){
//           ptm.setString(1,cus.getEmail());
//           ptm.setString(2,cus.getName());
//           ptm.setString(3,cus.getAddress());
//           ptm.setString(4,cus.getPhone());
//           ptm.setString(5,a.getType());
//       }
//    }
    public static List<customer> getAll(){
        Connection conn = null;
        List<customer> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from Customor"  ;

                   
            conn = databaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            
            while (rs.next()){
                customer u = new customer();
                u.setCusID(Integer.parseInt(rs.getString(1)));
                u.setName(rs.getString(3));
                u.setEmail(rs.getString(2));
                u.setAddress(rs.getString(4));
                u.setPhone(rs.getString(5));
                u.setType(rs.getString(6));
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
