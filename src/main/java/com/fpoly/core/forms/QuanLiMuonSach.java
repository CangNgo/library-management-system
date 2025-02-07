/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.fpoly.core.forms;
import com.fpoly.core.DAO.PhieuMuonDAO;
import com.fpoly.core.utils.MsgBox;
import com.fpoly.core.models.PhieuMuon;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author WELCOME
 */
public class QuanLiMuonSach extends javax.swing.JDialog {

    PhieuMuonDAO dao = new PhieuMuonDAO();
    int row =0;
    
    
    
    public QuanLiMuonSach(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        fillToTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        nútuakhachmuon = new javax.swing.JButton();
        nutluukhachmuon = new javax.swing.JButton();
        nutthemkhach = new javax.swing.JButton();
        nuthuy5 = new javax.swing.JButton();
        nutxoakhachmuon = new javax.swing.JButton();
        txtNgayHenTra = new javax.swing.JTextField();
        txtMaPM = new javax.swing.JTextField();
        txtMaDG = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        banghienthiphieumuon = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        txtseach = new javax.swing.JTextField();
        btnseach = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        btnXuatPhieuMuon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnXuatPT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTinhTrang = new javax.swing.JTextField();
        txtNgayMuon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtThanhToan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        nútuakhachmuon.setText("Sửa TT mượn");
        nútuakhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nútuakhachmuonActionPerformed(evt);
            }
        });

        nutluukhachmuon.setText("Lưu");
        nutluukhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutluukhachmuonActionPerformed(evt);
            }
        });

        nutthemkhach.setText("Thêm TT mượn");
        nutthemkhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutthemkhachActionPerformed(evt);
            }
        });

        nuthuy5.setText("Hủy");
        nuthuy5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy5ActionPerformed(evt);
            }
        });

        nutxoakhachmuon.setText("Xóa TT ");
        nutxoakhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutxoakhachmuonActionPerformed(evt);
            }
        });

        txtNgayHenTra.setText(" ");
        txtNgayHenTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayHenTraActionPerformed(evt);
            }
        });

        txtMaPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPMActionPerformed(evt);
            }
        });

        txtMaDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaDGActionPerformed(evt);
            }
        });

        jLabel33.setText("Mã đọc giả");

        jLabel34.setText("Mã phiếu mượn");

        jLabel35.setText("Ngày hẹn trả");

        banghienthiphieumuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu mượn", "Ngày mượn", "Ngày hẹn trả", "Tình trạng ", "Thanh toán", "Mã đọc giả ", "Mã NV"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        banghienthiphieumuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                banghienthiphieumuonMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(banghienthiphieumuon);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Seach");

        btnseach.setText("Tìm");
        btnseach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseachActionPerformed(evt);
            }
        });

        jLabel37.setText("Tìm Mã DG");

        btnXuatPhieuMuon.setText("Xuất phiếu mượn");
        btnXuatPhieuMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatPhieuMuonActionPerformed(evt);
            }
        });

        jLabel1.setText("20/03/2023");

        btnXuatPT.setText("Xuất phiếu trả");
        btnXuatPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatPTActionPerformed(evt);
            }
        });

        jLabel2.setText("Tình trạng");

        jLabel3.setText("Ngày mượn");

        txtTinhTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTinhTrangActionPerformed(evt);
            }
        });

        txtNgayMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayMuonActionPerformed(evt);
            }
        });

        jLabel4.setText("Thanh toán");

        jLabel5.setText("Mã NV");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel33))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaPM, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel37)
                                .addGap(18, 18, 18)
                                .addComponent(txtseach, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(btnseach)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addComponent(nutthemkhach, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(nuthuy5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nútuakhachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNgayHenTra, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(398, 398, 398))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(nutluukhachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(btnXuatPT, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXuatPhieuMuon)
                            .addComponent(nutxoakhachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel37)
                            .addComponent(txtseach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnseach)
                            .addComponent(nutthemkhach))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(txtMaPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nútuakhachmuon)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nuthuy5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(txtThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayHenTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel35)
                                .addComponent(jLabel5)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(nutluukhachmuon)
                        .addGap(18, 18, 18)
                        .addComponent(nutxoakhachmuon)
                        .addGap(59, 59, 59)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXuatPT)
                            .addComponent(btnXuatPhieuMuon))))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nútuakhachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nútuakhachmuonActionPerformed
        update();
    }//GEN-LAST:event_nútuakhachmuonActionPerformed

    private void nutluukhachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutluukhachmuonActionPerformed
      update();
    }//GEN-LAST:event_nutluukhachmuonActionPerformed

    private void nutthemkhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutthemkhachActionPerformed
        insert();
    }//GEN-LAST:event_nutthemkhachActionPerformed

    private void nuthuy5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuthuy5ActionPerformed
       
    }//GEN-LAST:event_nuthuy5ActionPerformed

    private void btnseachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseachActionPerformed
        search();
    }//GEN-LAST:event_btnseachActionPerformed

    private void txtNgayHenTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayHenTraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayHenTraActionPerformed

    private void btnXuatPhieuMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatPhieuMuonActionPerformed
        // TODO add your handling code here:
        exportBorrowReceipt();
        
        
    }//GEN-LAST:event_btnXuatPhieuMuonActionPerformed

    private void txtTinhTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTinhTrangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTinhTrangActionPerformed

    private void txtMaPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPMActionPerformed

    private void txtMaDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaDGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaDGActionPerformed

    private void txtNgayMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayMuonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayMuonActionPerformed

    private void btnXuatPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatPTActionPerformed
        // TODO add your handling code here:
        exportReturnReceipt();
    }//GEN-LAST:event_btnXuatPTActionPerformed

    private void nutxoakhachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutxoakhachmuonActionPerformed
        delete();
    }//GEN-LAST:event_nutxoakhachmuonActionPerformed

    private void banghienthiphieumuonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banghienthiphieumuonMouseClicked
        // TODO add your handling code here:
        this.row = banghienthiphieumuon.rowAtPoint(evt.getPoint());
         edit();
    }//GEN-LAST:event_banghienthiphieumuonMouseClicked

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
            java.util.logging.Logger.getLogger(QuanLiMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanLiMuonSach dialog = new QuanLiMuonSach(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable banghienthiphieumuon;
    private javax.swing.JButton btnXuatPT;
    private javax.swing.JButton btnXuatPhieuMuon;
    private javax.swing.JButton btnseach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton nuthuy5;
    private javax.swing.JButton nutluukhachmuon;
    private javax.swing.JButton nutthemkhach;
    private javax.swing.JButton nutxoakhachmuon;
    private javax.swing.JButton nútuakhachmuon;
    private javax.swing.JTextField txtMaDG;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaPM;
    private javax.swing.JTextField txtNgayHenTra;
    private javax.swing.JTextField txtNgayMuon;
    private javax.swing.JTextField txtThanhToan;
    private javax.swing.JTextField txtTinhTrang;
    private javax.swing.JTextField txtseach;
    // End of variables declaration//GEN-END:variables
     
    private List<PhieuMuon> selectAll() {
        try {
            return dao.selectAll(); // Sử dụng DAO để lấy danh sách từ CSDL
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
        return null;
    }
    private void fillToTable() {
    DefaultTableModel model = (DefaultTableModel) banghienthiphieumuon.getModel();
    model.setRowCount(0); // Xóa hết các dòng trong bảng hiện tại

    try {
        List<PhieuMuon> list = dao.selectAll();
        if (list != null) {
            for (PhieuMuon pm : list) {
                Object[] row = {
                    pm.getMaPM(),
                    pm.getNgayMuon(),
                    pm.getNgayHenTra(),
                    pm.getTinhTrang(),
                    pm.getThanhToan(),
                    pm.getMaDG(),
                    pm.getMaNV()
                };
                model.addRow(row); // Thêm một dòng vào bảng với dữ liệu của phiếu mượn pm
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(QuanLiMuonSach.class.getName()).log(Level.SEVERE, null, ex);
        MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
    }
}
    private void display(PhieuMuon pm) {
    txtMaPM.setText(pm.getMaPM());
    txtNgayMuon.setText(pm.getNgayMuon().toString()); // Cần chuyển đổi Date thành String
    txtNgayHenTra.setText(pm.getNgayHenTra().toString()); // Cần chuyển đổi Date thành String
    txtTinhTrang.setText(pm.getTinhTrang());
    txtThanhToan.setText(pm.getThanhToan());
    txtMaDG.setText(pm.getMaDG());
    txtMaNV.setText(pm.getMaNV());
}
    void edit(){
       String MaPM = (String)banghienthiphieumuon.getValueAt(this.row, 0);
       PhieuMuon pm = dao.selectById(MaPM);
       if( pm != null){
           display(pm);
       }
   }
    
    private void insert() {
    String maPM = txtMaPM.getText();
    Date ngayMuon = Date.valueOf(txtNgayMuon.getText()); // Chuyển đổi String thành Date
    Date ngayHenTra = Date.valueOf(txtNgayHenTra.getText()); // Chuyển đổi String thành Date
    String tinhTrang = txtTinhTrang.getText();
    String thanhToan = txtThanhToan.getText();
    String maDG = txtMaDG.getText();
    String maNV = txtMaNV.getText();

    // Kiểm tra xem các trường có bị bỏ trống hay không
    if (maPM.isEmpty() || tinhTrang.isEmpty() || thanhToan.isEmpty() || maDG.isEmpty() || maNV.isEmpty()) {
        MsgBox.alert(this, "Vui lòng điền đầy đủ thông tin!");
        return;
    }

    // Tạo đối tượng PhieuMuon mới
    PhieuMuon pm = new PhieuMuon();
    pm.setMaPM(maPM);
    pm.setNgayMuon(ngayMuon);
    pm.setNgayHenTra(ngayHenTra);
    pm.setTinhTrang(tinhTrang);
    pm.setThanhToan(thanhToan);
    pm.setMaDG(maDG);
    pm.setMaNV(maNV);

    // Gọi phương thức insert từ lớp PhieuMuonDAO
    try {
        dao.insert(pm);
        MsgBox.alert(this, "Thêm phiếu mượn thành công!");
        fillToTable(); // Cập nhật lại bảng
    } catch (Exception e) {
        e.printStackTrace();
        MsgBox.alert(this, "Lỗi khi thêm phiếu mượn!");
    }
}
    private void update() {
    String maPM = txtMaPM.getText();
    Date ngayMuon = Date.valueOf(txtNgayMuon.getText()); // Chuyển đổi String thành Date
    Date ngayHenTra = Date.valueOf(txtNgayHenTra.getText()); // Chuyển đổi String thành Date
    String tinhTrang = txtTinhTrang.getText();
    String thanhToan = txtThanhToan.getText();
    String maDG = txtMaDG.getText();
    String maNV = txtMaNV.getText();

    // Kiểm tra xem các trường có bị bỏ trống hay không
    if (maPM.isEmpty() || tinhTrang.isEmpty() || thanhToan.isEmpty() || maDG.isEmpty() || maNV.isEmpty()) {
        MsgBox.alert(this, "Vui lòng điền đầy đủ thông tin!");
        return;
    }

    // Tạo đối tượng PhieuMuon mới với thông tin đã cập nhật
    PhieuMuon pm = new PhieuMuon();
    pm.setMaPM(maPM);
    pm.setNgayMuon(ngayMuon);
    pm.setNgayHenTra(ngayHenTra);
    pm.setTinhTrang(tinhTrang);
    pm.setThanhToan(thanhToan);
    pm.setMaDG(maDG);
    pm.setMaNV(maNV);

    // Gọi phương thức update từ lớp PhieuMuonDAO
    try {
        dao.update(pm);
        MsgBox.alert(this, "Sửa thông tin phiếu mượn thành công!");
        fillToTable(); // Cập nhật lại bảng
    } catch (Exception e) {
        e.printStackTrace();
        MsgBox.alert(this, "Lỗi khi sửa thông tin phiếu mượn!");
    }
}
    private void delete() {
    String maPM = txtMaPM.getText();
    // Kiểm tra xem mã phiếu mượn có bị bỏ trống hay không
    if (maPM.isEmpty()) {
        MsgBox.alert(this, "Vui lòng nhập mã phiếu mượn để xóa!");
    }
    }
    private void fillToTableWithSearchResults(List<PhieuMuon> list) {
    DefaultTableModel model = (DefaultTableModel) banghienthiphieumuon.getModel();
    model.setRowCount(0); // Xóa hết các dòng trong bảng hiện tại
    for (PhieuMuon pm : list) {
        Object[] row = {
            pm.getMaPM(),
            pm.getNgayMuon(),
            pm.getNgayHenTra(),
            pm.getTinhTrang(),
            pm.getThanhToan(),
            pm.getMaDG(),
            pm.getMaNV()
        };
        model.addRow(row); // Thêm một dòng vào bảng với dữ liệu của phiếu mượn pm
    }
} 
    private void search() {
    String keyword = txtseach.getText().trim();
    // Kiểm tra xem từ khóa có bị bỏ trống hay không
    if (keyword.isEmpty()) {
        MsgBox.alert(this, "Vui lòng nhập từ khóa để tìm kiếm!");
        return;
    }
    // Gọi phương thức tìm kiếm từ lớp PhieuMuonDAO
    try {
        List<PhieuMuon> list = dao.searchByKeyword(keyword);
        fillToTableWithSearchResults(list); // Cập nhật lại bảng với danh sách kết quả tìm kiếm
    } catch (Exception e) {
        e.printStackTrace();
        MsgBox.alert(this, "Lỗi khi tìm kiếm phiếu mượn!");
    }
}
    
    
   private void exportBorrowReceipt() {
    String maPM = txtMaPM.getText();
    String ngayMuon = txtNgayMuon.getText();
    String ngayHenTra = txtNgayHenTra.getText();
    String tinhTrang = txtTinhTrang.getText();
    String thanhToan = txtThanhToan.getText();
    String maDG = txtMaDG.getText();
    String maNV = txtMaNV.getText();

    // Kiểm tra xem đã nhập đầy đủ thông tin chưa
    if (maPM.isEmpty() || ngayMuon.isEmpty() || ngayHenTra.isEmpty() || maDG.isEmpty() || maNV.isEmpty()) {
        MsgBox.alert(this, "Vui lòng điền đầy đủ thông tin!");
        return;
    }

    // Tạo nội dung cho phiếu mượn
    StringBuilder receipt = new StringBuilder();
    receipt.append("\t\t\t=== PHIẾU MƯỢN ===\n\n");
    receipt.append(String.format("Mã phiếu mượn: %s\n", maPM));
    receipt.append(String.format("Ngày mượn: %s\n", ngayMuon));
    receipt.append(String.format("Ngày hẹn trả: %s\n", ngayHenTra));
    receipt.append(String.format("Tình trạng: %s\n", tinhTrang));
    receipt.append(String.format("Thanh toán: %s\n", thanhToan));
    receipt.append(String.format("Mã đọc giả: %s\n", maDG));
    receipt.append(String.format("Mã nhân viên: %s\n", maNV));
    receipt.append("\n---------------------XIN CẢM ƠN QUÝ KHÁCH!------------------");

    // Xuất phiếu mượn ra file
    try {
        FileWriter writer = new FileWriter("PhieuMuon_" + maPM + ".txt");
        writer.write(receipt.toString());
        writer.close();
        MsgBox.alert(this, "Xuất phiếu mượn thành công!");
    } catch (IOException e) {
        e.printStackTrace();
        MsgBox.alert(this, "Lỗi khi xuất phiếu mượn!");
    }
}

private void exportReturnReceipt() {
    String maPM = txtMaPM.getText();
    String ngayTra = txtNgayHenTra.getText(); // Giả sử bạn có ngày trả
    String maDG = txtMaDG.getText();
    String maNV = txtMaNV.getText();

    // Kiểm tra xem đã nhập đầy đủ thông tin chưa
    if (maPM.isEmpty() || ngayTra.isEmpty() || maDG.isEmpty() || maNV.isEmpty()) {
        MsgBox.alert(this, "Vui lòng điền đầy đủ thông tin!");
        return;
    }

    // Tạo nội dung cho phiếu trả
    StringBuilder receipt = new StringBuilder();
    receipt.append("\t\t\t=== PHIẾU TRẢ ===\n\n");
    receipt.append(String.format("Mã phiếu mượn: %s\n", maPM));
    receipt.append(String.format("Ngày trả: %s\n", ngayTra));
    receipt.append(String.format("Mã đọc giả: %s\n", maDG));
    receipt.append(String.format("Mã nhân viên: %s\n", maNV));
    receipt.append("\n---------------------XIN CẢM ƠN QUÝ KHÁCH!------------------");

    // Xuất phiếu trả ra file
    try {
        FileWriter writer = new FileWriter("PhieuTra_" + maPM + ".txt");
        writer.write(receipt.toString());
        writer.close();
        MsgBox.alert(this, "Xuất phiếu trả thành công!");
    } catch (IOException e) {
        e.printStackTrace();
        MsgBox.alert(this, "Lỗi khi xuất phiếu trả!");
    }
}

}
