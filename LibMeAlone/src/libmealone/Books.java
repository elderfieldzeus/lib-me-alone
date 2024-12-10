/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libmealone;

import database.MyDB;
import database.SessionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Zeus
 */
public class Books extends javax.swing.JFrame {
    public ArrayList<Book> books;
    public Integer offset;
    /**
     * Creates new form Books
     */
    public Books() {
        initComponents();
        
        String role = SessionManager.get("role").toString();
        this.offset = 0;
        this.books = getBooks();
        
        if(!role.equals("admin")) {
            add_book.setVisible(false);
        }
        
        updateBooks();
        
        offset_label.setText(offset.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_book = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        book_area = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        offset_label = new javax.swing.JLabel();
        minus_offset = new javax.swing.JButton();
        plus_offset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_book.setBackground(java.awt.Color.green);
        add_book.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        add_book.setText("Add Book");
        add_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_bookMouseClicked(evt);
            }
        });
        getContentPane().add(add_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        book_area.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(book_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 520, 300));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        offset_label.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        offset_label.setText("<number>");
        offset_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        offset_label.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(offset_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 30, 40));

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
        jPanel1.add(minus_offset, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

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
        jPanel1.add(plus_offset, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 150, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel2.setText("Library");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libmealone/empty-shelf.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 360));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void plus_offsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_offsetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plus_offsetActionPerformed

    private void minus_offsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus_offsetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minus_offsetActionPerformed

    private void plus_offsetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plus_offsetKeyPressed
        
    }//GEN-LAST:event_plus_offsetKeyPressed

    private void plus_offsetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus_offsetMouseClicked
        offset++;
        offset_label.setText(offset.toString());
        books = getBooks();
        updateBooks();
    }//GEN-LAST:event_plus_offsetMouseClicked

    private void minus_offsetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus_offsetMouseClicked
        if(offset > 0) {
            offset--;
            offset_label.setText(offset.toString());
            
            updateBooks();
        }
    }//GEN-LAST:event_minus_offsetMouseClicked

    private void add_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_bookMouseClicked
        new AddBook(() -> {
            this.books = getBooks();
            updateBooks();
            return null;
        }).setVisible(true);
    }//GEN-LAST:event_add_bookMouseClicked

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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }
    
    public ArrayList<Book> getBooks() {
        ArrayList<Book> books = null;
           
       try {
           Connection conn = MyDB.getConn();
                
            String role = SessionManager.get("role").toString();
            String sql1;
            if(role.equals("user")) {
                sql1 = "SELECT * FROM books WHERE is_borrowed = 0 ORDER BY name LIMIT 6 OFFSET ?";
            }
            else {
                sql1 = "SELECT * FROM books ORDER BY name LIMIT 6 OFFSET ?";
            }
            
            PreparedStatement p1 = conn.prepareStatement(sql1);
            
            

            p1.setInt(1, offset * 6);

            ResultSet rs = p1.executeQuery();
           
            books = new ArrayList<>();
            int index = 0;
            
            while(rs.next()) {
                books.add(new Book(rs.getInt("id"), rs.getString("name"), rs.getString("author"), rs.getString("description")));
                System.out.println(rs.getString("name"));
            }
            
            conn.close();
       }
       catch(Exception error) {
           System.out.println(error);
           books = null;
       }
       
       return books;
    }
    
    public void updateBooks() {
        book_area.removeAll();
        book_area.revalidate();
        book_area.repaint(); 
        this.books.clear();
        
        this.books = getBooks();
        
        for(int i = 0; i < this.books.size(); i++) {
            book_area.add(this.books.get(i), new org.netbeans.lib.awtextra.AbsoluteConstraints(160 * (i % 3) + 40, 150 * (i / 3) + 5, 130, 140));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_book;
    private javax.swing.JPanel book_area;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton minus_offset;
    private javax.swing.JLabel offset_label;
    private javax.swing.JButton plus_offset;
    // End of variables declaration//GEN-END:variables
}
