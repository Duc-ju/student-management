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
public class MonHoc {
    private String ID;
    private String tenMon;
    private int soTinChi;
    private MonHoc monTQ[];
    public MonHoc() {
    }

    public MonHoc(String ID, String tenMon, int soTinChi) {
        this.ID = ID;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public String getID() {
        return ID;
    }

    public String getTenMon() {
        return tenMon;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public MonHoc(String ID, String tenMon, int soTinChi, MonHoc[] monTQ) {
        this.ID = ID;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
        this.monTQ = monTQ;
    }

    public MonHoc[] getMonTQ() {
        return monTQ;
    }

    public void setMonTQ(MonHoc[] monTQ) {
        this.monTQ = monTQ;
    }
    
}
