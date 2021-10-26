/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class SinhVienThongKe extends SinhVien{
    private double diemTBHocKy;
    private int soTCHocKy;
    public SinhVienThongKe(String ID, Date ngaySinh, int khoa, String queQuan, String diaChi) {
        super(ID, ngaySinh, khoa, queQuan, diaChi);
    }

    public SinhVienThongKe(String ID, Date ngaySinh, int khoa, String queQuan, String diaChi, int ID_NguoiDung, String taiKhoan, String matKhau, String tenDayDu, String viTri) {
        super(ID, ngaySinh, khoa, queQuan, diaChi, ID_NguoiDung, taiKhoan, matKhau, tenDayDu, viTri);
    }

    public SinhVienThongKe() {
    }
    
    public SinhVienThongKe(double diemTBHocKy, int soTCHocKy, String ID, Date ngaySinh, int khoa, String queQuan, String diaChi) {
        super(ID, ngaySinh, khoa, queQuan, diaChi);
        this.diemTBHocKy = diemTBHocKy;
        this.soTCHocKy = soTCHocKy;
    }

    public SinhVienThongKe(double diemTBHocKy, int soTCHocKy, String ID, Date ngaySinh, int khoa, String queQuan, String diaChi, int ID_NguoiDung, String taiKhoan, String matKhau, String tenDayDu, String viTri) {
        super(ID, ngaySinh, khoa, queQuan, diaChi, ID_NguoiDung, taiKhoan, matKhau, tenDayDu, viTri);
        this.diemTBHocKy = diemTBHocKy;
        this.soTCHocKy = soTCHocKy;
    }

    public SinhVienThongKe(double diemTBHocKy, int soTCHocKy) {
        this.diemTBHocKy = diemTBHocKy;
        this.soTCHocKy = soTCHocKy;
    }

    public SinhVienThongKe(double diemTBHocKy, int soTCHocKy, String ID, Date ngaySinh, int khoa, String queQuan, String diaChi, String tenDayDu) {
        super(ID, ngaySinh, khoa, queQuan, diaChi, tenDayDu);
        this.diemTBHocKy = diemTBHocKy;
        this.soTCHocKy = soTCHocKy;
    }

    public double getDiemTBHocKy() {
        return diemTBHocKy;
    }

    public int getSoTCHocKy() {
        return soTCHocKy;
    }

    public void setDiemTBHocKy(double diemTBHocKy) {
        this.diemTBHocKy = diemTBHocKy;
    }

    public void setSoTCHocKy(int soTCHocKy) {
        this.soTCHocKy = soTCHocKy;
    }
    
}
