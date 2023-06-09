/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dvd.management.system;

import DataAccessObject.Logdao;
import DataAccessObject.Userdao;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableModel;
import model.Log;
import model.User;

/**
 *
 * @author ASUS-NOTEBOOK
 */
public class EditProfile extends javax.swing.JFrame {
    public int dbid;
    public String d = "C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\icon\\";

    /**
     * Creates new form EditProfile
     */
    public EditProfile() {
        
        initComponents();
    }
    
    public EditProfile(int id) {
        initComponents();
        
        jTable1.getTableHeader().setFont(new Font("Retro Gaming", Font.BOLD, 12));
        jTable1.getTableHeader().setForeground(new Color(0,0,0));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.setShowGrid(false);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setBackground(new Color(0,0,0));
        jTable1.setOpaque(false);
        jScrollPane2.getColumnHeader().setVisible(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.getViewport().setBackground(Color.BLACK);
        jScrollPane2.getVerticalScrollBar().setBackground(Color.BLACK);
        jScrollPane2.getVerticalScrollBar().setUI(new BasicScrollBarUI(){
             @Override
             protected void configureScrollBarColors() {
                 
                 
            this.thumbColor = Color.cyan;
            }
             
            @Override
             protected JButton createDecreaseButton(int orientation) {
                return createZeroButton();
            }
            @Override    
            protected JButton createIncreaseButton(int orientation) {
                return createZeroButton();
            }
            private JButton createZeroButton() {
            JButton jbutton = new JButton();
            jbutton.setPreferredSize(new Dimension(0, 0));
            jbutton.setMinimumSize(new Dimension(0, 0));
            jbutton.setMaximumSize(new Dimension(0, 0));
            return jbutton;
        }

        });
        
        txtName.setBackground(new java.awt.Color(0,0,1));
        txtEmail.setBackground(new java.awt.Color(0,0,1));
        
        dbid = id;
        User user = null;
        user = Userdao.getAll(id);
        txtName.setText(user.getName());
        txtEmail.setText(user.getEmail());
        txtName.setEditable(false);
        txtEmail.setEditable(false);
        
        
        
        
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
        btnCname = new javax.swing.JButton();
        btnCemail = new javax.swing.JButton();
        btnCpassword = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCname.setBackground(new java.awt.Color(0, 0, 0));
        btnCname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgbutons/changename.png"))); // NOI18N
        btnCname.setBorder(null);
        btnCname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCnameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCnameMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCnameMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCnameMouseReleased(evt);
            }
        });
        btnCname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCnameActionPerformed(evt);
            }
        });
        jPanel1.add(btnCname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        btnCemail.setBackground(new java.awt.Color(0, 0, 0));
        btnCemail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgbutons/changeemail.png"))); // NOI18N
        btnCemail.setBorder(null);
        btnCemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCemailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCemailMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCemailMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCemailMouseReleased(evt);
            }
        });
        btnCemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCemailActionPerformed(evt);
            }
        });
        jPanel1.add(btnCemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        btnCpassword.setBackground(new java.awt.Color(0, 0, 0));
        btnCpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgbutons/changepassword.png"))); // NOI18N
        btnCpassword.setBorder(null);
        btnCpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCpasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCpasswordMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCpasswordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCpasswordMouseReleased(evt);
            }
        });
        btnCpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(btnCpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/back.png"))); // NOI18N
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
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        txtName.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 130, -1));

        txtEmail.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 130, -1));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Login History"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFillsViewportHeight(true);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(137, 92, 183));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(137, 92, 183));
        jTable1.setShowGrid(true);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 220, 250));

        jLabel1.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgedtiprofile/EDITPROFILE (1).gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //TODO add your handling code here:
        setVisible(false);
        Home home;
        home = new Home(dbid);
        home.setVisible(true);
         
       
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCnameActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ChangeName cn;
        cn = new ChangeName(dbid);
        cn.setVisible(true);
    }//GEN-LAST:event_btnCnameActionPerformed

    private void btnCemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCemailActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ChangeEmail ce;
        ce = new ChangeEmail(dbid);
        ce.setVisible(true);
    }//GEN-LAST:event_btnCemailActionPerformed

    private void btnCpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCpasswordActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ChangePassword cp;
        cp = new ChangePassword(dbid);
        cp.setVisible(true);
        
    }//GEN-LAST:event_btnCpasswordActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        ArrayList<Log> list = Logdao.getLogRecords(dbid);   
        Iterator<Log> itr = list.iterator();
        //ArrayList<User> lists = Userdao.getAllRecord(dbid);
       // Iterator<User> itrs = lists.iterator();
        while(itr.hasNext()){
            Log logObj = itr.next();
            //User userObj = itrs.next();
            dtm.addRow(new Object[]{logObj.getLogindate()});
            
        }
    }//GEN-LAST:event_formComponentShown

    private void btnCnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCnameMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Search\\";
        String i ="searchclicked.png";
        icon = new ImageIcon("C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\imgbutons\\changename.png");
        btnCname.setIcon(icon);
    }//GEN-LAST:event_btnCnameMouseExited

    private void btnCnameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCnameMouseReleased
        // TODO add your handling code here:
         ImageIcon icon;
        String i2 ="Search\\";
        String i ="searchclicked.png";
        icon = new ImageIcon("C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\imgbutons\\changename.png");
        btnCname.setIcon(icon);
    }//GEN-LAST:event_btnCnameMouseReleased

    private void btnCemailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCemailMouseExited
        // TODO add your handling code here:
         ImageIcon icon;
        String i2 ="Search\\";
        String i ="searchclicked.png";
        icon = new ImageIcon("C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\imgbutons\\changeemail.png");
        btnCemail.setIcon(icon);
    }//GEN-LAST:event_btnCemailMouseExited

    private void btnCemailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCemailMouseReleased
        // TODO add your handling code here:
          ImageIcon icon;
        String i2 ="Search\\";
        String i ="searchclicked.png";
        icon = new ImageIcon("C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\imgbutons\\changeemail.png");
        btnCemail.setIcon(icon);
    }//GEN-LAST:event_btnCemailMouseReleased

    private void btnCpasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCpasswordMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Search\\";
        String i ="searchclicked.png";
        icon = new ImageIcon("C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\imgbutons\\changepassword.png");
        btnCpassword.setIcon(icon);
    }//GEN-LAST:event_btnCpasswordMouseExited

    private void btnCpasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCpasswordMouseReleased
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Search\\";
        String i ="searchclicked.png";
        icon = new ImageIcon("C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\imgbutons\\changepassword.png");
        btnCpassword.setIcon(icon);
    }//GEN-LAST:event_btnCpasswordMouseReleased

    private void btnCnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCnameMouseEntered
        // TODO add your handling code here:
          ImageIcon icon;
        String i2 ="Change Name 2\\";
        String i ="Change nameanimated.gif";
        icon = new ImageIcon(d+i2+i);
        btnCname.setIcon(icon);
    }//GEN-LAST:event_btnCnameMouseEntered

    private void btnCnameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCnameMousePressed
        // TODO add your handling code here:
          ImageIcon icon;
        String i2 ="Change Name 2\\";
        String i ="Change nameclick.png";
        icon = new ImageIcon(d+i2+i);
        btnCname.setIcon(icon);
    }//GEN-LAST:event_btnCnameMousePressed

    private void btnCpasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCpasswordMouseEntered
        // TODO add your handling code here:
          ImageIcon icon;
        String i2 ="Change Password 2\\";
        String i ="changepasswordanimated.gif";
        icon = new ImageIcon(d+i2+i);
        btnCpassword.setIcon(icon);
    }//GEN-LAST:event_btnCpasswordMouseEntered

    private void btnCpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCpasswordMousePressed
        // TODO add your handling code here:
          ImageIcon icon;
        String i2 ="Change Password 2\\";
        String i ="changepasswordaclicked.png";
        icon = new ImageIcon(d+i2+i);
        btnCpassword.setIcon(icon);
    }//GEN-LAST:event_btnCpasswordMousePressed

    private void btnCemailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCemailMouseEntered
        // TODO add your handling code here:
          ImageIcon icon;
        String i2 ="Change email 2\\";
        String i ="changeemailanimated.gif";
        icon = new ImageIcon(d+i2+i);
        btnCemail.setIcon(icon);
    }//GEN-LAST:event_btnCemailMouseEntered

    private void btnCemailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCemailMousePressed
        // TODO add your handling code here:
          ImageIcon icon;
        String i2 ="Change email 2\\";
        String i ="changeemailclicked.png";
        icon = new ImageIcon(d+i2+i);
        btnCemail.setIcon(icon);
    }//GEN-LAST:event_btnCemailMousePressed

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
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCemail;
    private javax.swing.JButton btnCname;
    private javax.swing.JButton btnCpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
