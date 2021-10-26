/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.HocKy;
import model.MonHocThongKe;
import model.SinhVien;
import model.SinhVienDangKiThongKe;
import model.SinhVienThongKe;

/**
 *
 * @author Admin
 */
public class SinhVienDangKiThongKeDAO extends DAO {

    public List<SinhVienDangKiThongKe> layDSSVDKTK(SinhVienThongKe svtk, HocKy hk) {
        List<SinhVienDangKiThongKe> bangDiemSV = new ArrayList<>();
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("Select SinhVienDangKi.*,(diemTP1*0.1+diemTP2*0.1+diemTP3*0.1+diemThi*0.7) as diemTrungBinh, MonHoc.tenMH, MonHoc.soTC\n"
                    + "from SinhVienDangKi, MonHoc, LopHocPhan, SinhVien\n"
                    + "where SinhVienDangKi.ID_LHP = LopHocPhan.ID\n"
                    + "And LopHocPhan.ID_MH = MonHoc.ID\n"
                    + "AND SinhVienDangKi.ID_SV = SinhVien.ID\n"
                    + "AND diemTP1 IS NOT NULL AND diemTP2 IS NOT NULL AND diemTP3 IS NOT NULL AND diemThi IS NOT NULL\n"
                    + "AND LopHocPhan.ID_HocKy = '"+hk.getID()+"'\n"
                    + "AND SinhVien.ID = '"+svtk.getID()+"'");
            while (rs.next()) {
                int ID = rs.getInt(1);
                double diemTP1 = rs.getDouble(4);
                double diemTP2 = rs.getDouble(5);
                double diemTP3 = rs.getDouble(6);
                double diemThi = rs.getDouble(7);
                double diemTB = Double.parseDouble(rs.getString(8));
                String tenMH = rs.getString(9);
                int soTC = rs.getInt(10);
                bangDiemSV.add(new SinhVienDangKiThongKe(diemTB, tenMH, soTC, ID, svtk, diemTP1, diemTP2, diemTP3, diemThi));
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return bangDiemSV;
    }
    public List<SinhVienDangKiThongKe> layDSSVDKTK(MonHocThongKe mon){
        List<SinhVienDangKiThongKe> list = new ArrayList<>();
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT NguoiDung.*, SinhVien.*, SinhVienDangKi.*,"
                    + " (diemTP1*0.1+diemTP2*0.1+diemTP3*0.1+diemThi*0.7) as diemTB\n"
                    + "FROM NguoiDung, SinhVien, SinhVienDangKi, MonHoc, LopHocPhan\n"
                    + "WHERE SinhVienDangKi.ID_LHP = LopHocPhan.ID\n"
                    + "AND SinhVienDangKi.ID_SV= SinhVien.ID\n"
                    + "AND NguoiDung.ID = SinhVien.ID_NguoiDung\n"
                    + "AND LopHocPhan.ID_MH = MonHoc.ID\n"
                    + "AND diemTP1 is not null AND diemTP2 is not null AND diemTP3"
                    + " is not null AND diemThi is not null\n"
                    + "AND MonHoc.ID='" + mon.getID() + "'");
            while (rs.next()) {
                SinhVienDangKiThongKe sv = new SinhVienDangKiThongKe();
                sv.setSinhVien(new SinhVien(rs.getString(6), rs.getDate(7), 
                        rs.getInt(8), rs.getString(9), rs.getString(10), rs.getInt(1),
                        rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
                sv.setID(rs.getInt(12));
                sv.setDiemTP1(rs.getDouble(15));
                sv.setDiemTP2(rs.getDouble(16));
                sv.setDiemTP3(rs.getDouble(17));
                sv.setDiemThi(rs.getDouble(18));
                sv.setDiemTB(Double.parseDouble(rs.getString(19)));
                list.add(sv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
