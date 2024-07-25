/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.fpoly.core.forms;

import com.fpoly.core.DAO.NhanVienDAO;
import com.fpoly.core.models.NhanVien;
import com.fpoly.core.utils.MsgBox;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author admin
 */
public class nhanvienJDialog extends javax.swing.JDialog {
    int row = 0;
   

    /**
     * Creates new form nhanvienJDialog
     */
    public nhanvienJDialog(java.awt.Frame parent, boolean modal) {
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

        jPanel4 = new javax.swing.JPanel();
        btnsuadg = new javax.swing.JButton();
        btnluudg = new javax.swing.JButton();
        btnthemdg = new javax.swing.JButton();
        btnhuy = new javax.swing.JButton();
        btnxoadg = new javax.swing.JButton();
        txtmail = new javax.swing.JTextField();
        txtvaitro = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txtmanv = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        banghienthidg = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtseach = new javax.swing.JTextField();
        btbseach = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnsuadg.setText("Sửa");
        btnsuadg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuadgActionPerformed(evt);
            }
        });

        btnluudg.setText("Lưu");
        btnluudg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluudgActionPerformed(evt);
            }
        });

        btnthemdg.setText("Thêm");
        btnthemdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemdgActionPerformed(evt);
            }
        });

        btnhuy.setText("Hủy");
        btnhuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuyActionPerformed(evt);
            }
        });

        btnxoadg.setText("Xóa");
        btnxoadg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoadgActionPerformed(evt);
            }
        });

        txtmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmailActionPerformed(evt);
            }
        });

        txthoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthotenActionPerformed(evt);
            }
        });

        jLabel21.setText("Mã NV");

        jLabel22.setText("Họ Tên");

        jLabel23.setText("Vai Trò");

        banghienthidg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaNV", "Tên", "Vai trò", "Email", "Địa Chỉ"
            }
        ));
        banghienthidg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                banghienthidgMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(banghienthidg);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("Tìm kiếm");

        jLabel32.setText("Từ Khóa");

        btbseach.setText("Tìm");
        btbseach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbseachActionPerformed(evt);
            }
        });

        jLabel24.setText("Email");

        jLabel25.setText("Địa Chỉ");

        txtdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiachiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addGap(2, 2, 2))
                                .addComponent(jLabel30)
                                .addComponent(jLabel25)
                                .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(8, 8, 8))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnxoadg, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnluudg, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtvaitro, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtmanv, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txthoten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnhuy, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel31)
                                                .addGap(70, 70, 70))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel32)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtseach, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btbseach)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnsuadg, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(btnthemdg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtseach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btbseach))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnhuy)
                            .addComponent(btnthemdg)
                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsuadg)
                            .addComponent(txtvaitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnluudg)
                            .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnxoadg)
                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addComponent(jLabel30)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsuadgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuadgActionPerformed
        sua();
    }//GEN-LAST:event_btnsuadgActionPerformed

    private void btnluudgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluudgActionPerformed
        sua();
    }//GEN-LAST:event_btnluudgActionPerformed

    private void btnthemdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemdgActionPerformed
        insert();
    }//GEN-LAST:event_btnthemdgActionPerformed

    private void btnhuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuyActionPerformed
        huy();
    }//GEN-LAST:event_btnhuyActionPerformed

    private void btnxoadgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoadgActionPerformed
        xoa();
    }//GEN-LAST:event_btnxoadgActionPerformed

    private void txthotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthotenActionPerformed

    }//GEN-LAST:event_txthotenActionPerformed

    private void btbseachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbseachActionPerformed
        search();
    }//GEN-LAST:event_btbseachActionPerformed

    private void txtmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmailActionPerformed

    private void txtdiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiachiActionPerformed

    private void banghienthidgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banghienthidgMouseClicked
        // TODO add your handling code here:
        this.row = banghienthidg.rowAtPoint(evt.getPoint());
         edit();
    }//GEN-LAST:event_banghienthidgMouseClicked

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
            java.util.logging.Logger.getLogger(nhanvienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nhanvienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nhanvienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nhanvienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nhanvienJDialog dialog = new nhanvienJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable banghienthidg;
    private javax.swing.JButton btbseach;
    private javax.swing.JButton btnhuy;
    private javax.swing.JButton btnluudg;
    private javax.swing.JButton btnsuadg;
    private javax.swing.JButton btnthemdg;
    private javax.swing.JButton btnxoadg;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtseach;
    private javax.swing.JTextField txtvaitro;
    // End of variables declaration//GEN-END:variables

   NhanVienDAO dao = new NhanVienDAO();
 private List<NhanVien> selectAll() {
        try {
            return dao.selectAll(); // Sử dụng DAO để lấy danh sách từ CSDL
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
        return null;
    }

    // Điền dữ liệu vào bảng
    private void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) banghienthidg.getModel();
        model.setRowCount(0); // Xóa hết các dòng trong bảng hiện tại

        // Gọi phương thức selectAll để lấy danh sách nhân viên từ CSDL
        List<NhanVien> list;
        try {
            list = dao.selectAll();
               if (list != null) {
            for (NhanVien nv : list) {
                Object[] row = {
                    nv.getMaNV(),
                    nv.getHoTen(),
                    nv.getVaiTro(),
                    nv.getEmail(),
                    nv.getDiaChi() 
                     
                };
                model.addRow(row); // Thêm một dòng vào bảng với dữ liệu của nhân viên nv
            }
        }
        } catch (SQLException ex) {
            Logger.getLogger(nhanvienJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
    }
   private void display( NhanVien nv){
      
        txtmanv.setText(nv.getMaNV());
        txthoten.setText(nv.getHoTen());
        txtvaitro.setText(nv.getVaiTro());
        txtmail.setText(nv.getEmail());
        txtdiachi.setText(nv.getDiaChi());
        
    }

   void edit(){
       String MaNV = (String)banghienthidg.getValueAt(this.row, 0);
       NhanVien nv = dao.selectById(MaNV);
       if( nv != null){
           display(nv);
       }
   }
    
   void insert (){
        String maNV = txtmanv.getText();
        String hoTen = txthoten.getText();
        String vaiTro = txtvaitro.getText();
        String email = txtmail.getText();
        String diaChi = txtdiachi.getText();

        // Kiểm tra xem các trường có bị bỏ trống hay không
        if (maNV.isEmpty() || hoTen.isEmpty() || vaiTro.isEmpty() || email.isEmpty() || diaChi.isEmpty()) {
            MsgBox.alert(this, "Vui lòng điền đầy đủ thông tin!");
            return;
        }

        // Tạo đối tượng NhanVien mới
        NhanVien nv = new NhanVien();
        nv.setMaNV(maNV);
        nv.setHoTen(hoTen);
        nv.setVaiTro(vaiTro);
        nv.setEmail(email);
        nv.setDiaChi(diaChi);

        // Gọi phương thức insert từ lớp NhanVienDAO
        try {
            dao.insert(nv);
            MsgBox.alert(this, "Thêm nhân viên thành công!");
            fillToTable(); // Cập nhật lại bảng
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi khi thêm nhân viên!");
        }
       }
   void sua (){
        String maNV = txtmanv.getText();
    String hoTen = txthoten.getText();
    String vaiTro = txtvaitro.getText();
    String email = txtmail.getText();
    String diaChi = txtdiachi.getText();

    // Kiểm tra xem các trường có bị bỏ trống hay không
    if (maNV.isEmpty() || hoTen.isEmpty() || vaiTro.isEmpty() || email.isEmpty() || diaChi.isEmpty()) {
        MsgBox.alert(this, "Vui lòng điền đầy đủ thông tin!");
        return;
    }

    // Tạo đối tượng NhanVien mới với thông tin đã cập nhật
    NhanVien nv = new NhanVien();
    nv.setMaNV(maNV);
    nv.setHoTen(hoTen);
    nv.setVaiTro(vaiTro);
    nv.setEmail(email);
    nv.setDiaChi(diaChi);

    // Gọi phương thức update từ lớp NhanVienDAO
    try {
        dao.update(nv);
        MsgBox.alert(this, "Sửa thông tin nhân viên thành công!");
        fillToTable(); // Cập nhật lại bảng
    } catch (Exception e) {
        e.printStackTrace();
        MsgBox.alert(this, "Lỗi khi sửa thông tin nhân viên!");
    }
   }
   
   void xoa(){
        String maNV = txtmanv.getText();
    // Kiểm tra xem mã nhân viên có bị bỏ trống hay không
    if (maNV.isEmpty()) {
        MsgBox.alert(this, "Vui lòng nhập mã nhân viên để xóa!");
        return;
    }
    // Xác nhận lại việc xóa
    int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa nhân viên này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    // Gọi phương thức delete từ lớp NhanVienDAO
    try {
        dao.delete(maNV);
        MsgBox.alert(this, "Xóa nhân viên thành công!");
        fillToTable(); // Cập nhật lại bảng
    } catch (Exception e) {
        e.printStackTrace();
        MsgBox.alert(this, "Lỗi khi xóa nhân viên!");
    }
   }
   
   
   void huy(){
       txtmanv.setText("");
       txthoten.setText("");
       txtvaitro.setText("");
       txtmail.setText("");
       txtdiachi.setText("");
   }
   
 
   void search(){
       // Lấy từ khóa tìm kiếm từ trường nhập liệu
    String keyword = txtseach.getText();

    // Kiểm tra xem từ khóa có bị bỏ trống hay không
    if (keyword.isEmpty()) {
        MsgBox.alert(this, "Vui lòng nhập từ khóa để tìm kiếm!");
        return;
    }

    // Gọi phương thức tìm kiếm từ lớp NhanVienDAO
    try {
        List<NhanVien> list = dao.searchByKeyword(keyword);
        fillToTableseach(list); // Cập nhật lại bảng với danh sách kết quả tìm kiếm
    } catch (Exception e) {
        e.printStackTrace();
        MsgBox.alert(this, "Lỗi khi tìm kiếm nhân viên!");
    }
   }
   private void fillToTableseach(List<NhanVien> list) {
    DefaultTableModel model = (DefaultTableModel) banghienthidg.getModel();
    model.setRowCount(0);
    for (NhanVien nv : list) {
        Object[] row = {
            nv.getMaNV(),
            nv.getMatKhau(),
            nv.getHoTen(),
            nv.getVaiTro()
        };
        model.addRow(row);
    }
}

 

   
}

