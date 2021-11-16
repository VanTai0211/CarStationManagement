/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.MienTrung;

import Controller.DAOMienTrung;
import Model.MienTrung;
import View.Main.main_screen;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hvt02
 */
public class MT_ManagerCar extends javax.swing.JFrame {

    /**
     * Creates new form main_mtrung
     */
    private List<MienTrung> mientrung;
    private DefaultTableModel Model;
    int SelecteđIndex;
    public MT_ManagerCar() {
        initComponents();
        this.setLocationRelativeTo(null);
        Model = (DefaultTableModel)tbMienTrung.getModel();
        showTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenHang = new javax.swing.JTextField();
        txtBienSo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxBaiXe = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtDiTu = new javax.swing.JTextField();
        txtNgayVao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtDenBen = new javax.swing.JComboBox<>();
        btnRefest = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMienTrung = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Quản lý chuyến xe");

        jPanel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel1.setText("Hãng xe");

        jLabel3.setText("Biển số");

        jLabel4.setText("Bãi xe");

        cbxBaiXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(B1) Bãi 1", "(B2) Bãi 2", "(B3) Bãi 3", "(B4) Bãi 4", "(B5) Bãi 5", "(B6) Bãi 6", "(B7) Bãi 7", "(B8) Bãi 8", "(B9) Bãi 9 " }));
        cbxBaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBaiXeActionPerformed(evt);
            }
        });

        jLabel5.setText("Đi từ");

        jLabel6.setText("Đến bến");

        jLabel7.setText("Ngày vào");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jButton1.setText("quay lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtDenBen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(MVC) Miền Viễn Châu", "(MĐH) Miền Đất Hứa", "(MNMK) Miền Này Miền Kia" }));

        btnRefest.setText("Làm mới");
        btnRefest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefestActionPerformed(evt);
            }
        });

        btnFind.setText("Tìm kiếm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenHang)
                    .addComponent(txtDiTu)
                    .addComponent(txtNgayVao, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRefest, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBienSo)
                                    .addComponent(txtDenBen, 0, 166, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(cbxBaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbxBaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(txtDenBen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDiTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNgayVao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(btnXoa))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnRefest)
                    .addComponent(btnFind))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tbMienTrung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Hãng Xe", "Biển Số", "Bãi Xe", "Đi Từ", "Đến Bến", "Ngày Vào"
            }
        ));
        tbMienTrung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMienTrungMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMienTrung);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        main_screen l = new main_screen();
        l.setLocationRelativeTo(null);
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxBaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBaiXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBaiXeActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        MienTrung mt =new MienTrung();
        mt.setTenHang(txtTenHang.getText());
        mt.setBienSo(txtBienSo.getText());
        mt.setBaiXe(cbxBaiXe.getSelectedItem().toString());
        mt.setDiTu(txtDiTu.getText());
        mt.setDenBen(txtDenBen.getSelectedItem().toString());
        mt.setNgayVao(txtNgayVao.getText());
        if(txtTenHang.getText().equals("") || txtBienSo.getText().equals("") || txtDiTu.getText().equals("")|| txtNgayVao.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Thông tin không được để trống");
        }else {
            new DAOMienTrung().AddCar(mt);
            showTable();
            JOptionPane.showMessageDialog(this, "Thêm Thành Công");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnRefestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefestActionPerformed
        txtTenHang.setText("");
        txtBienSo.setText("");
        txtDiTu.setText("");
        txtNgayVao.setText("");
        showTable();
    }//GEN-LAST:event_btnRefestActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        SelecteđIndex = tbMienTrung.getSelectedRow();
        MienTrung mt = mientrung.get(SelecteđIndex);
        JOptionPane.showConfirmDialog(this,"Bạn có chắc muốn xóa" +mt.getTenHang() + "ra khỏi danh sách?");
        new DAOMienTrung().DeleteCar(mt.getId());
        showTable();
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tbMienTrungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMienTrungMouseClicked
        SelecteđIndex = tbMienTrung.getSelectedRow();
        MienTrung mt = mientrung.get(SelecteđIndex);
        txtTenHang.setText(mt.getTenHang());
        txtBienSo.setText(mt.getBienSo());
        cbxBaiXe.setSelectedItem(mt.getBaiXe());
        txtDiTu.setText(mt.getDiTu());
        txtDenBen.setSelectedItem(mt.getDenBen());
        txtNgayVao.setText(mt.getNgayVao());
    }//GEN-LAST:event_tbMienTrungMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        SelecteđIndex = tbMienTrung.getSelectedRow();
        MienTrung m = mientrung.get(SelecteđIndex);
        new DAOMienTrung().DeleteCar(m.getId());
        if(mientrung.isEmpty()){
            JOptionPane.showMessageDialog(this, "Không có dữ liệu để sửa");
        }else if(SelecteđIndex == -1){
            JOptionPane.showMessageDialog(this, "Hãy chọn dữ liệu để sửa");
        }else{
            MienTrung mt =new MienTrung();
            mt.setTenHang(txtTenHang.getText());
            mt.setBienSo(txtBienSo.getText());
            mt.setBaiXe(cbxBaiXe.getSelectedItem().toString());
            mt.setDiTu(txtDiTu.getText());
            mt.setDenBen(txtDenBen.getSelectedItem().toString());
            mt.setNgayVao(txtNgayVao.getText());
            if(txtTenHang.getText().equals("") || txtBienSo.getText().equals("") || txtDiTu.getText().equals("")|| txtNgayVao.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Thông tin không được để trống");
            }else {
                new DAOMienTrung().AddCar(mt);
                showTable();
                JOptionPane.showMessageDialog(this, "Sửa Thành Công");
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String Name = txtTenHang.getText();
        if(Name.length() > 0){
            mientrung = new DAOMienTrung().findbyName(Name);
             Model.setRowCount(0);
            for(MienTrung mt:mientrung){
                Model.addRow(new Object[]{
                tbMienTrung.getRowCount()+1,mt.getTenHang(),mt.getBienSo(),mt.getBaiXe(),mt.getDiTu(),mt.getDenBen(),mt.getNgayVao()
            });
        }
        }
    }//GEN-LAST:event_btnFindActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MT_ManagerCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MT_ManagerCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MT_ManagerCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MT_ManagerCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MT_ManagerCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnRefest;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxBaiXe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMienTrung;
    private javax.swing.JTextField txtBienSo;
    private javax.swing.JComboBox<String> txtDenBen;
    private javax.swing.JTextField txtDiTu;
    private javax.swing.JTextField txtNgayVao;
    private javax.swing.JTextField txtTenHang;
    // End of variables declaration//GEN-END:variables

    private void showTable() {
        mientrung = (List<MienTrung>) new DAOMienTrung().getListMT();
        Model.setRowCount(0);
        for(MienTrung mt:mientrung){
            Model.addRow(new Object[]{
            tbMienTrung.getRowCount()+1,mt.getTenHang(),mt.getBienSo(),mt.getBaiXe(),mt.getDiTu(),mt.getDenBen(),mt.getNgayVao()
            });
        }
    }
}
