/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.HocKyDAO;
import controller.SinhVienXemTKBDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.HocKy;
import model.LopHocPhan;
import model.PhongHocKhungGio;
import model.SinhVien;

/**
 *
 * @author Admin
 */
public class XemTKBFrm extends javax.swing.JFrame {
    private SinhVien sv;
    private List<HocKy> dsHocKy;
    private List<LopHocPhan> dsLopHocPhan;
    private DefaultTableModel thoiKhoaBieuTableModel;
    /**
     * Creates new form SinhVienXemTKB
     */
    public XemTKBFrm(SinhVien sv) {
        initComponents();
        this.sv = sv;
        thoiKhoaBieuTableModel = (DefaultTableModel) thoiKhoaBieuJTable.getModel();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        dsHocKy = new HocKyDAO().layDSHocKy();
        for(HocKy hk : dsHocKy){
            chonHocKyJComboBox.addItem(hk.getTenHocKy());
        } 
        
        hienThiTKB();
    }
    private void hienThiTKB(){
        HocKy hk = dsHocKy.get(chonHocKyJComboBox.getSelectedIndex());
        dsLopHocPhan = new SinhVienXemTKBDAO().layDSLopHocPhan(sv, hk);
        thoiKhoaBieuTableModel.setRowCount(0);
        for(int i=0; i<6; i++){
            List<String> list = new ArrayList<>();
            for(int j=0; j<7; j++){
                list.add("");
            }
            for(LopHocPhan lhp : dsLopHocPhan){
                List<PhongHocKhungGio> dsphHocKhungGio = lhp.getDsPhongHoc();
                for(PhongHocKhungGio phkg : dsphHocKhungGio){
                    String maKG = phkg.getKhungGio().getID();
                    String temp = ""+(i+1);
                    if(maKG.charAt(3)==temp.charAt(0)){
                        list.set(Integer.parseInt(""+maKG.charAt(1))-2, lhp.getMonHoc().getTenMon()
                                +" "+lhp.getTenLop()+" "+phkg.getPhongHoc().getTenPhong());
                    }
                }
            }
            thoiKhoaBieuTableModel.addRow(new Object[]{
            "Kíp "+(i+1),list.get(0),list.get(1),list.get(2),list.get(3),list.get(4),list.get(5),list.get(6)
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chonHocKiJLabel = new javax.swing.JLabel();
        chonHocKiJComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        thoiKhoaBieuJTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        tieuDeJLabel = new javax.swing.JLabel();
        chonHocKyJLabel = new javax.swing.JLabel();
        chonHocKyJComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        thoatJButton = new javax.swing.JButton();

        chonHocKiJLabel.setText("Chọn học kì");

        chonHocKiJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chonHocKiJComboBoxActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        thoiKhoaBieuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy", "Chủ nhật"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        thoiKhoaBieuJTable.setGridColor(new java.awt.Color(120, 120, 240));
        thoiKhoaBieuJTable.setRowHeight(46);
        thoiKhoaBieuJTable.setShowGrid(true);
        jScrollPane1.setViewportView(thoiKhoaBieuJTable);
        if (thoiKhoaBieuJTable.getColumnModel().getColumnCount() > 0) {
            thoiKhoaBieuJTable.getColumnModel().getColumn(0).setMinWidth(50);
            thoiKhoaBieuJTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jPanel1.setBackground(new java.awt.Color(120, 120, 240));

        tieuDeJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tieuDeJLabel.setForeground(new java.awt.Color(255, 255, 255));
        tieuDeJLabel.setText("Xem thời khóa biểu");

        chonHocKyJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chonHocKyJLabel.setForeground(new java.awt.Color(255, 255, 255));
        chonHocKyJLabel.setText("Chọn học kỳ");

        chonHocKyJComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chonHocKyJComboBox.setToolTipText("");
        chonHocKyJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chonHocKyJComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(chonHocKyJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chonHocKyJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(471, Short.MAX_VALUE)
                .addComponent(tieuDeJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(444, 444, 444))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(tieuDeJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chonHocKyJLabel)
                    .addComponent(chonHocKyJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(120, 120, 240));

        thoatJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        thoatJButton.setText("Thoát");
        thoatJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(thoatJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(506, 506, 506))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thoatJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chonHocKiJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chonHocKiJComboBoxActionPerformed

    }//GEN-LAST:event_chonHocKiJComboBoxActionPerformed

    private void chonHocKyJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chonHocKyJComboBoxActionPerformed
        hienThiTKB();
    }//GEN-LAST:event_chonHocKyJComboBoxActionPerformed

    private void thoatJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatJButtonActionPerformed
        this.setVisible(false);
        new GiaoDiemSinhVienFrm(sv).setVisible(true);
    }//GEN-LAST:event_thoatJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chonHocKiJComboBox;
    private javax.swing.JLabel chonHocKiJLabel;
    private javax.swing.JComboBox<String> chonHocKyJComboBox;
    private javax.swing.JLabel chonHocKyJLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton thoatJButton;
    private javax.swing.JTable thoiKhoaBieuJTable;
    private javax.swing.JLabel tieuDeJLabel;
    // End of variables declaration//GEN-END:variables
}
