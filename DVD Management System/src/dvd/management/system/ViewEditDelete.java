/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dvd.management.system;

import java.util.ArrayList;
import java.util.*;
import model.Film;
import model.Genre;
import DataAccessObject.Genredao;
import DataAccessObject.Filmdao;
import DataAccessObject.Userdao;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicScrollBarUI;
import model.User;

/**
 *
 * @author ASUS-NOTEBOOK
 */
public class ViewEditDelete extends javax.swing.JFrame {
    /*
    File f = null;
    String filename = null;
    byte[] film_image = null;
    String fname = null;
    int s = 0;
    byte [] pimage = null;
    Connection con;
    PreparedStatement pst;*/
    public String d = "C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\icon\\";
    int dbid;
    
  
    

    /**
     * Creates new form AddFilm
     */
    public ViewEditDelete() {
        initComponents();
    }
    
    public ViewEditDelete(int id) {
        initComponents();
        dbid = id;
        User user = null;
        user = Userdao.getAll(id);
        btnSave.setEnabled(false);
        btnDelete.setEnabled(false);
        btnClear.setEnabled(false);
        
        
        
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
        
        
        
        txtDescription.setBackground(new java.awt.Color(0,0,1));
        txtGenre.setBackground(new java.awt.Color(0,0,1));
        txtPrice.setBackground(new java.awt.Color(0,0,1));
        txtTitle.setBackground(new java.awt.Color(0,0,1));
        txtYear.setBackground(new java.awt.Color(0,0,1));
        
    }
    
   

    
    public void validateField(){
        String title = txtTitle.getText();
        String price = txtPrice.getText();
        String genre = (String)txtGenre.getSelectedItem();
        String year = txtYear.getText();
        String description = txtDescription.getText();
        if(!title.equals("") && !price.equals("") && !year.equals("") && !description.equals("") && genre != null){
            btnSave.setEnabled(true);
           
            
        }
        else{
            btnSave.setEnabled(false);
            
        }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usr = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtTitle = new javax.swing.JTextField();
        txtGenre = new javax.swing.JComboBox<>();
        txtPrice = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtYear = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextPane();
        usr1 = new javax.swing.JLabel();

        usr.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        usr.setForeground(new java.awt.Color(204, 51, 0));
        usr.setText("User home");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 792));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setBorder(null);
        txtTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTitleKeyReleased(evt);
            }
        });
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 180, -1));

        txtGenre.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenreActionPerformed(evt);
            }
        });
        jPanel1.add(txtGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 200, -1));

        txtPrice.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtPrice.setBorder(null);
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 170, -1));

        lblId.setFont(new java.awt.Font("Retro Gaming", 1, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("00");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 40, 40));

        jLabel2.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/ID.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgEditfilm/save.png"))); // NOI18N
        btnSave.setBorder(null);
        btnSave.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save/saveinactive.png"))); // NOI18N
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
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 50, -1));

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgEditfilm/delete.png"))); // NOI18N
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
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, -1));

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgEditfilm/Trash icon.png"))); // NOI18N
        btnClear.setBorder(null);
        btnClear.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clear/Trash_iconinactive.png"))); // NOI18N
        btnClear.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clear/Trash_iconinactive.png"))); // NOI18N
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
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 50, -1));

        txtYear.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtYear.setForeground(new java.awt.Color(255, 255, 255));
        txtYear.setBorder(null);
        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });
        txtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtYearKeyReleased(evt);
            }
        });
        jPanel1.add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 170, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgEditfilm/back.png"))); // NOI18N
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
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(137, 92, 183));
        jTable1.setShowGrid(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(140);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 790, 160));

        txtDescription.setBorder(null);
        txtDescription.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(txtDescription);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 260, 160));

        usr1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usr1.setForeground(new java.awt.Color(204, 51, 0));
        usr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgEditfilm/EDITFILM.gif"))); // NOI18N
        jPanel1.add(usr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenreActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void txtTitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTitleKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtTitleKeyReleased

    private void txtYearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtYearKeyReleased

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtPriceKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        ArrayList<Film> list = Filmdao.getAllRecords();
        Iterator<Film> itr = list.iterator();
        while(itr.hasNext()){
            Film filmObj = itr.next();
            dtm.addRow(new Object[]{filmObj.getId(),filmObj.getGenre(),filmObj.getTitle(),filmObj.getDescription(),filmObj.getReleaseyear(),filmObj.getPrice(),filmObj.getPictures()});
            
        }
    }//GEN-LAST:event_formComponentShown

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here
        Film film = new Film();
        int id = Integer.parseInt(lblId.getText());
        film.setId(id);
        film.setTitle(txtTitle.getText());
        film.setDescription(txtDescription.getText());
        film.setPrice(txtPrice.getText());
        film.setGenre((String)txtGenre.getSelectedItem());
        int number = Integer.valueOf(txtYear.getText());
        film.setReleaseyear(number);
        //film.setPictures();
     
        Filmdao.update(film);
        
        
        
        setVisible(false);
        ViewEditDelete ep;
        ep = new ViewEditDelete(dbid);
        ep.setVisible(true);
        
        
        
        
     
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        setVisible(false);  
        new ViewEditDelete(dbid).setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        adminHome ep;
        ep = new adminHome(dbid);
        ep.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDescriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtDescriptionKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String id = lblId.getText();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to Delete this Film?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            Filmdao.delete(id);
            setVisible(false);
            ViewEditDelete ep;
            ep = new ViewEditDelete(dbid);
            ep.setVisible(true);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        String id = model.getValueAt(index, 0).toString();
        
        lblId.setText(id);
        String genre = model.getValueAt(index, 1).toString();
       
        String title = model.getValueAt(index, 2).toString();
        txtTitle.setText(title);
        
        String description = model.getValueAt(index, 3).toString();
        txtDescription.setText(description);
        
        String year = model.getValueAt(index, 4).toString();
        txtYear.setText(year);
        String price = model.getValueAt(index, 5).toString();
        txtPrice.setText(price);
        
        
        
        btnSave.setEnabled(true);
        btnDelete.setEnabled(true);
        btnClear.setEnabled(true);
        txtGenre.removeAllItems();
        txtGenre.addItem(genre);
        ArrayList<Genre> genreList = Genredao.getAllRecords();
        Iterator<Genre> genreItr = genreList.iterator();
        while(genreItr.hasNext()){
            Genre genreObj = genreItr.next();
            if(!genreObj.getGenre().equals(genre)){
                txtGenre.addItem(genreObj.getGenre());
            }
        }
        
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        // TODO add your handling code here:
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

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Clear\\";
        String i ="Trash iconhover.png";
        icon = new ImageIcon(d+i2+i);
        btnClear.setIcon(icon);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Save\\";
        String i ="save.png";
        icon = new ImageIcon(d+i2+i);
        btnSave.setIcon(icon);
        
        
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMousePressed
        // TODO add your handling code here:
         ImageIcon icon;
        String i2 ="Clear\\";
        String i ="Trash iconclicked.png";
        icon = new ImageIcon(d+i2+i);
        btnClear.setIcon(icon);
    }//GEN-LAST:event_btnClearMousePressed

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
        String i ="deleteclicked.png";
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

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Save\\";
        String i ="savehover.png";
        icon = new ImageIcon(d+i2+i);
        btnSave.setIcon(icon);
    }//GEN-LAST:event_btnSaveMouseEntered

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

    private void btnBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseReleased
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="back\\";
        String i ="back.png";
        icon = new ImageIcon(d+i2+i);
        btnBack.setIcon(icon);
    }//GEN-LAST:event_btnBackMouseReleased

    private void btnBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMousePressed
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="back\\";
        String i ="backclick.png";
        icon = new ImageIcon(d+i2+i);
        btnBack.setIcon(icon);
    }//GEN-LAST:event_btnBackMousePressed

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
            java.util.logging.Logger.getLogger(ViewEditDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEditDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEditDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEditDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEditDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextPane txtDescription;
    private javax.swing.JComboBox<String> txtGenre;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtYear;
    private javax.swing.JLabel usr;
    private javax.swing.JLabel usr1;
    // End of variables declaration//GEN-END:variables
}
