/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dvd.management.system;

import DataAccessObject.Userdao;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.User;

/**
 *
 * @author ASUS-NOTEBOOK
 */
public class modifyusers extends javax.swing.JFrame {
    public String d = "C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\icon\\";
    int dbid;
    /**
     * Creates new form NewJFrame1
     */
    public modifyusers() {
       
        initComponents();
        
        
    }
    
    
    public modifyusers(int id){
        
        initComponents();
        
        //jTable1.getTableHeader().setVisible(false);
        jTable1.getTableHeader().setFont(new Font("Retro Gaming", Font.BOLD, 12));
        jTable1.getTableHeader().setForeground(new Color(0,0,0));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.setShowGrid(false);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setBackground(new Color(0,0,0));
        jTable1.setOpaque(false);
       
        jScrollPane1.getColumnHeader().setVisible(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.getViewport().setBackground(Color.BLACK);
        jScrollPane1.getVerticalScrollBar().setBackground(Color.BLACK);
        jScrollPane1.getVerticalScrollBar().setUI(new BasicScrollBarUI(){
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
        
        txtEmail.setBackground(new java.awt.Color(0,0,1));
        txtPassword.setBackground(new java.awt.Color(0,0,1));
        txtName.setBackground(new java.awt.Color(0,0,1)); 
        
        dbid = id;
        User user = null;
        user = Userdao.getAll(id);
        btnSave.setEnabled(false);
        btnDelete.setEnabled(false);
        btnClear.setEnabled(false);
    }
    
     public void validateField(){
        String name = txtName.getText();
        String email = txtEmail.getText();
        
        String password = txtPassword.getText();
        
        if(!name.equals("") && !email.equals("") && !password.equals("")){
            btnSave.setEnabled(true);
        }
        else{
            btnSave.setEnabled(false);
        }
  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        nameIcon = new javax.swing.JLabel();
        emailicon = new javax.swing.JLabel();
        passicon = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        border = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/Modify table.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(137, 92, 183));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(137, 92, 183));
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 410, 240));

        jLabel1.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/ID.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        txtID.setFont(new java.awt.Font("Retro Gaming", 3, 18)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setText("--");
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 40, 40));

        txtName.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 170, -1));

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
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 170, -1));

        txtPassword.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 170, -1));

        nameIcon.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        nameIcon.setForeground(new java.awt.Color(255, 255, 255));
        nameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/user.png"))); // NOI18N
        jPanel1.add(nameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        emailicon.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        emailicon.setForeground(new java.awt.Color(255, 255, 255));
        emailicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/Email Icon.png"))); // NOI18N
        jPanel1.add(emailicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        passicon.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        passicon.setForeground(new java.awt.Color(255, 255, 255));
        passicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/Password Icon.png"))); // NOI18N
        jPanel1.add(passicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/delete.png"))); // NOI18N
        btnDelete.setBorder(null);
        btnDelete.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete/deleteinactive.png"))); // NOI18N
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDeleteMouseReleased(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/save.png"))); // NOI18N
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
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/Trash icon.png"))); // NOI18N
        btnClear.setBorder(null);
        btnClear.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clear/Trash_iconinactive.png"))); // NOI18N
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
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

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
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/Text box.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/Text box.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/Text box.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/Modify users.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 90));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/Exit.png"))); // NOI18N
        jButton1.setBorder(null);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        border.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/border.png"))); // NOI18N
        jPanel1.add(border, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
        
        
    }//GEN-LAST:event_jTable1ComponentShown

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        User user = new User();
        int id = Integer.parseInt(txtID.getText());
        user.setId(id);
        user.setName(txtName.getText());
        user.setEmail(txtEmail.getText());
        user.setPassword(txtPassword.getText());
        
        Userdao.updateUser(user);
        setVisible(false);
        
        modifyusers ep;
        ep = new modifyusers(dbid);
        ep.setVisible(true);
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        setVisible(false);  
        new modifyusers(dbid).setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        adminHome ep;
        ep = new adminHome(dbid);
        ep.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String id = txtID.getText();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to Delete this User?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            Userdao.delete(id);
            setVisible(false);
            modifyusers ep;
            ep = new modifyusers(dbid);
            ep.setVisible(true);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        String id = model.getValueAt(index, 0).toString();
        
        txtID.setText(id);
        
       
        String name = model.getValueAt(index, 1).toString();
        txtName.setText(name);
        
        String email = model.getValueAt(index, 2).toString();
        txtEmail.setText(email);
        
        String password = model.getValueAt(index, 3).toString();
        txtPassword.setText(password);
        
        
        
        
        btnSave.setEnabled(true);
        btnDelete.setEnabled(true);
        btnClear.setEnabled(true);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        ArrayList<User> list = Userdao.getAllRecords();
        Iterator<User> itr = list.iterator();
        while(itr.hasNext()){
            User filmObj = itr.next();
            dtm.addRow(new Object[]{filmObj.getId(),filmObj.getName(),filmObj.getEmail(),filmObj.getPassword()});
            
        }
    }//GEN-LAST:event_formComponentShown

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Clear\\";
        String i ="Trash iconhover.png";
        icon = new ImageIcon(d+i2+i);
        btnClear.setIcon(icon);
        
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        // TODO add your handling code here:ImageIcon icon;
        ImageIcon icon;
        String i2 ="Update\\";
        String i ="updateclicked.png";
        icon = new ImageIcon("C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\images\\trash icon.png");
        btnClear.setIcon(icon);
        
    }//GEN-LAST:event_btnClearMouseExited

    private void btnClearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseReleased
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Update\\";
        String i ="updateclicked.png";
        icon = new ImageIcon("C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\images\\trash icon.png");
        btnClear.setIcon(icon);
    }//GEN-LAST:event_btnClearMouseReleased

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

    private void btnClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMousePressed
        // TODO add your handling code here:
         ImageIcon icon;
        String i2 ="Clear\\";
        String i ="Trash iconclicked.png";
        icon = new ImageIcon(d+i2+i);
        btnClear.setIcon(icon);
    }//GEN-LAST:event_btnClearMousePressed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Delete\\";
        String i ="deletehover.png";
        icon = new ImageIcon(d+i2+i);
        btnDelete.setIcon(icon);
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Delete\\";
        String i ="delete.png";
        icon = new ImageIcon(d+i2+i);
        btnDelete.setIcon(icon);
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMousePressed
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Delete\\";
        String i ="deleteclick.png";
        icon = new ImageIcon(d+i2+i);
        btnDelete.setIcon(icon);
    }//GEN-LAST:event_btnDeleteMousePressed

    private void btnDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseReleased
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Delete\\";
        String i ="delete.png";
        icon = new ImageIcon(d+i2+i);
        btnDelete.setIcon(icon);
    }//GEN-LAST:event_btnDeleteMouseReleased

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
            java.util.logging.Logger.getLogger(modifyusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modifyusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modifyusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modifyusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modifyusers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel border;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel emailicon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nameIcon;
    private javax.swing.JLabel passicon;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
