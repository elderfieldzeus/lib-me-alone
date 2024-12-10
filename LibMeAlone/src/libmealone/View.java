/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libmealone;

import database.MyDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zeus
 */
public class View extends javax.swing.JFrame {
    private Boolean isUser;
    private Integer offset;
    /**
     * Creates new form View
     */
    public View() {
        initComponents();
    }
    
    public View(Boolean isUser) {
        initComponents();
        this.offset = 0;
        offset_label.setText(offset.toString());
        this.isUser = isUser;
        updateTable();
        
        if(isUser) {
            view_label.setText("Users");
        }
        else {
            view_label.setText("Librarians");
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

        jPanel1 = new javax.swing.JPanel();
        view_label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_area = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        offset_label = new javax.swing.JLabel();
        minus_offset = new javax.swing.JButton();
        plus_offset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        view_label.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        view_label.setText("VIEW");
        jPanel1.add(view_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton1.setBackground(java.awt.Color.green);
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setText("Add");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, -1));

        table_area.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "username", "date_joined"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_area);
        if (table_area.getColumnModel().getColumnCount() > 0) {
            table_area.getColumnModel().getColumn(0).setResizable(false);
            table_area.getColumnModel().getColumn(1).setResizable(false);
            table_area.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 360));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2.setText("Close");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 10, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        offset_label.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        offset_label.setText("<number>");
        offset_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        offset_label.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(offset_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 30, 40));

        minus_offset.setText("<");
        minus_offset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus_offsetMouseClicked(evt);
            }
        });
        minus_offset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus_offsetActionPerformed(evt);
            }
        });
        jPanel2.add(minus_offset, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        plus_offset.setText(">");
        plus_offset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus_offsetMouseClicked(evt);
            }
        });
        plus_offset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_offsetActionPerformed(evt);
            }
        });
        plus_offset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                plus_offsetKeyPressed(evt);
            }
        });
        jPanel2.add(plus_offset, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minus_offsetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus_offsetMouseClicked
        if(offset > 0) {
            offset--;
            offset_label.setText(offset.toString());
            updateTable();
        }
    }//GEN-LAST:event_minus_offsetMouseClicked

    private void minus_offsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus_offsetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minus_offsetActionPerformed

    private void plus_offsetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus_offsetMouseClicked
        offset++;
        offset_label.setText(offset.toString());
        updateTable();
    }//GEN-LAST:event_plus_offsetMouseClicked

    private void plus_offsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_offsetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plus_offsetActionPerformed

    private void plus_offsetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plus_offsetKeyPressed

    }//GEN-LAST:event_plus_offsetKeyPressed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new AddUser(isUser).setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void updateTable() {
        
        
        DefaultTableModel model = (DefaultTableModel)table_area.getModel();
        
        while(table_area.getRowCount() > 0) {
            model.removeRow(0);
        }
        
        table_area.removeAll();
        table_area.revalidate();
        table_area.repaint(); 
        
        try {
           Connection conn = MyDB.getConn();
           
            String sql1;
            if(isUser) {
                sql1 = "SELECT * FROM users WHERE role = 'user' LIMIT 20 OFFSET ?";
            }
            else {
                sql1 = "SELECT * FROM users WHERE role ='librarian' LIMIT 20 OFFSET ?";
            }
            
            PreparedStatement p1 = conn.prepareStatement(sql1);
            p1.setInt(1, offset * 20);

            ResultSet rs = p1.executeQuery();
            
            
            while(rs.next()) {
                model.addRow(new Object[]{rs.getInt("id"), rs.getString("username"), rs.getDate("created_at")});
            }
            
            conn.close();
       }
       catch(Exception error) {
           System.out.println(error);
       }
    }
    
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton minus_offset;
    private javax.swing.JLabel offset_label;
    private javax.swing.JButton plus_offset;
    private javax.swing.JTable table_area;
    private javax.swing.JLabel view_label;
    // End of variables declaration//GEN-END:variables
}