/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class SinhVienDangKiThongKe extends SinhVienDangKi{
    private double diemTB;
    private String tenMH;
    private int soTC;
    public SinhVienDangKiThongKe() {
    }

    public SinhVienDangKiThongKe(double diemTB) {
        this.diemTB = diemTB;
    }

    public SinhVienDangKiThongKe(double diemTB, String tenMH, int soTC) {
        this.diemTB = diemTB;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    public SinhVienDangKiThongKe(double diemTB, String tenMH, int soTC, int ID, SinhVien sinhVien, double diemTP1, double diemTP2, double diemTP3, double diemThi) {
        super(ID, sinhVien, diemTP1, diemTP2, diemTP3, diemThi);
        this.diemTB = diemTB;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    public SinhVienDangKiThongKe(double diemTB, int ID, SinhVien sinhVien, double diemTP1, double diemTP2, double diemTP3, double diemThi) {
        super(ID, sinhVien, diemTP1, diemTP2, diemTP3, diemThi);
        this.diemTB = diemTB;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }


}
