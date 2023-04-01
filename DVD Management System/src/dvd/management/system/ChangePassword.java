/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dvd.management.system;

import DataAccessObject.Mail;
import DataAccessObject.Userdao;
import DataAccessObject.otp;
import DataAccessObject.smtpdao;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Smtp;
import model.User;

/**
 *
 * @author ASUS-NOTEBOOK
 */
public class ChangePassword extends javax.swing.JFrame {
    public int dbid;
    public String dbToken;
    public String dbPassword;
    public String d = "C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\icon\\";
    
    
    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
    }
    
    public ChangePassword(int id) {
        initComponents();
        btnSave.setEnabled(false);
        btnOtp.setEnabled(false);
        txtNewPassword.setBackground(new java.awt.Color(0,0,1));
        txtOtp.setBackground(new java.awt.Color(0,0,1));
        txtPassword.setBackground(new java.awt.Color(0,0,1));
        txtOtp.setEditable(false);
        btnOtp.setEnabled(false);
    
        dbid = id;
        User user = null;
        user = Userdao.getAll(id);
        
    }
    
    public void validateFields(){
        String newPassword = txtNewPassword.getText();
        String password = txtPassword.getText();
        
        if(!password.equals("")&&!newPassword.equals("")){
           btnOtp.setEnabled(true); 
        } else{
           btnOtp.setEnabled(false);
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
        txtOtp = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        btnOtp = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOtp.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtOtp.setForeground(new java.awt.Color(255, 255, 255));
        txtOtp.setBorder(null);
        txtOtp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOtpKeyReleased(evt);
            }
        });
        jPanel1.add(txtOtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 150, -1));

        txtPassword.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 150, -1));

        txtNewPassword.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtNewPassword.setBorder(null);
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 150, -1));

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgbutons/save.png"))); // NOI18N
        btnSave.setBorder(null);
        btnSave.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save/saveinactive.png"))); // NOI18N
        btnSave.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save/saveinactive.png"))); // NOI18N
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSaveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSaveMouseReleased(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        btnOtp.setBackground(new java.awt.Color(0, 0, 0));
        btnOtp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Sendotp/SEND OTP.png"))); // NOI18N
        btnOtp.setBorder(null);
        btnOtp.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/dvd/management/system/SEND_OTPnotactive.png"))); // NOI18N
        btnOtp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOtpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOtpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOtpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOtpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnOtpMouseReleased(evt);
            }
        });
        btnOtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtpActionPerformed(evt);
            }
        });
        jPanel1.add(btnOtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgbutons/back.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBackMouseReleased(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel1.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgbutons/NEW PASSWORD.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtpActionPerformed
        // TODO add your handling code here:
        
        User user = new User();
        User user2 = new User();
        user = Userdao.getAll(dbid);
        user2 = Userdao.getAll(dbid);
        otp o = new otp();
        txtOtp.setEditable(true);
        
        int l = 6; //max lenght of otp
        String token = String.valueOf(o.method(l));
        String password = txtPassword.getText();
        
        
        user.setToken(token);
        Userdao.updateToken(user.getEmail(),token);
        
       
        user = Userdao.getToken(user.getEmail());
        user2 = Userdao.getPassword(user.getEmail());
        if(user == null){
             int a = JOptionPane.showConfirmDialog(null,"<html><b style =\"color:red\">Incorrect E-mail</b></html>","Message", JOptionPane.ERROR_MESSAGE);
        }
        else {
            btnOtp.setEnabled(false);
            txtNewPassword.setEditable(false);
            
            dbToken = user.getToken();
            dbPassword = user.getPassword();
            validateFields();
            
            if(user2 == null){
                
            }
            else {
            dbPassword = user2.getPassword();
                if(password.equals(dbPassword)){
                //Userdao.update(SaveEmail,newPassword); 
                Smtp smtp = null;
                smtp = smtpdao.getSMTP();
               
                Mail mail = new Mail();
                mail.setupSeverProperties();
                try {

                mail.draftEmail(user.getEmail(),token);
                mail.sendEmail(smtp.getEmail(),smtp.getPassword());
    
                } catch (Exception ex){
                ex.printStackTrace();
                }
                btnOtp.setEnabled(false);
                txtOtp.setEditable(true);
                
                JOptionPane.showMessageDialog(null,"OTP sent to your Email","Message", JOptionPane.INFORMATION_MESSAGE);
                } 
                else{
                    JOptionPane.showMessageDialog(null,"<html><b style =\"color:red\">Incorrect Password</b></html>","Message", JOptionPane.ERROR_MESSAGE);
                    btnOtp.setEnabled(true);
                    
                    txtNewPassword.setEditable(true);
                    
                }
                

            }
            
       
             
               
            
            
            
            
            
            
        }
    }//GEN-LAST:event_btnOtpActionPerformed

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtNewPasswordKeyReleased

    private void txtOtpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOtpKeyReleased
        // TODO add your handling code here:
         String otp = txtOtp.getText();
        if(!otp.equals("")){
           btnSave.setEnabled(true);
        } else{
           btnSave.setEnabled(false);
        }
    }//GEN-LAST:event_txtOtpKeyReleased

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        User user = null;
        user = Userdao.getAll(dbid);
        String token = txtOtp.getText();
        String newPassword = txtNewPassword.getText();
        String email = user.getEmail();
        if(token.equals(dbToken)){
            Userdao.update(email, newPassword);
            setVisible(false);
            EditProfile ep;
            ep = new EditProfile(dbid);
            ep.setVisible(true);

        }
        else{
            JOptionPane.showMessageDialog(null,"<html><b style =\"color:red\">Incorrect OTP</b></html>","Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        User user = null;
        user = Userdao.getAll(dbid);
        int type = user.getType();

        if (type == 1){
            setVisible(false);
            adminHome ep;
            ep = new adminHome(dbid);
            ep.setVisible(true);

        }else {
            setVisible(false);
            EditProfile ep;
            ep = new EditProfile(dbid);
            ep.setVisible(true);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnOtpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOtpMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnOtpMouseClicked

    private void btnOtpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOtpMouseReleased
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Sendotp\\";
        String i ="SEND OTP.png";
        icon = new ImageIcon(d+i2+i);
        btnOtp.setIcon(icon);
    }//GEN-LAST:event_btnOtpMouseReleased

    private void btnOtpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOtpMousePressed
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Sendotp\\";
        String i ="SEND OTPclick.png";
        icon = new ImageIcon(d+i2+i);
        btnOtp.setIcon(icon);
    }//GEN-LAST:event_btnOtpMousePressed

    private void btnSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMousePressed
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Save\\";
        String i ="saveclicked.png";
        icon = new ImageIcon(d+i2+i);
        btnSave.setIcon(icon);
    }//GEN-LAST:event_btnSaveMousePressed

    private void btnSaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseReleased
        // TODO add your handling code here:
         ImageIcon icon;
        String i2 ="Save\\";
        String i ="save.png";
        icon = new ImageIcon(d+i2+i);
        btnSave.setIcon(icon);
    }//GEN-LAST:event_btnSaveMouseReleased

    private void btnOtpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOtpMouseEntered
        // TODO add your handling code here:
         ImageIcon icon;
        String i2 ="Sendotp\\";
        String i ="SEND OTPhover.png";
        icon = new ImageIcon(d+i2+i);
        btnOtp.setIcon(icon);
    }//GEN-LAST:event_btnOtpMouseEntered

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="back\\";
        String i ="backhover.png";
        icon = new ImageIcon(d+i2+i);
        btnBack.setIcon(icon);
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="back\\";
        String i ="back.png";
        icon = new ImageIcon(d+i2+i);
        btnBack.setIcon(icon);
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMousePressed
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="back\\";
        String i ="backclick.png";
        icon = new ImageIcon(d+i2+i);
        btnBack.setIcon(icon);
    }//GEN-LAST:event_btnBackMousePressed

    private void btnBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseReleased
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="back\\";
        String i ="back.png";
        icon = new ImageIcon(d+i2+i);
        btnBack.setIcon(icon);
    }//GEN-LAST:event_btnBackMouseReleased

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Save\\";
        String i ="savehover.png";
        icon = new ImageIcon(d+i2+i);
        btnSave.setIcon(icon);
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Save\\";
        String i ="save.png";
        icon = new ImageIcon(d+i2+i);
        btnSave.setIcon(icon);
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnOtpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOtpMouseExited
        // TODO add your handling code here:
       ImageIcon icon;
        String i2 ="Sendotp\\";
        String i ="SEND OTP.png";
        icon = new ImageIcon(d+i2+i);
        btnOtp.setIcon(icon);
    }//GEN-LAST:event_btnOtpMouseExited

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOtp;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtOtp;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
