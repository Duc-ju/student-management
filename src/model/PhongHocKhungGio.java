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
public class PhongHocKhungGio {
    private PhongHoc phongHoc;
    private KhungGio khungGio;

    public PhongHocKhungGio() {
    }

    public PhongHocKhungGio(PhongHoc phongHoc, KhungGio khungGio) {
        this.phongHoc = phongHoc;
        this.khungGio = khungGio;
    }

    public PhongHoc getPhongHoc() {
        return phongHoc;
    }

    public KhungGio getKhungGio() {
        return khungGio;
    }

    public void setPhongHoc(PhongHoc phongHoc) {
        this.phongHoc = phongHoc;
    }

    public void setKhungGio(KhungGio khungGio) {
        this.khungGio = khungGio;
    }
    
}
