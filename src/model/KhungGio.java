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
public class KhungGio {
    private String ID;
    private int gioBatDau;
    private int gioKetThuc;
    private String ngayTrongTuan;

    public KhungGio() {
    }

    public KhungGio(String ID, int gioBatDau, int gioKetThuc, String ngayTrongTuan) {
        this.ID = ID;
        this.gioBatDau = gioBatDau;
        this.gioKetThuc = gioKetThuc;
        this.ngayTrongTuan = ngayTrongTuan;
    }

    public String getID() {
        return ID;
    }

    public int getGioBatDau() {
        return gioBatDau;
    }

    public int getGioKetThuc() {
        return gioKetThuc;
    }

    public String getNgayTrongTuan() {
        return ngayTrongTuan;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setGioBatDau(int gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public void setGioKetThuc(int gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }

    public void setNgayTrongTuan(String ngayTrongTuan) {
        this.ngayTrongTuan = ngayTrongTuan;
    }
    
}
