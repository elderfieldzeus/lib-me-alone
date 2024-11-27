/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libmealone;

import java.sql.*;
import database.MyDB;
import javax.swing.JOptionPane;

/**
 *
 * @author Zeus
 */
public class SignupPage extends javax.swing.JFrame {

    /**
     * Creates new form SignupPage
     */
    public SignupPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        signupUsername = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        signupPassword = new javax.swing.JPasswordField();
        signupButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        signupToLogin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        signupCPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("SIGNUP");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));
        jPanel2.add(signupUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 310, 50));

        jTextField2.setText("jTextField1");
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 310, 50));
        jPanel2.add(signupPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 310, 50));

        signupButton.setBackground(new java.awt.Color(153, 0, 0));
        signupButton.setForeground(java.awt.Color.white);
        signupButton.setText("Sign up");
        signupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupButtonMouseClicked(evt);
            }
        });
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        jPanel2.add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 310, 50));

        jLabel3.setText("Already have an account?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        signupToLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signupToLogin.setForeground(java.awt.Color.blue);
        signupToLogin.setText("Log in.");
        signupToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupToLoginMouseClicked(evt);
            }
        });
        jPanel2.add(signupToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        jLabel5.setText("Username");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel6.setText("Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel2.add(signupCPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 310, 50));

        jLabel7.setText("Confirm Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 370, 450));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zeus\\Downloads\\lib.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1200, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupButtonActionPerformed

    private void signupToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupToLoginMouseClicked
        new LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupToLoginMouseClicked

    private void signupButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupButtonMouseClicked
        String username = signupUsername.getText();
        String password = new String(signupPassword.getPassword());
        String cpassword = new String(signupCPassword.getPassword());
        
        if(username.isEmpty() || password.isEmpty() || cpassword.isEmpty() || !password.equals(cpassword)) {
            JOptionPane.showMessageDialog(this, "Error: Invalid signup attempt.");
            signupPassword.setText("");
            signupCPassword.setText("");
        }
        else {
            try {
                Connection conn = MyDB.getConn();
                
                // Check if username already exists
                String sql1 = "SELECT * FROM USERS WHERE username = ?";
                PreparedStatement p1 = conn.prepareStatement(sql1);
                
                p1.setString(1, username);
                
                ResultSet rs = p1.executeQuery();
                
                if(rs.next()) {
                    JOptionPane.showMessageDialog(this, "Error: Username is already taken.");
                    signupPassword.setText("");
                    signupCPassword.setText("");
                }
                else {
                    String sql2 = "INSERT INTO USERS (username, password) VALUES (?, ?)";
                    PreparedStatement p2 = conn.prepareStatement(sql2);
            
                    p2.setString(1, username);
                    p2.setString(2, password);
            
                    p2.execute();
                    
                    new LoginPage().setVisible(true);
                    this.dispose();
                }
            
                conn.close();
            }
            catch(Exception error) {
                JOptionPane.showMessageDialog(this, "Error: Unable to connect to Database." + error);
            }
        }
    }//GEN-LAST:event_signupButtonMouseClicked

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
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton signupButton;
    private javax.swing.JPasswordField signupCPassword;
    private javax.swing.JPasswordField signupPassword;
    private javax.swing.JLabel signupToLogin;
    private javax.swing.JTextField signupUsername;
    // End of variables declaration//GEN-END:variables
}
