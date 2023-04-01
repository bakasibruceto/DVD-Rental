/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dvd.management.system;

import DataAccessObject.Billdao;
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
import model.Bill;

/**
 *
 * @author ASUS-NOTEBOOK
 */
public class Reciept extends javax.swing.JFrame {
    public String d = "C:\\Users\\ASUS-NOTEBOOK\\Documents\\NetBeansProjects\\DVD Management System\\src\\icon\\";
    int dbid;
    int billID;
    /**
     * Creates new form Reciept
     */
    
    public Reciept() {
        initComponents();
        /*
        billID = 2;
        dbid = 1;
        Bill bill = new Bill();
        bill = Billdao.getAllbillid(billID);
        String s = String.valueOf(1);   
        txtID.setText(s);
        txtName.setText(bill.getName());
        txtEmail.setText(bill.getEmail());
        txtCode.setText(bill.getReturnCode());
        txtTotal.setText(bill.getTotal());*/
    }
    
    
  
    
    public Reciept(int billid, int userid) {
        initComponents();
        
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
        
        txtCode.setBackground(new java.awt.Color(0,0,1));
        txtduedate.setBackground(new java.awt.Color(0,0,1));
        txtTotal.setBackground(new java.awt.Color(0,0,1));
        jTable1.setBackground(new java.awt.Color(0,0,1));
        
        dbid = userid;
        billID = billid;
        Bill bill = new Bill();
        bill = Billdao.getAllbillid(billID);
        String s = String.valueOf(billID);
        txtCode.setEditable(false);
        txtduedate.setEditable(false);
        txtID.setText(s);
        txtName.setText(bill.getName());
        txtEmail.setText(bill.getEmail());
        txtCode.setText(bill.getReturnCode());
        txtduedate.setText(bill.getDuedate());
        String v = String.valueOf(bill.getCost());
        txtTotal.setText(v);
        txtTotal.setEditable(false);
        txtCode.setEditable(false);
        txtduedate.setEditable(false);
        
        jTable1.getTableHeader().setFont(new Font("Retro Gaming", Font.BOLD, 12));
        jTable1.getTableHeader().setForeground(new Color(255,255,255));
        
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(0,204,255));
        
        
        txtEmail.setBackground(new java.awt.Color(0,0,1));
        txtName.setBackground(new java.awt.Color(0,0,1));
       
        //
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
        txtID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        txtduedate = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtID.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setText("--");
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Genre", "Title", "Rentdate", "Returndate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(137, 92, 183));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(137, 92, 183));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 560, 40));

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
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        txtduedate.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtduedate.setForeground(new java.awt.Color(255, 255, 255));
        txtduedate.setBorder(null);
        jPanel2.add(txtduedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 150, -1));

        txtCode.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
        txtCode.setBorder(null);
        jPanel2.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 150, -1));

        txtTotal.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setBorder(null);
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 150, -1));

        txtEmail.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 170, -1));

        txtName.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 160, -1));

        jLabel1.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgbutons/RECEIPT.gif"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        ArrayList<Bill> list = Billdao.getAllRecordsById(billID, dbid);
        Iterator<Bill> itr = list.iterator();
        while(itr.hasNext()){
            Bill filmObj = itr.next();
            dtm.addRow(new Object[]{filmObj.getGenre(),filmObj.getTitle(),filmObj.getRentdate(),filmObj.getReturndate()});
            
        }
        
        
        //
        
    }//GEN-LAST:event_formComponentShown

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home(dbid).setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reciept().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtduedate;
    // End of variables declaration//GEN-END:variables
}