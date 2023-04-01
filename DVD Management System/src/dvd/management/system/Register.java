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
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import model.Smtp;

/**
 *
 * @author ASUS-NOTEBOOK
 */
public class Register extends javax.swing.JFrame{
    public String d = "C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\icon\\";
   // public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String emailPattern = "^(.+)@(.+)$";

    /**
     * Creates new form Register
     */
    
    Session newSession = null;
    MimeMessage mimeMessage = null;
    
    public Register() {
        initComponents();
        txtemail.setBackground(new java.awt.Color(0,0,1));
        txtname.setBackground(new java.awt.Color(0,0,1));
        txtpass.setBackground(new java.awt.Color(0,0,1));
        signupbutton.setEnabled(false);
        
    }
    
    public void clear(){
        
        txtname.setText("");
       
        txtemail.setText("");
        txtpass.setText("");
        signupbutton.setEnabled(false);
    }
    
    public void validateFields(){
        String name = txtname.getText();
        String email = txtemail.getText();
        String password = txtpass.getText();
        
        if(!password.equals("")&& !name.equals("")&& email.matches(emailPattern)){
            signupbutton.setEnabled(true);
        }
        else{
            signupbutton.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        verflog = new javax.swing.JToggleButton();
        signupbutton = new javax.swing.JToggleButton();
        exitbutton = new javax.swing.JButton();
        verifybutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(466, 420));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(470, 426));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/user.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        txtname.setFont(new java.awt.Font("Retro Gaming", 1, 18)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 255, 255));
        txtname.setBorder(null);
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 170, -1));

        txtemail.setFont(new java.awt.Font("Retro Gaming", 1, 14)); // NOI18N
        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        txtemail.setBorder(null);
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 170, -1));

        txtpass.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setBorder(null);
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassKeyReleased(evt);
            }
        });
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 160, -1));

        verflog.setBackground(new java.awt.Color(0, 0, 0));
        verflog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgRegister/verified login.png"))); // NOI18N
        verflog.setBorder(null);
        verflog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verflogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verflogMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verflogMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                verflogMouseReleased(evt);
            }
        });
        verflog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verflogActionPerformed(evt);
            }
        });
        jPanel1.add(verflog, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        signupbutton.setBackground(new java.awt.Color(0, 0, 0));
        signupbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgRegister/save.png"))); // NOI18N
        signupbutton.setBorder(null);
        signupbutton.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save/saveinactive.png"))); // NOI18N
        signupbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signupbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signupbuttonMouseReleased(evt);
            }
        });
        signupbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(signupbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        exitbutton.setBackground(new java.awt.Color(0, 0, 0));
        exitbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgRegister/Exit.png"))); // NOI18N
        exitbutton.setBorder(null);
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(exitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 20, 20));

        verifybutton.setBackground(new java.awt.Color(0, 0, 0));
        verifybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgRegister/verify account.png"))); // NOI18N
        verifybutton.setBorder(null);
        verifybutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verifybuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verifybuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verifybuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                verifybuttonMouseReleased(evt);
            }
        });
        verifybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifybuttonActionPerformed(evt);
            }
        });
        jPanel1.add(verifybutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 190, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgRegister/register.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void verflogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verflogActionPerformed
       setVisible(false);
       new Loginback().setVisible(true);
    }//GEN-LAST:event_verflogActionPerformed

    private void signupbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbuttonActionPerformed
        
        //User user = new user;
        String email = txtemail.getText();
        User user1 = null;
        user1 = Userdao.getEmail(email);
        
        if(user1 == null){
            otp o = new otp();
            int l = 6; //max lenght of otp
            String token = String.valueOf(o.method(l));


            User user = new User();
            user.setName(txtname.getText());
            user.setEmail(txtemail.getText());
            user.setPassword(txtpass.getText());
            user.setToken(token);
            Userdao.save(user);
            clear();

            Smtp smtp = null;
            smtp = smtpdao.getSMTP();
            String email1 = smtp.getEmail();
            String password = smtp.getPassword();

            Mail mail = new Mail();
            mail.setupSeverProperties();
            try {

                mail.draftEmail(email,token);
                mail.sendEmail(smtp.getEmail(),smtp.getPassword());

            } catch (Exception ex){
                ex.printStackTrace();
            }
        
            setVisible(false);
            new verifyaccount().setVisible(true);
            
        } else {
           JOptionPane.showMessageDialog(null,"<html><b style =\"color:red\">Email alreay exist</b></html>","Message", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
        
    }//GEN-LAST:event_signupbuttonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to close the application?","Select",JOptionPane.YES_NO_OPTION);
        if (a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        validateFields();
    }//GEN-LAST:event_txtnameKeyReleased

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
       validateFields();
    }//GEN-LAST:event_txtemailKeyReleased

    private void txtpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyReleased
       validateFields();
    }//GEN-LAST:event_txtpassKeyReleased

    private void verifybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifybuttonActionPerformed
        // TODO add your handling code here:
       setVisible(false);
       new verifyaccount().setVisible(true);
    }//GEN-LAST:event_verifybuttonActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void signupbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupbuttonMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Save\\";
        String i ="savehover.png";
        icon = new ImageIcon(d+i2+i);
        signupbutton.setIcon(icon);
    }//GEN-LAST:event_signupbuttonMouseEntered

    private void signupbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupbuttonMousePressed
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Save\\";
        String i ="saveclicked.png";
        icon = new ImageIcon(d+i2+i);
        signupbutton.setIcon(icon);
    }//GEN-LAST:event_signupbuttonMousePressed

    private void signupbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupbuttonMouseReleased
        // TODO add your handling code here:
         ImageIcon icon;
        String i2 ="Save\\";
        String i ="save.png";
        icon = new ImageIcon(d+i2+i);
        signupbutton.setIcon(icon);
    }//GEN-LAST:event_signupbuttonMouseReleased

    private void verifybuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifybuttonMouseEntered
        // TODO add your handling code here:
         ImageIcon icon;
        String i2 ="verifyaccount\\";
        String i ="verifyglitch.gif";
        icon = new ImageIcon(d+i2+i);
        verifybutton.setIcon(icon);
    }//GEN-LAST:event_verifybuttonMouseEntered

    private void verifybuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifybuttonMousePressed
        // TODO add your handling code here:
         ImageIcon icon;
        String i2 ="verifyaccount\\";
        String i ="verifyclicked1.png";
        icon = new ImageIcon(d+i2+i);
        verifybutton.setIcon(icon);
    }//GEN-LAST:event_verifybuttonMousePressed

    private void verifybuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifybuttonMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="verifyaccount\\";
        String i ="verifyglitch1.png";
        icon = new ImageIcon(d+i2+i);
        verifybutton.setIcon(icon);
    }//GEN-LAST:event_verifybuttonMouseExited

    private void verifybuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifybuttonMouseReleased
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="verifyaccount\\";
        String i ="verifyglitch1.png";
        icon = new ImageIcon(d+i2+i);
        verifybutton.setIcon(icon);
    }//GEN-LAST:event_verifybuttonMouseReleased

    private void verflogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verflogMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Verifiedlogin\\";
        String i ="verfiedloginhover.png";
        icon = new ImageIcon(d+i2+i);
        verflog.setIcon(icon);
    }//GEN-LAST:event_verflogMouseEntered

    private void verflogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verflogMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Verifiedlogin\\";
        String i ="verfiedlogin.png";
        icon = new ImageIcon(d+i2+i);
        verflog.setIcon(icon);
    }//GEN-LAST:event_verflogMouseExited

    private void verflogMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verflogMouseReleased
        // TODO add your handling code here:
         ImageIcon icon;
        String i2 ="Verifiedlogin\\";
        String i ="verfiedlogin.png";
        icon = new ImageIcon(d+i2+i);
        verflog.setIcon(icon);
    }//GEN-LAST:event_verflogMouseReleased

    private void verflogMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verflogMousePressed
        // TODO add your handling code here:
         ImageIcon icon;
        String i2 ="Verifiedlogin\\";
        String i ="verfiedloginclick.png";
        icon = new ImageIcon(d+i2+i);
        verflog.setIcon(icon);
    }//GEN-LAST:event_verflogMousePressed

    private void signupbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupbuttonMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Save\\";
        String i ="save.png";
        icon = new ImageIcon(d+i2+i);
        signupbutton.setIcon(icon);
    }//GEN-LAST:event_signupbuttonMouseExited

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton signupbutton;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JToggleButton verflog;
    private javax.swing.JButton verifybutton;
    // End of variables declaration//GEN-END:variables
}
