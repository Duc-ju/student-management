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
public class MonHocThongKe extends MonHoc{
    private double diemTB;
    private double tiLeQuaMon;

    public MonHocThongKe(double diemTB, double tiLeQuaMon) {
        this.diemTB = diemTB;
        this.tiLeQuaMon = tiLeQuaMon;
    }

    public MonHocThongKe(double diemTB, double tiLeQuaMon, String ID, String tenMon, int soTinChi) {
        super(ID, tenMon, soTinChi);
        this.diemTB = diemTB;
        this.tiLeQuaMon = tiLeQuaMon;
    }

    public MonHocThongKe() {
    }

    public MonHocThongKe(String ID, String tenMon, int soTinChi) {
        super(ID, tenMon, soTinChi);
    }

    public double getDiemTB() {
        return diemTB;
    }

    public double getTiLeQuaMon() {
        return tiLeQuaMon;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void setTiLeQuaMon(double tiLeQuaMon) {
        this.tiLeQuaMon = tiLeQuaMon;
    }

}
