
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author super
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        usernamel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        phonenumber = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        passwordl = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SHOPPING MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(595, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1180, 96);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(270, 340, 0, 2);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(110, 160, 820, 10);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("SIGN UP HERE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 350, 170, 40);

        jLabel3.setText("USERNAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 180, 100, 30);
        getContentPane().add(username);
        username.setBounds(200, 440, 360, 40);

        jLabel4.setText("USERNAME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 450, 80, 20);

        usernamel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamelActionPerformed(evt);
            }
        });
        getContentPane().add(usernamel);
        usernamel.setBounds(210, 180, 350, 40);

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 300, 100, 40);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(90, 390, 840, 10);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("LOGIN HERE:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 120, 150, 40);

        jLabel6.setText("PHONE NUMBER");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 510, 100, 20);

        jLabel7.setText("PASSWORD:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 570, 110, 20);

        jLabel8.setText("PASSWORD:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 260, 70, 20);
        getContentPane().add(phonenumber);
        phonenumber.setBounds(200, 500, 360, 40);
        getContentPane().add(password);
        password.setBounds(200, 560, 360, 40);

        passwordl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordlActionPerformed(evt);
            }
        });
        getContentPane().add(passwordl);
        passwordl.setBounds(210, 250, 350, 40);

        jButton2.setText("SIGN UP HERE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 610, 120, 40);

        jLabel9.setText("You Not have Account Yet?,Don't worry Sign Up below:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 410, 430, 14);

        setSize(new java.awt.Dimension(688, 714));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernamelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamelActionPerformed

    private void passwordlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordlActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/shopping","root","");
            String sql="SELECT*FROM user WHERE Username=? AND Password=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1,usernamel.getText());
             pst.setString(2,passwordl.getText());
             ResultSet rs=pst.executeQuery();
             if(rs.next())
             {
                 JOptionPane.showMessageDialog(null,"Login Sucessfully");
             }
             else{
                 JOptionPane.showMessageDialog(null,"Password or Usrename is wrong!!");
             }
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          try {
            // TODO add your handling code here:
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/shopping","root","");
            String sql="INSERT INTO user(Username,PhoneNumber,Password) VALUES(?,?,?) ";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1,username.getText());
             pst.setString(2,phonenumber.getText());
             pst.setString(3,password.getText());
            pst.executeUpdate();
                 JOptionPane.showMessageDialog(null,"Login Sucessfully");
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField password;
    private javax.swing.JTextField passwordl;
    private javax.swing.JTextField phonenumber;
    private javax.swing.JTextField username;
    private javax.swing.JTextField usernamel;
    // End of variables declaration//GEN-END:variables
}
