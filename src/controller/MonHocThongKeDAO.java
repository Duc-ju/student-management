/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import model.MonHocThongKe;

/**
 *
 * @author Admin
 */
public class MonHocThongKeDAO extends DAO{
    public List<MonHocThongKe> layDSMHTK(){
        List<MonHocThongKe> list = new ArrayList<>();
        try {
            Statement statement = con.createStatement();
            ResultSet rs= statement.executeQuery("SELECT *\n" +
                        "FROM MonHoc");
            while (rs.next()) {
                MonHocThongKe mon = new MonHocThongKe();
                mon.setID(rs.getString(1));
                mon.setTenMon(rs.getString(2));
                mon.setSoTinChi(rs.getInt(3));
                Statement statement1 = con.createStatement();
                ResultSet rs1 = statement1.executeQuery("Select AVG(diemTP1*0.1+"
                        + "diemTP2*0.1+diemTP3*0.1+diemThi*0.7) as diemTrungBinh\n"
                        + "from SinhVienDangKi, MonHoc, LopHocPhan\n"
                        + "where SinhVienDangKi.ID_LHP = LopHocPhan.ID\n"
                        + "And LopHocPhan.ID_MH = MonHoc.ID\n"
                        + "And MonHoc.ID='"+mon.getID()+"'\n"
                        + "Group by MonHoc.ID");
                double diemTB=-1;
                if(rs1.next())
                    diemTB = Double.parseDouble(rs1.getString(1));
                mon.setDiemTB(diemTB);
                Statement statement2 = con.createStatement();
                ResultSet rs2 = statement2.executeQuery("Select Count"
                        + "(SinhVienDangKi.ID_SV) as soSinhVienDangKi\n"
                        + "from SinhVienDangKi, MonHoc, LopHocPhan\n"
                        + "where SinhVienDangKi.ID_LHP = LopHocPhan.ID\n"
                        + "And LopHocPhan.ID_MH = MonHoc.ID\n"
                        + "AND diemTP1 is not null AND diemTP2 is not null AND"
                        + " diemTP3 is not null AND diemThi is not null\n"
                        + "And MonHoc.ID='"+mon.getID()+"'\n"
                        + "Group by MonHoc.ID");
                int soSV = 0;
                if (rs2.next())
                    soSV = Integer.parseInt(rs2.getString(1));
                Statement statement3 = con.createStatement();
                ResultSet rs3 = statement3.executeQuery("Select Count(diemTP1*0.1"
                        + "+diemTP2*0.1+diemTP3*0.1+diemThi*0.7) as soSinhVienQua\n"
                        + "from SinhVienDangKi, MonHoc, LopHocPhan\n"
                        + "where SinhVienDangKi.ID_LHP = LopHocPhan.ID\n"
                        + "And LopHocPhan.ID_MH = MonHoc.ID\n"
                        + "AND diemTP1 is not null AND diemTP2 is not null AND diemTP3 "
                        + "is not null AND diemThi is not null\n"
                        + "And (diemTP1*0.1+diemTP2*0.1+diemTP3*0.1+diemThi*0.7)>4.0\n"
                        + "And MonHoc.ID='" + mon.getID() + "'\n"
                        + "Group by MonHoc.ID");
                int soSVQua = 0;
                if (rs3.next())
                    soSVQua = Integer.parseInt(rs3.getString(1));
                double tiLeQuaMon = -1;
                if(soSV!=0){
                    tiLeQuaMon = soSVQua*1.0/soSV*100.0;
                }
                mon.setTiLeQuaMon(tiLeQuaMon);
                list.add(mon);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        Collections.sort(list, new Comparator<MonHocThongKe>(){
            @Override
            public int compare(MonHocThongKe o1, MonHocThongKe o2) {
                if(o1.getTiLeQuaMon()>o2.getTiLeQuaMon())
                    return -1;
                if(o1.getTiLeQuaMon()<o2.getTiLeQuaMon())
                    return 1;
                return 0;
            }
        
        });
        return list;
    }
}
