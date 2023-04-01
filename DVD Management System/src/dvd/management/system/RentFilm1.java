/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dvd.management.system;


import DataAccessObject.Billdao;
import DataAccessObject.Filmdao;
import DataAccessObject.Genredao;
import DataAccessObject.Userdao;
import DataAccessObject.otp;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Bill;
import model.Film;
import model.Genre;
import model.User;

/**
 *
 * @author ASUS-NOTEBOOK
 */
public class RentFilm1 extends javax.swing.JFrame {
    public String d = "C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\icon\\";
    public int billId = 1;
    public int dbid;
    public int filmPrice = 0;
    public String emailPattern = "^(.+)@(.+)$";

    /**
     * Creates new form RentFilm
     */
    public RentFilm1() {
        
        initComponents();
        
    }
    
    public RentFilm1(int id) {
        initComponents();
        //jComboBox1.setRenderer((ListCellRenderer<? super String>) Color.BLACK);
        //jPanel1.getColorModel().
        
        //jComboBox1.setBackground(new java.awt.Color(0,0,1));
        //jComboBox1.getEditor().getEditorComponent().setBackground(Color.BLACK);
        //((JTextField) jComboBox1.getEditor().getEditorComponent()).setBackground(Color.BLACK);
        //jComboBox1.getEditor().getEditorComponent().setBackground(Color.red);
        
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
        
        
        
        
        jTable1.getTableHeader().setFont(new Font("Retro Gaming", Font.BOLD, 12));
        jTable1.getTableHeader().setForeground(new Color(255,255,255));
        
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(0,204,255));
        
        txtDate.setBackground(new java.awt.Color(0,0,1));
        txtDescription.setBackground(new java.awt.Color(0,0,1));
        txtEmail.setBackground(new java.awt.Color(0,0,1));
        txtFilmPrice.setBackground(new java.awt.Color(0,0,1));
        txtFilmTitle.setBackground(new java.awt.Color(0,0,1));
        txtName.setBackground(new java.awt.Color(0,0,1));
        txtSearch.setBackground(new java.awt.Color(0,0,1));
        txtYear.setBackground(new java.awt.Color(0,0,1));
        txtduedate.setBackground(new java.awt.Color(0,0,1));
        User user = null;
        user = Userdao.getAll(id);
        dbid = id;
        txtEmail.setText(user.getEmail());
        txtName.setText(user.getName());
        
        txtFilmTitle.setEditable(false);
        txtFilmPrice.setEditable(false);
        txtEmail.setEditable(false);
        txtName.setEditable(false);
        txtDescription.setEditable(false);
        txtDate.setEditable(false);
        txtYear.setEditable(false);
        txtduedate.setEditable(false);
        btnBill.setEnabled(false);
        
        SimpleDateFormat dFormat = new SimpleDateFormat("dd MMM yyyy");
        
        Date date = new Date();
        String rentDate = dFormat.format(date);
        Calendar c = Calendar.getInstance();
        
        txtDate.setText(rentDate);
        

        String duedate = dFormat.format(date); // Start date
       
