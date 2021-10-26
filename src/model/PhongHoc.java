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
public class PhongHoc {
    private String ID;
    private String tenPhong;
    private int tongSoChoNgoi;

    public PhongHoc() {
    }

    public PhongHoc(String ID, String tenPhong, int tongSoChoNgoi) {
        this.ID = ID;
        this.tenPhong = tenPhong;
        this.tongSoChoNgoi = tongSoChoNgoi;
    }

    public String getID() {
        return ID;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public int getTongSoChoNgoi() {
        return tongSoChoNgoi;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public void setTongSoChoNgoi(int tongSoChoNgoi) {
        this.tongSoChoNgoi = tongSoChoNgoi;
    }
    
}
