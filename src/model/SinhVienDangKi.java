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
public class SinhVienDangKi {
    private int ID;
    private SinhVien sinhVien;
    private double diemTP1;
    private double diemTP2;
    private double diemTP3;
    private double diemThi;

    public SinhVienDangKi() {
    }

    public SinhVienDangKi(int ID, SinhVien sinhVien, double diemTP1, double diemTP2, double diemTP3, double diemThi) {
        this.ID = ID;
        this.sinhVien = sinhVien;
        this.diemTP1 = diemTP1;
        this.diemTP2 = diemTP2;
        this.diemTP3 = diemTP3;
        this.diemThi = diemThi;
    }

    public int getID() {
        return ID;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public double getDiemTP1() {
        return diemTP1;
    }

    public double getDiemTP2() {
        return diemTP2;
    }

    public double getDiemTP3() {
        return diemTP3;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public void setDiemTP1(double diemTP1) {
        this.diemTP1 = diemTP1;
    }

    public void setDiemTP2(double diemTP2) {
        this.diemTP2 = diemTP2;
    }

    public void setDiemTP3(double diemTP3) {
        this.diemTP3 = diemTP3;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }
    

}
