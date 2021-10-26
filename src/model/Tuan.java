/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Tuan {
    private int ID;
    private Date ngayBD;
    private Date ngayKT;

    public Tuan(int ID, Date ngayBD, Date ngayKT) {
        this.ID = ID;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    public Tuan() {
    }

    public int getID() {
        return ID;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }
    
}
