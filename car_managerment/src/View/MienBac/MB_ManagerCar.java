/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.MienBac;

import View.MienBac.*;
import Controller.DAOMienBac;
import Model.MienBac;
import View.Main.main_screen;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hvt02
 */
public class MB_ManagerCar extends javax.swing.JFrame {

    /**
     * Creates new form main_mtrung
     */
    private List<MienBac> mienbac;
    private DefaultTableModel Model;
    int SelecteđIndex;
    public MB_ManagerCar() {
        initComponents();
        this.setLocationRelativeTo(null);
        Model = (DefaultTableModel)tbMienBac.getModel();
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
        btnldc = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMienBac = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hinh/Hinh/Numbered list.png"))); // NOI18N
        jLabel2.setText("Quản lý chuyến xe");

        jPanel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel1.setText("Hãng xe");

        jLabel3.setText("Biển số");

        jLabel4.setText("Bãi xe");

        cbxBaiXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbxBaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBaiXeActionPerformed(evt);
            }
        });

        jLabel5.setText("Đi từ");

        jLabel6.setText("Đến bến");

        jLabel7.setText("Ngày vào");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hinh/Hinh/Create.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hinh/Hinh/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hinh/Hinh/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hinh/Home.png"))); // NOI18N
        jButton1.setText("quay lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtDenBen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(HD-TN)Hải Dương - Thái Nguyên", "(TN-YL)Thái Nguyên - Yên Lập", "(TB-TN)Thái Bình - Thái Nguyên", "(ND-TN)Nam Định - Thái Nguyên", "(HN-MC)Hà Nội - Móng Cái" }));

        btnRefest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hinh/Refresh.png"))); // NOI18N
        btnRefest.setText("Làm mới");
        btnRefest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefestActionPerformed(evt);
            }
        });

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hinh/Hinh/Search.png"))); // NOI18N
        btnFind.setText("Tìm kiếm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnldc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hinh/Hinh/Calendar.png"))); // NOI18N
        btnldc.setText("Lịch di chuyển");
        btnldc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnldcActionPerformed(evt);
            }
        });

        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hinh/Hinh/Open file.png"))); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDenBen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRefest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxBaiXe, 0, 134, Short.MAX_VALUE)
                    .addComponent(btnldc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(btnXoa)
                            .addComponent(btnThongKe))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnRefest)
                    .addComponent(btnFind)
                    .addComponent(btnldc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbMienBac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Hãng Xe", "Biển Số", "Bãi Xe", "Đi Từ", "Đến Bến", "Ngày Vào"
            }
        ));
        tbMienBac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMienBacMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMienBac);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
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
        MienBac mt =new MienBac();
        mt.setTenHang(txtTenHang.getText());
        mt.setBienSo(txtBienSo.getText());
        mt.setBaiXe(cbxBaiXe.getSelectedItem().toString());
        mt.setDiTu(txtDiTu.getText());
        mt.setDenBen(txtDenBen.getSelectedItem().toString());
        mt.setNgayVao(txtNgayVao.getText());
        if(txtTenHang.getText().equals("") || txtBienSo.getText().equals("") || txtDiTu.getText().equals("")|| txtNgayVao.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Thông tin không được để trống");
        }else {
            new DAOMienBac().AddCar(mt);
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
        SelecteđIndex = tbMienBac.getSelectedRow();
        MienBac mt = mienbac.get(SelecteđIndex);
        JOptionPane.showConfirmDialog(this,"Bạn có chắc muốn xóa" +mt.getTenHang() + "ra khỏi danh sách?");
        new DAOMienBac().DeleteCar(mt.getId());
        showTable();
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tbMienBacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMienBacMouseClicked
        SelecteđIndex = tbMienBac.getSelectedRow();
        MienBac mt = mienbac.get(SelecteđIndex);
        txtTenHang.setText(mt.getTenHang());
        txtBienSo.setText(mt.getBienSo());
        cbxBaiXe.setSelectedItem(mt.getBaiXe());
        txtDiTu.setText(mt.getDiTu());
        txtDenBen.setSelectedItem(mt.getDenBen());
        txtNgayVao.setText(mt.getNgayVao());
    }//GEN-LAST:event_tbMienBacMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        SelecteđIndex = tbMienBac.getSelectedRow();
        MienBac m = mienbac.get(SelecteđIndex);
        new DAOMienBac().DeleteCar(m.getId());
        if(mienbac.isEmpty()){
            JOptionPane.showMessageDialog(this, "Không có dữ liệu để sửa");
        }else if(SelecteđIndex == -1){
            JOptionPane.showMessageDialog(this, "Hãy chọn dữ liệu để sửa");
        }else{
            MienBac mt =new MienBac();
            mt.setTenHang(txtTenHang.getText());
            mt.setBienSo(txtBienSo.getText());
            mt.setBaiXe(cbxBaiXe.getSelectedItem().toString());
            mt.setDiTu(txtDiTu.getText());
            mt.setDenBen(txtDenBen.getSelectedItem().toString());
            mt.setNgayVao(txtNgayVao.getText());
            if(txtTenHang.getText().equals("") || txtBienSo.getText().equals("") || txtDiTu.getText().equals("")|| txtNgayVao.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Thông tin không được để trống");
            }else {
                new DAOMienBac().AddCar(mt);
                showTable();
                JOptionPane.showMessageDialog(this, "Sửa Thành Công");
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String Name = txtTenHang.getText();        
            if(Name.length() > 0){
                mienbac = new DAOMienBac().findbyName(Name);
                 Model.setRowCount(0);
                for(MienBac mt:mienbac){
                    Model.addRow(new Object[]{
                    tbMienBac.getRowCount()+1,mt.getTenHang(),mt.getBienSo(),mt.getBaiXe(),mt.getDiTu(),mt.getDenBen(),mt.getNgayVao()
                });
            }
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnldcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnldcActionPerformed
        MB_ManagerCalendar l = new MB_ManagerCalendar();
        l.setLocationRelativeTo(null);
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnldcActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        MB_ThongKeCar l = new MB_ThongKeCar();
        l.setLocationRelativeTo(null);
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThongKeActionPerformed

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
            java.util.logging.Logger.getLogger(MB_ManagerCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MB_ManagerCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MB_ManagerCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MB_ManagerCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MB_ManagerCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnRefest;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnldc;
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
    private javax.swing.JTable tbMienBac;
    private javax.swing.JTextField txtBienSo;
    private javax.swing.JComboBox<String> txtDenBen;
    private javax.swing.JTextField txtDiTu;
    private javax.swing.JTextField txtNgayVao;
    private javax.swing.JTextField txtTenHang;
    // End of variables declaration//GEN-END:variables

    private void showTable() {
        mienbac = (List<MienBac>) new DAOMienBac().getListMT();
        Model.setRowCount(0);
        for(MienBac mt:mienbac){
            Model.addRow(new Object[]{
            tbMienBac.getRowCount()+1,mt.getTenHang(),mt.getBienSo(),mt.getBaiXe(),mt.getDiTu(),mt.getDenBen(),mt.getNgayVao()
            });
        }
    }
}