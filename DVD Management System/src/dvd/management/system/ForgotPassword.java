/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dvd.management.system;

import DataAccessObject.Mail;
import javax.swing.JOptionPane;
import model.User;
import DataAccessObject.Userdao;
import DataAccessObject.otp;
import DataAccessObject.smtpdao;
import javax.swing.ImageIcon;
import model.Smtp;

/**
 *
 * @author ASUS-NOTEBOOK
 */
public class ForgotPassword extends javax.swing.JFrame {
    public String d = "C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\icon\\";
    private String dbToken = null;
    private String email = null;
    private String emailPattern = "^(.+)@(.+)$";
    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
        
        txtEmail.setBackground(new java.awt.Color(0,0,1));
        txtNewPassword.setBackground(new java.awt.Color(0,0,1));
        txtToken.setBackground(new java.awt.Color(0,0,1));
        
        btnReset.setEnabled(false);
        btnSearch.setEnabled(false);
        txtToken.setEditable(false);
        txtNewPassword.setEditable(false);
        
    }
    
    public void clear (){
        btnReset.setEnabled(false);
        btnSearch.setEnabled(false);
        txtEmail.setEditable(true);
        txtEmail.setText("");
        txtToken.setText("");
        txtNewPassword.setText("");
        txtToken.setEditable(false);
        txtNewPassword.setEditable(false);
        
        
    }
    
    public void validateEmail(){
        email = txtEmail.getText();
        if(email.matches(emailPattern)){
           btnSearch.setEnabled(true);
        }
        else {
           btnSearch.setEnabled(false);
        }
    }
    
    public void validateFields(){
        String password = txtNewPassword.getText();
        String token = txtToken.getText();
        if(!password.equals("")&&!token.equals("")){
             btnReset.setEnabled(true);
        } 
        else {
             btnReset.setEnabled(false);
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
        txtEmail = new javax.swing.JTextField();
        txtToken = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JPasswordField();
        btnReset = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 160, -1));

        txtToken.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtToken.setForeground(new java.awt.Color(255, 255, 255));
        txtToken.setBorder(null);
        txtToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTokenActionPerformed(evt);
            }
        });
        txtToken.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTokenKeyReleased(evt);
            }
        });
        jPanel1.add(txtToken, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 160, -1));

        txtNewPassword.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtNewPassword.setBorder(null);
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, -1));

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgbutons/save.png"))); // NOI18N
        btnReset.setBorder(null);
        btnReset.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save/saveinactive.png"))); // NOI18N
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnResetMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnResetMouseReleased(evt);
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgforogt/Trash icon.png"))); // NOI18N
        btnClear.setBorder(null);
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClearMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnClearMouseReleased(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgforogt/Exit.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 20, 10));

        btnSignup.setBackground(new java.awt.Color(0, 0, 0));
        btnSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgforogt/Signup.png"))); // NOI18N
        btnSignup.setBorder(null);
        btnSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignupMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSignupMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSignupMouseReleased(evt);
            }
        });
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgforogt/Login.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLoginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLoginMouseReleased(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgforogt/search.png"))); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search/searchinactive.png"))); // NOI18N
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSearchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSearchMouseReleased(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgforogt/forgot password_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTokenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTokenActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
       validateEmail();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtTokenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTokenKeyReleased
        validateFields();
    }//GEN-LAST:event_txtTokenKeyReleased

    private void txtNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyReleased
        validateFields();
    }//GEN-LAST:event_txtNewPasswordKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to close the Application?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        String token = txtToken.getText();
        String newPassword = txtNewPassword.getText();
        if(token.equals(dbToken)){
            Userdao.update(email, newPassword);
            clear();
            setVisible(false);
            new Loginback().setVisible(true);
            
        }
        else{
            JOptionPane.showMessageDialog(null,"<html><b style =\"color:red\">Incorrect OTP</b></html>","Message", JOptionPane.ERROR_MESSAGE);
        }
        
       
        
        
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        email = txtEmail.getText();
        User user = new User();
        
        otp o = new otp();
        int l = 6; //max lenght of otp
        String token = String.valueOf(o.method(l));
        String email = txtEmail.getText();
        
        user.setToken(token);
        Userdao.updateToken(email,token);
        clear();
       
        user = Userdao.getToken(email);
        if(user == null){
            JOptionPane.showMessageDialog(null,"<html><b style =\"color:red\">Incorrect E-mail</b></html>","Message", JOptionPane.ERROR_MESSAGE);
        }
        else {
            btnSearch.setEnabled(false);
            txtEmail.setEditable(false);
            dbToken = user.getToken();
            txtEmail.setText(user.getEmail());
            txtToken.setEditable(true);
            txtNewPassword.setEditable(true);
            
            validateFields();
            
            Smtp smtp = null;
            smtp = smtpdao.getSMTP();
            
            Mail mail = new Mail();
            mail.setupSeverProperties();
            try {

            mail.draftEmail(email,token);
            mail.sendEmail(smtp.getEmail(),smtp.getPassword());
             JOptionPane.showMessageDialog(null,"OTP Sent to your Email","Message", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex){
                ex.printStackTrace();
            }
           
            
        }
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
       
        setVisible(false);
        new Register().setVisible(true);
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Loginback().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Login\\";
        String i ="Loginanimated.gif";
        icon = new ImageIcon(d+i2+i);
        btnLogin.setIcon(icon);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Login\\";
        String i ="Login.png";
        icon = new ImageIcon(d+i2+i);
        btnLogin.setIcon(icon);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseReleased
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Login\\";
        String i ="Login.png";
        icon = new ImageIcon(d+i2+i);
        btnLogin.setIcon(icon);
    }//GEN-LAST:event_btnLoginMouseReleased

    private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMousePressed
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Login\\";
        String i ="Loginclicked1.png";
        icon = new ImageIcon(d+i2+i);
        btnLogin.setIcon(icon);
    }//GEN-LAST:event_btnLoginMousePressed

    private void btnSignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Signup\\";
        String i ="signupglitch.gif";
        icon = new ImageIcon(d+i2+i);
        btnSignup.setIcon(icon);
    }//GEN-LAST:event_btnSignupMouseEntered

    private void btnSignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
       
        icon = new ImageIcon("C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\images\\Signup.png");
        btnSignup.setIcon(icon);
    }//GEN-LAST:event_btnSignupMouseExited

    private void btnSignupMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseReleased
        // TODO add your handling code here:
        ImageIcon icon;
       
        icon = new ImageIcon("C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\images\\Signup.png");
        btnSignup.setIcon(icon);
    }//GEN-LAST:event_btnSignupMouseReleased

    private void btnSignupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMousePressed
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Signup\\";
        String i ="signupclicked.png";
        icon = new ImageIcon(d+i2+i);
        btnSignup.setIcon(icon);
    }//GEN-LAST:event_btnSignupMousePressed

    private void btnClearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseReleased
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Update\\";
        String i ="updateclicked.png";
        icon = new ImageIcon("C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\images\\trash icon.png");
        btnClear.setIcon(icon);
    }//GEN-LAST:event_btnClearMouseReleased

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Update\\";
        String i ="updateclicked.png";
        icon = new ImageIcon("C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\images\\trash icon.png");
        btnClear.setIcon(icon);
    }//GEN-LAST:event_btnClearMouseExited

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Clear\\";
        String i ="Trash iconhover.png";
        icon = new ImageIcon(d+i2+i);
        btnClear.setIcon(icon);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMousePressed
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Clear\\";
        String i ="Trash iconclicked.png";
        icon = new ImageIcon(d+i2+i);
        btnClear.setIcon(icon);
    }//GEN-LAST:event_btnClearMousePressed

    private void btnResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMousePressed
        // TODO add your handling code here:
        ImageIcon icon;
         String i2 ="Save\\";
        String i ="saveclicked.png";
        icon = new ImageIcon(d+i2+i);
        btnReset.setIcon(icon);
    }//GEN-LAST:event_btnResetMousePressed

    private void btnResetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseReleased
        // TODO add your handling code here:
        ImageIcon icon;
         String i2 ="Save\\";
        String i ="save.png";
        icon = new ImageIcon(d+i2+i);
        btnReset.setIcon(icon);
    }//GEN-LAST:event_btnResetMouseReleased

    private void btnSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMousePressed
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Search\\";
        String i ="searchclicekd.png";
        icon = new ImageIcon(d+i2+i);
        btnReset.setIcon(icon);
        
    }//GEN-LAST:event_btnSearchMousePressed

    private void btnSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseReleased
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Save\\";
        String i ="save.png";
        icon = new ImageIcon(d+i2+i);
        btnReset.setIcon(icon);
    }//GEN-LAST:event_btnSearchMouseReleased

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Search\\";
        String i ="searchhover.png";
        icon = new ImageIcon(d+i2+i);
        btnSearch.setIcon(icon);
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Search\\";
        String i ="C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\imgver\\search.png";
        icon = new ImageIcon(i);
        btnSearch.setIcon(icon);
    }//GEN-LAST:event_btnSearchMouseExited

    private void btnResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Save\\";
        String i ="savehover.png";
        icon = new ImageIcon(d+i2+i);
        btnReset.setIcon(icon);
    }//GEN-LAST:event_btnResetMouseEntered

    private void btnResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Save\\";
        String i ="savehover.png";
        icon = new ImageIcon(d+i2+i);
        btnReset.setIcon(icon);
    }//GEN-LAST:event_btnResetMouseExited

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtToken;
    // End of variables declaration//GEN-END:variables
}
