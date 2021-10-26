/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Admin
 */
public class LopHocPhan {
    private int ID;
    private MonHoc monHoc;
    private GiangVien giangVien;
    private String tenLop;
    private int soSV;
    private HocKy hocKy;
    private List<PhongHocKhungGio> dsPhongHoc;
    private List<SinhVienDangKi> dsSinhVien;

    public LopHocPhan() {
    }

    public LopHocPhan(int ID, MonHoc monHoc, GiangVien giangVien, String tenLop, List<PhongHocKhungGio> dsPhongHoc) {
        this.ID = ID;
        this.monHoc = monHoc;
        this.giangVien = giangVien;
        this.tenLop = tenLop;
        this.dsPhongHoc = dsPhongHoc;
    }

    public LopHocPhan(int ID, MonHoc monHoc, GiangVien giangVien, String tenLop, int soSV, HocKy hocKy, List<PhongHocKhungGio> dsPhongHoc, List<SinhVienDangKi> dsSinhVien) {
        this.ID = ID;
        this.monHoc = monHoc;
        this.giangVien = giangVien;
        this.tenLop = tenLop;
        this.soSV = soSV;
        this.hocKy = hocKy;
        this.dsPhongHoc = dsPhongHoc;
        this.dsSinhVien = dsSinhVien;
    }

    public int getID() {
        return ID;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public GiangVien getGiangVien() {
        return giangVien;
    }

    public String getTenLop() {
        return tenLop;
    }

    public int getSoSV() {
        return soSV;
    }

    public HocKy getHocKy() {
        return hocKy;
    }

    public List<PhongHocKhungGio> getDsPhongHoc() {
        return dsPhongHoc;
    }

    public List<SinhVienDangKi> getDsSinhVien() {
        return dsSinhVien;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }

    public void setGiangVien(GiangVien giangVien) {
        this.giangVien = giangVien;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }

    public void setHocKy(HocKy hocKy) {
        this.hocKy = hocKy;
    }

    public void setDsPhongHoc(List<PhongHocKhungGio> dsPhongHoc) {
        this.dsPhongHoc = dsPhongHoc;
    }

    public void setDsSinhVien(List<SinhVienDangKi> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }

 
}
