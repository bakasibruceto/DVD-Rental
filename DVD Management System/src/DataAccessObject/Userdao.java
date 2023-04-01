/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;
import javax.swing.JOptionPane;



import model.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS-NOTEBOOK
 */
public class Userdao{

    public static User get;
  /*  
  public static void main(String[] args){
      Mail mail = new Mail();
      mail.setupSeverProperties();
      mail.draftEmail();
      mail.sendEmail();
      
      
  }
  
  private void sendEmail(){
      
  }
  
  private void draftEmail(){
      
  }
  
  private void setupServerProperties(){
      Properties.put
  }
    */
    
     public static void delete(String id){
        String query = "delete from user where userid ='"+id+"';";
        DBOperation.setDataOrDelete(query,"User Deleted Succesfully.");
        
    }
    
    public static void updateUser(User user){
        String query = "update user set name = '"+user.getName()+"', email='"+user.getEmail()+"', password= '"+user.getPassword()+"' where userid ="+user.getId();
        DBOperation.setDataOrDelete(query,"User Updated Succesfully.");
    }
   public static ArrayList<User> getAllRecords(){
        ArrayList<User> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBOperation.getData("select * from User where type = 2");
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("userid"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                
                
                arrayList.add(user);
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        return arrayList;
   }
   public static ArrayList<User> getAllRecord(int id){
        ArrayList<User> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBOperation.getData("select * from User where userid ="+id);
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("userid"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                
                
                arrayList.add(user);
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        return arrayList;
   }
  
    
    
 
    
    public static void save(User user){
        
       
        String query = "insert into user (Name, Email, Password,Token, Status) values ('"+user.getName()+"','"+user.getEmail()+"','"+user.getPassword()+"','"+user.getToken()+"','Disabled')";
        DBOperation.setDataOrDelete(query,"Your account is now registered. Verify your account.");
        
        
        
    }
    
    public static User getEmail (String email){
        
        User user = null;
        try{
            ResultSet rs = DBOperation.getData("Select * from user where email = '" + email + "'");
            while(rs.next()){
                user = new User();
                user.setEmail(rs.getString("email"));
                
                
                
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
        
    }
    
    public static User getverify (String email){
        
        
        User user = null;
        try{
            ResultSet rs = DBOperation.getData("Select * from user where email = '" + email + "'");
            while(rs.next()){
                user = new User();
                user.setEmail(rs.getString("email"));
                user.setToken(rs.getString("token"));
                
                
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;        
    }
    
    public static User login(String email, String password){
            
        User user = null;
        try{
            ResultSet rs = DBOperation.getData("select * from user where email ='"+email+"' and password='"+password+"'");
            while(rs.next()){
                user = new User();
                user.setId(rs.getInt("userid"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setStatus(rs.getString("status"));
                user.setType(rs.getInt("type"));
                user.setToken(rs.getString("token"));
                user.setStatus(rs.getString("status"));
                
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    
    public static User getType(String email){
        User user = null;
        try{
            ResultSet rs = DBOperation.getData("Select * from user where email = '" + email + "'");
            while(rs.next()){
                user = new User();
                user.setEmail(rs.getString("email"));
                user.setType(rs.getInt("type"));
                
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    
    
    public static User getName(int id){
        User user = null;
        try{
            ResultSet rs = DBOperation.getData("Select name from user where userid = '" + id + "'");
            while(rs.next()){
                user = new User(); 
                user.setName(rs.getString("name"));

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    public static User getAll(int id){
        User user = null;
        try{
            ResultSet rs = DBOperation.getData("Select * from user where userid = '" + id + "'");
            while(rs.next()){  
                user = new User();
                user.setId(rs.getInt("userid"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setStatus(rs.getString("status"));
                user.setType(rs.getInt("type"));
                user.setToken(rs.getString("token"));
                user.setStatus(rs.getString("status"));

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    public static User getStatus(String id){
        User user = null;
        try{
            ResultSet rs = DBOperation.getData("Select * from user where email = '" + id + "'");
            while(rs.next()){  
                 user = new User();
                 user.setStatus(rs.getString("status"));
                 user.setEmail(rs.getString("email"));

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    public static User getId(String email){
        User user = null;
        try{
            ResultSet rs = DBOperation.getData("Select userid from user where email = '" + email + "'");
            while(rs.next()){
                user = new User(); 
                user.setId(rs.getInt("userid"));

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    
    
    public static User getToken(String email){
        User user = null;
        try{
            ResultSet rs = DBOperation.getData("Select * from user where email = '" + email + "'");
            while(rs.next()){
                user = new User();
                user.setEmail(rs.getString("email"));
                user.setToken(rs.getString("token"));
                
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    public static User getPassword(String email){
        User user = null;
        try{
            ResultSet rs = DBOperation.getData("Select * from user where email = '" + email + "'");
            while(rs.next()){
                user = new User();
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    
   public static void update(String email, String newPassword){
       String query = "update user set password='"+newPassword+"' where email = '"+email+"'";
       DBOperation.setDataOrDelete(query, "Password Changed Successfully!");
       
   }
   
   public static void updateEmail(String email, String newEmail){
       String query = "update user set email='"+newEmail+"' where email = '"+email+"'";
       DBOperation.setDataOrDelete(query, "Email Changed Successfully!");
       
   }
   
   public static void updateStatus(String email){
   String query = "update user set status ='Active' where email = '"+email+"'";
   DBOperation.setDataOrDelete(query, "Your Account is now Verified!");
       
   }
   
   public static void updateName(String name, String email, String password){
   String query = "update user set name ='"+name+"'where email ='"+email+"'and password ='"+password+"'";
   DBOperation.setDataOrDelete(query, "Your name is now Changed");
       
   }
   
   public static void updateToken(String email, String newToken){
   String query = "update user set token ='"+newToken+"' where email = '"+email+"'";
   DBOperation.setDataOrDelete(query, "");
       
   }
   
   
   
    
}
