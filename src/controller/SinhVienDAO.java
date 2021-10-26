/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import model.SinhVien;

/**
 *
 * @author Admin
 */
public class SinhVienDAO extends DAO{
    public SinhVien laySinhVien(String tk, String mk) {
        SinhVien sv = new SinhVien();
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT SinhVien.*,NguoiDung.*\n"
                    + "FROM SinhVien,NguoiDung\n"
                    + "WHERE SinhVien.ID_NguoiDung = NguoiDung.ID\n"
                    + "AND NguoiDung.taiKhoan = '"+tk+"'\n"
                    + "AND NguoiDung.matkhau= '"+mk+"'");
            if (rs.next()) {
                String ID = rs.getString(1);
                Date ngaySinh = rs.getDate(2);
                int khoa = rs.getInt(3);
                String queQuan = rs.getString(4);
                String diaChi = rs.getString(5);
                int ID_NguoiDung = rs.getInt(7);
                String tenDayDu = rs.getString(10);
                String viTri = rs.getString(11);
                sv = new SinhVien(ID, ngaySinh, khoa, queQuan, diaChi, ID_NguoiDung, tk, mk, tenDayDu , viTri);
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return sv;
    }
}
