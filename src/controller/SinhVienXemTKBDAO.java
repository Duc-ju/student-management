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
import model.GiangVien;
import model.HocKy;
import model.KhungGio;
import model.LopHocPhan;
import model.MonHoc;
import model.PhongHoc;
import model.PhongHocKhungGio;
import model.SinhVien;

/**
 *
 * @author Admin
 */
public class SinhVienXemTKBDAO extends DAO {

    public List<LopHocPhan> layDSLopHocPhan(SinhVien sv, HocKy hk) {
        List<LopHocPhan> dsLopHocPhan = new ArrayList<>();
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT DISTINCT LopHocPhan.ID, LopHocPhan.tenLop, NguoiDung.tenDayDu, MonHoc.*\n"
                    + "FROM LopHocPhan, NguoiDung, GiangVien, MonHoc, PhongHocKhungGio, HocKy, SinhVien, SinhVienDangKi\n"
                    + "WHERE LopHocPhan.ID_MH = MonHoc.ID\n"
                    + "AND PhongHocKhungGio.ID_LHP = LopHocPhan.ID\n"
                    + "AND LopHocPhan.ID_GV = GiangVien.ID\n"
                    + "AND GiangVien.ID_NguoiDung = NguoiDung.ID\n"
                    + "AND LopHocPhan.ID_HocKy = HocKy.ID\n"
                    + "AND HocKy.ID = '"+hk.getID()+"'\n"
                    + "AND LopHocPhan.ID = SinhVienDangKi.ID_LHP\n"
                    + "AND SinhVienDangKi.ID_SV = SinhVien.ID\n"
                    + "AND SinhVien.ID = '"+sv.getID()+"'");
            while (rs.next()) {
                int ID = rs.getInt(1);
                String tenLop = rs.getString(2);
                String tenGV = rs.getString(3);
                GiangVien gv = new GiangVien(tenGV);
                String ID_MH = rs.getString(4);
                String tenMH = rs.getString(5);
                int soTC = rs.getInt(6);
                MonHoc mh = new MonHoc(ID_MH, tenMH, soTC);
                Statement statement1 = con.createStatement();
                ResultSet rs1 = statement1.executeQuery("SELECT PhongHoc.*, KhungGio.*\n"
                        + "FROM PhongHocKhungGio, PhongHoc, KhungGio, LopHocPhan\n"
                        + "WHERE PhongHocKhungGio.ID_LHP = LopHocPhan.ID\n"
                        + "AND PhongHoc.ID = PhongHocKhungGio.ID_PH\n"
                        + "AND KhungGio.ID = PhongHocKhungGio.ID_KG\n"
                        + "AND LopHocPhan.ID = "+ID);
                List<PhongHocKhungGio> dsPhongHocKhungGio = new ArrayList<>();
                while (rs1.next()) {
                    String ID_Phong = rs1.getString(1);
                    String tenPhong = rs1.getString(2);
                    int soCho = rs1.getInt(3);
                    PhongHoc p = new PhongHoc(ID_Phong, tenPhong, soCho);
                    String ID_KG = rs1.getString(4);
                    int gioBD = rs1.getInt(5);
                    int gioKT = rs1.getInt(6);
                    String ngayTrongTuan = rs1.getString(7);
                    KhungGio kh = new KhungGio(ID_KG, gioBD, gioKT, ngayTrongTuan);
                    dsPhongHocKhungGio.add(new PhongHocKhungGio(p, kh));
                }
                dsLopHocPhan.add(new LopHocPhan(ID, mh, gv, tenLop, dsPhongHocKhungGio));
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return dsLopHocPhan;
    }
}
