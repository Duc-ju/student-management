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
public class GiangVien extends NguoiDung{
    private String ID;
    private String maGV;
    private String trinhDo;

    public GiangVien(String ID, String maGV, String trinhDo) {
        this.ID = ID;
        this.maGV = maGV;
        this.trinhDo = trinhDo;
    }

    public GiangVien(String ID, String maGV, String trinhDo, int ID_NguoiDung, String taiKhoan, String matKhau, String tenDayDu, String viTri) {
        super(ID_NguoiDung, taiKhoan, matKhau, tenDayDu, viTri);
        this.ID = ID;
        this.maGV = maGV;
        this.trinhDo = trinhDo;
    }

    public GiangVien() {
    }

    public GiangVien(String tenDayDu) {
        super(tenDayDu);
    }
    
}
