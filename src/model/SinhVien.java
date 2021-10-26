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
public class SinhVien extends NguoiDung{
    private String ID;
    private Date ngaySinh;
    private int khoa;
    private String queQuan;
    private String diaChi;
    public SinhVien(String ID, Date ngaySinh, int khoa, String queQuan, String diaChi, String tenDayDu) {
        super(tenDayDu);
        this.ID = ID;
        this.ngaySinh = ngaySinh;
        this.khoa = khoa;
        this.queQuan = queQuan;
        this.diaChi = diaChi;
    }

    public SinhVien(String ID, Date ngaySinh, int khoa, String queQuan, String diaChi) {
        this.ID = ID;
        this.ngaySinh = ngaySinh;
        this.khoa = khoa;
        this.queQuan = queQuan;
        this.diaChi = diaChi;
    }

    public SinhVien(String ID, Date ngaySinh, int khoa, String queQuan, String diaChi, int ID_NguoiDung, String taiKhoan, String matKhau, String tenDayDu, String viTri) {
        super(ID_NguoiDung, taiKhoan, matKhau, tenDayDu, viTri);
        this.ID = ID;
        this.ngaySinh = ngaySinh;
        this.khoa = khoa;
        this.queQuan = queQuan;
        this.diaChi = diaChi;
    }

    public SinhVien() {
    }

    public String getID() {
        return ID;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public int getKhoa() {
        return khoa;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
