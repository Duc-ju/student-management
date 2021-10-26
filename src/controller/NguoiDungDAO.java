/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class NguoiDungDAO extends DAO{
    public boolean kiemTraTaiKhoan(String taikhoan, String matkhau){
        boolean check = false;
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT vitri\n"
                    + "FROM NguoiDung\n"
                    + "WHERE taiKhoan='"+taikhoan+"'\n"
                    + "AND matKhau='"+matkhau+"'");
            if(rs.next())
                check = true;
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return check;
    }
    public String layViTri(String taikhoan, String matkhau){
        String vitri="";
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT vitri\n"
                    + "FROM NguoiDung\n"
                    + "WHERE taiKhoan='"+taikhoan+"'\n"
                    + "AND matKhau='"+matkhau+"'");
            if(rs.next())
                vitri=rs.getString(1);
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return vitri;
    }
}
