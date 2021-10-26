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
public class NguoiDung {
    private int ID_NguoiDung;
    private String taiKhoan;
    private String matKhau;
    private String tenDayDu;
    private String viTri;

    public NguoiDung() {
    }

    public NguoiDung(int ID_NguoiDung, String taiKhoan, String matKhau, String tenDayDu, String viTri) {
        this.ID_NguoiDung = ID_NguoiDung;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.tenDayDu = tenDayDu;
        this.viTri = viTri;
    }

    public NguoiDung(String tenDayDu) {
        this.tenDayDu = tenDayDu;
    }

    public int getID_NguoiDung() {
        return ID_NguoiDung;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getTenDayDu() {
        return tenDayDu;
    }

    public String getViTri() {
        return viTri;
    }

    public void setID_NguoiDung(int ID_NguoiDung) {
        this.ID_NguoiDung = ID_NguoiDung;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setTenDayDu(String tenDayDu) {
        this.tenDayDu = tenDayDu;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

}
