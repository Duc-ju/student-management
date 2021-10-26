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
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import model.HocKy;
import model.SinhVien;
import model.SinhVienDangKiThongKe;
import model.SinhVienThongKe;

/**
 *
 * @author Admin
 */
public class SinhVienThongKeDAO extends DAO {

    public List<SinhVienThongKe> layDSKeyQuaSV(HocKy hk) {
        List<SinhVienThongKe> dsKetQuaSV = new ArrayList<>();
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT DISTINCT SinhVien.*,NguoiDung.tenDayDu\n"
                    + "FROM SinhVien, SinhVienDangKi, LopHocPhan, NguoiDung\n"
                    + "WHERE SinhVien.ID = SinhVienDangKi.ID_SV\n"
                    + "AND SinhVienDangKi.ID_LHP = LopHocPhan.ID\n"
                    + "AND diemTP1 IS NOT NULL AND diemTP2 IS NOT NULL AND diemTP3 IS NOT NULL AND diemThi IS NOT NULL\n"
                    + "AND NguoiDung.ID = SinhVien.ID_NguoiDung\n"
                    + "AND LopHocPhan.ID_HocKy = '"+hk.getID()+"'");
            while (rs.next()) {
                String ID = rs.getString(1);
                Date ngaySinh = rs.getDate(2);
                int khoa = rs.getInt(3);
                String queQuan = rs.getString(4);
                String diaChi = rs.getString(5);
                String tenDayDu = rs.getString(7);
                Statement statement1 = con.createStatement();
                ResultSet rs1 = statement1.executeQuery("SELECT SUM(MonHoc.soTC),"
                        + " SUM((diemTP1*0.1+diemTP2*0.1+diemTP3*0.1+diemThi*0.7)*soTC)/SUM(MonHoc.soTC)\n"
                        + "FROM SinhVienDangKi, SinhVien, NguoiDung, MonHoc, LopHocPhan, HocKy\n"
                        + "WHERE SinhVienDangKi.ID_SV = SinhVien.ID\n"
                        + "AND SinhVien.ID_NguoiDung = NguoiDung.ID\n"
                        + "AND LopHocPhan.ID_MH = MonHoc.ID\n"
                        + "AND SinhVienDangKi.ID_LHP = LopHocPhan.ID\n"
                        + "AND HocKy.ID = LopHocPhan.ID_HocKy\n"
                        + "AND SinhVien.ID = '"+ID+"'\n"
                        + "AND HocKy.ID = '"+hk.getID()+"'\n"
                        + "AND diemTP1 IS NOT NULL AND diemTP2 IS NOT NULL AND diemTP3"
                        + " IS NOT NULL AND diemThi IS NOT NULL\n"
                        + "GROUP BY SinhVien.ID");
                if(rs1.next()){
                    double diemTBHocKy = Double.parseDouble(rs1.getString(2));
                    int soTCHocKy = rs1.getByte(1);
                    dsKetQuaSV.add(new SinhVienThongKe(diemTBHocKy, soTCHocKy, ID, ngaySinh, khoa, queQuan, diaChi, tenDayDu));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        Collections.sort(dsKetQuaSV, new Comparator<SinhVienThongKe>(){
            @Override
            public int compare(SinhVienThongKe o1, SinhVienThongKe o2) {
                if(o1.getDiemTBHocKy()>o2.getDiemTBHocKy())
                    return -1;
                if(o1.getDiemTBHocKy()<o2.getDiemTBHocKy())
                    return 1;
                return 0;
            }
        
        });
        return dsKetQuaSV;
    }
}