        //c.setTime(dFormat.parse(duedate));
        c.add(Calendar.DATE, 7);  // number of days to add
        duedate = dFormat.format(c.getTime());  // dt is now the new date
        txtduedate.setText(duedate); // new date 
        
        
    
 
    }
    
    
    
    
    public void filmTitleByGenre(String genre){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Film> list = Filmdao.getAllRecordsByGenre(genre);
        Iterator<Film> itr = list.iterator();
        while(itr.hasNext()){
            Film filmObj = itr.next();
            if(!filmObj.getTitle().equals(genre)){
                dtm.addRow(new Object[]{filmObj.getTitle()});
            }
            
        }
        
    }
    
     public void filterFilmByTitle(String title, String genre){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Film> list = Filmdao.filterFilmbytitle(title, genre);
        Iterator<Film> itr = list.iterator();
        while(itr.hasNext()){
            Film filmObj = itr.next();
            dtm.addRow(new Object[]{filmObj.getTitle()});
        }
        
    }
     
     public void clearFilmFields(){
         txtFilmTitle.setText("");
         txtFilmPrice.setText("");
         txtDescription.setText("");
         txtYear.setText("");
         btnBill.setEnabled(false);
     }
     
     public void validateField(){
         
         if(filmPrice == 0){ 
             btnBill.setEnabled(false);
         }
         else{
             
             btnBill.setEnabled(true);
         }
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_id = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtFilmTitle = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextPane();
        txtFilmPrice = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnBill = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtduedate = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_id.setFont(new java.awt.Font("Retro Gaming", 1, 18)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_id.setText("--");
        jPanel1.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox1.setOpaque(true);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 190, -1));

        txtSearch.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.setBorder(null);
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 120, -1));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Film/s"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(137, 92, 183));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(137, 92, 183));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 160, 420));

        txtFilmTitle.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtFilmTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtFilmTitle.setBorder(null);
        jPanel1.add(txtFilmTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 152, -1));

        txtDescription.setBorder(null);
        txtDescription.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(txtDescription);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 250, 150));

        txtFilmPrice.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtFilmPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtFilmPrice.setBorder(null);
        jPanel1.add(txtFilmPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 150, 20));

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgModifyU/Trash icon.png"))); // NOI18N
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
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 570, -1, -1));

        btnBill.setBackground(new java.awt.Color(0, 0, 0));
        btnBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgrentfilm/rentgenerate_bill (1).png"))); // NOI18N
        btnBill.setBorder(null);
        btnBill.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rent generate/rentgenerateinactive.png"))); // NOI18N
        btnBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBillMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBillMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBillMouseReleased(evt);
            }
        });
        btnBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillActionPerformed(evt);
            }
        });
        jPanel1.add(btnBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, -1));

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
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        txtName.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 170, -1));

        txtEmail.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 170, -1));

        txtDate.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtDate.setForeground(new java.awt.Color(255, 255, 255));
        txtDate.setBorder(null);
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 150, -1));

        txtduedate.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtduedate.setForeground(new java.awt.Color(255, 255, 255));
        txtduedate.setBorder(null);
        txtduedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtduedateActionPerformed(evt);
            }
        });
        jPanel1.add(txtduedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 150, -1));

        txtYear.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtYear.setForeground(new java.awt.Color(255, 255, 255));
        txtYear.setBorder(null);
        jPanel1.add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 150, -1));

        jLabel6.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgrentfilm/RENT_FILM (1).gif"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home home;
        home = new Home(dbid);
        home.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearFilmFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtNameActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        billId = Integer.parseInt(Billdao.getId());
        lbl_id.setText(Billdao.getId());
        ArrayList<Genre> list = Genredao.getAllRecords();
        Iterator<Genre> itr = list.iterator();
        while(itr.hasNext()){
            Genre genreObj = itr.next();
            jComboBox1.addItem(genreObj.getGenre());
        }
        String genre = (String) jComboBox1.getSelectedItem();
        filmTitleByGenre(genre);
        
    }//GEN-LAST:event_formComponentShown

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String title = txtSearch.getText();
        String genre = (String) jComboBox1.getSelectedItem();
        filterFilmByTitle(title, genre);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String filmtitle = model.getValueAt(index, 0).toString();
        Film film = Filmdao.getFilmByTitle(filmtitle);
        txtFilmTitle.setText(film.getTitle());
        txtFilmPrice.setText(film.getPrice());
        txtDescription.setText(film.getDescription());
        String s = String.valueOf(film.getReleaseyear());
        txtYear.setText(s);
        filmPrice = Integer.parseInt(film.getPrice());    
        btnBill.setEnabled(true);
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String genre = (String) jComboBox1.getSelectedItem();
        filmTitleByGenre(genre);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillActionPerformed
        // TODO add your handling code here:
        Date todaydate = new Date();  
        otp o = new otp();
        int l = 6; //max lenght of otp
        String token = String.valueOf(o.method(l));    
        btnBill.setEnabled(true);
        //String customerName = txtName.getText();
        //String customerEmail = txtEmail.getText();
        String Film = txtFilmTitle.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd MMM yyyy");
        String rentDate = dFormat.format(todaydate);
        txtDate.setText(rentDate);
        int total = filmPrice;
        Boolean returnFilm = false;
        String genre = (String) jComboBox1.getSelectedItem();
        Bill bill = new Bill();
        bill.setId(billId);
        bill.setRentdate(rentDate);
        bill.setDuedate(txtduedate.getText());
        bill.setReturnFilm(returnFilm);
        //bill.setGenre(genre);
        bill.setReturnCode(token);
        bill.setTotal(total);  
        bill.setCost(total);
        Film film = null;
        film = Filmdao.getFilmByTitle(Film);
        int filmid = film.getId();
        
        bill.setFilmid(filmid);
        Billdao.save(bill, dbid);   
        setVisible(false);
       
        Filmdao.updaterentstatus(filmid);
        
        Home home;
        home = new Home(dbid);
        home.setVisible(true);
        //new Reciept(billId, dbid).setVisible(true);
        
        //validateField();
        //clearFilmFields();
 
    }//GEN-LAST:event_btnBillActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtduedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtduedateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtduedateActionPerformed

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Clear\\";
        String i ="Trash iconhover.png";
        icon = new ImageIcon(d+i2+i);
        btnClear.setIcon(icon);
        
    }//GEN-LAST:event_btnClearMouseEntered

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

    private void btnClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMousePressed
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="Clear\\";
        String i ="Trash iconclicked.png";
        icon = new ImageIcon(d+i2+i);
        btnClear.setIcon(icon);
    }//GEN-LAST:event_btnClearMousePressed

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

    private void btnBillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBillMouseEntered
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="rent generate\\";
        String i ="rentgenerateanimated.gif";
        icon = new ImageIcon(d+i2+i);
        btnBill.setIcon(icon);
    }//GEN-LAST:event_btnBillMouseEntered

    private void btnBillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBillMouseExited
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="rent generate\\";
        String i ="rentgenerate.png";
        icon = new ImageIcon("C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\imgrentfilm\\rentgenerate_bill (1).png");
        btnBill.setIcon(icon);
    }//GEN-LAST:event_btnBillMouseExited

    private void btnBillMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBillMousePressed
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="rent generate\\";
        String i ="rentgenerateclick.png";
        icon = new ImageIcon(d+i2+i);
        btnBill.setIcon(icon);
    }//GEN-LAST:event_btnBillMousePressed

    private void btnBillMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBillMouseReleased
        // TODO add your handling code here:
        ImageIcon icon;
        String i2 ="rent generate\\";
        String i ="rentgenerate.png";
        icon = new ImageIcon("C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\imgrentfilm\\rentgenerate_bill (1).png");
        btnBill.setIcon(icon);
    }//GEN-LAST:event_btnBillMouseReleased

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
            java.util.logging.Logger.getLogger(RentFilm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentFilm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentFilm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentFilm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentFilm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextPane txtDescription;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFilmPrice;
    private javax.swing.JTextField txtFilmTitle;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtYear;
    private javax.swing.JTextField txtduedate;
    // End of variables declaration//GEN-END:variables
}
