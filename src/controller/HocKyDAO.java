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
import java.util.List;
import model.HocKy;

/**
 *
 * @author Admin
 */
public class HocKyDAO extends DAO{
    public List<HocKy> layDSHocKy() {
        List<HocKy> listkq = new ArrayList<>();
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT *\n"
                    + "FROM HocKy");
            while (rs.next()) {
                int ID = rs.getInt(1);
                String tenHocKy = rs.getString(2);
                listkq.add(new HocKy(ID, tenHocKy));
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return listkq;
    }
}
