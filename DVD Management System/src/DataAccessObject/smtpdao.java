/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Smtp;

/**
 *
 * @author ASUS-NOTEBOOK
 */
public class smtpdao {
    public static Smtp getSMTP(){
        Smtp smtp = new Smtp();
         try {
            ResultSet rs = DBOperation.getData("select * from smtp");
            while(rs.next()){
                
                smtp.setEmail(rs.getString("email"));
                smtp.setPassword(rs.getString("password"));
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return smtp;
        
    }
    public static void updateSmtp(Smtp smtp){
        String query = "update smtp set email = '"+smtp.getEmail()+"', password='"+smtp.getPassword()+"'";
        DBOperation.setDataOrDelete(query,"Smtp Updated Succesfully.");
    }
    
}
