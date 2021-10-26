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
public class HocKy {
    private int ID;
    private String tenHocKy;
    private Tuan[] dsTuan;

    public HocKy(int ID, String tenHocKy) {
        this.ID = ID;
        this.tenHocKy = tenHocKy;
    }

    public HocKy(int ID, String tenHocKy, Tuan[] dsTuan) {
        this.ID = ID;
        this.tenHocKy = tenHocKy;
        this.dsTuan = dsTuan;
    }

    public HocKy() {
    }

    public int getID() {
        return ID;
    }

    public String getTenHocKy() {
        return tenHocKy;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTenHocKy(String tenHocKy) {
        this.tenHocKy = tenHocKy;
    }

    public Tuan[] getDsTuan() {
        return dsTuan;
    }

    public void setDsTuan(Tuan[] dsTuan) {
        this.dsTuan = dsTuan;
    }
    
}
