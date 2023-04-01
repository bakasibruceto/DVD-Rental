/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Bill;


/**
 *
 * @author ASUS-NOTEBOOK
 */
public class Billdao {
    public static String getId(){
        int id = 1;
        
        
        try {
            ResultSet rs = DBOperation.getData("select max(id) from bill");
            if(rs.next()){
                id = rs.getInt(id);
                id = id+1;
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    
    public static void save (Bill bill, int userid){
        String query = "insert into bill values("+bill.getId()+","+userid+","+bill.getFilmid()+",'"+bill.getRentdate()+"','"+bill.getDuedate()+"','"+bill.getReturndate()+"','"+bill.getReturnCode()+"',"+bill.getReturnFilm()+","+bill.getCost()+")";
        DBOperation.setDataOrDelete(query, "Bill Details Added Succesfully");
        
    }
    
    
    
    public static Bill getToken(int userid, String token){
        Bill bill = null;
        try{
            ResultSet rs = DBOperation.getData("select bill.id, user.userid, film.filmid,user.name, user.email, film.genre, film.title, film.price,  bill.rentdate, bill.duedate, bill.returndate, bill.returncode, bill.returnfilm, bill.total from bill inner join user on user.userid = bill.userid inner join film on film.filmid = bill.filmid where bill.userid = "+userid+" and bill.returncode ='"+token+"'");
            while(rs.next()){
                bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setFilmid(rs.getInt("filmid"));
                bill.setTitle(rs.getString("title"));
                bill.setGenre(rs.getString("genre"));
                bill.setReturnFilm(rs.getBoolean("returnfilm"));
                bill.setReturnCode(rs.getString("returncode"));
                bill.setDuedate(rs.getString("duedate"));
                bill.setCost(rs.getInt("total"));
                
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return bill;
    }
    
    public static Bill getReturnFilm(String returncode){
        Bill bill = null;
        try{
            ResultSet rs = DBOperation.getData("Select * from bill where returncode = '" + returncode + "'");
            while(rs.next()){
                bill = new Bill();
                bill.setGenre(rs.getString("genre"));
                bill.setReturnFilm(rs.getBoolean("returnfilm"));
                
             
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return bill;
    }
    
    
    
    public static void update(String returncode, String date){
       String query = "update bill set returnfilm= true, returndate='"+date+"' where returncode = '"+returncode+"'";
       DBOperation.setDataOrDelete(query, "Film Returned Succesfully!");
       
   }
    public static void updateCost(String token, int cost){
       String query = "update bill set total = "+cost+" where returncode = '"+token+"'";
       DBOperation.setDataOrDelete(query, "");
       
   }
    
    
    public static ArrayList<Bill> getAllRecordsByReturnCode(String returncode){
        ArrayList<Bill> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBOperation.getData("select bill.id, user.userid, film.filmid,user.name, user.email, film.genre, film.title, film.price,  bill.rentdate, bill.duedate, bill.returndate, bill.returncode, bill.returnfilm, bill.total from bill inner join user on user.userid = bill.userid inner join film on film.filmid = bill.filmid where bill.returncode ='"+returncode+"'");
            while(rs.next()){
                Bill bill = new Bill();
                bill.setFilmid(rs.getInt("filmid"));
                bill.setId(rs.getInt("id"));
                bill.setGenre(rs.getString("genre"));
                bill.setTitle(rs.getString("title"));
                bill.setRentdate(rs.getString("rentdate"));
                bill.setReturndate(rs.getString("returndate"));
                bill.setDuedate(rs.getString("duedate"));
                bill.setReturnFilm(rs.getBoolean("returnfilm"));
                bill.setTotal(rs.getInt("price"));
                arrayList.add(bill);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    public static Bill getAllbillid(int billid){
        Bill bill = null;
        try{
            ResultSet rs = DBOperation.getData("select bill.id, user.userid, film.filmid,user.name, user.email, film.genre, film.title, film.price,  bill.rentdate, bill.duedate, bill.returndate, bill.returncode, bill.returnfilm, bill.total from bill inner join user on user.userid = bill.userid inner join film on film.filmid = bill.filmid where bill.id ="+billid);
            while(rs.next()){  
                bill = new Bill();
                bill.setFilmid(rs.getInt("filmid"));
                bill.setId(rs.getInt("id"));
                bill.setUserid(rs.getInt("userid"));
                bill.setName(rs.getString("user.name"));
                bill.setEmail(rs.getString("email"));
                bill.setGenre(rs.getString("genre"));
                bill.setTitle(rs.getString("title"));
                bill.setTotal(rs.getInt("price"));
                bill.setCost(rs.getInt("total"));
                bill.setRentdate(rs.getString("rentdate"));
                bill.setReturndate(rs.getString("returndate"));
                bill.setReturnCode(rs.getString("returncode"));
                bill.setDuedate(rs.getString("duedate"));
                bill.setReturnFilm(rs.getBoolean("returnfilm"));

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return bill;
    }
    
    public static Bill getAllbyuserid(int userid){
        Bill bill = null;
        try{
            ResultSet rs = DBOperation.getData("select bill.id, user.userid, film.filmid,user.name, user.email, film.genre, film.title, film.price,  bill.rentdate, bill.duedate, bill.returndate, bill.returncode, bill.returnfilm, bill.total from bill inner join user on user.userid = bill.userid inner join film on film.filmid = bill.filmid where user.userid ="+userid);
            while(rs.next()){  
                bill = new Bill();
                
                bill.setId(rs.getInt("id"));
                bill.setUserid(rs.getInt("userid"));
                bill.setName(rs.getString("user.name"));
                bill.setEmail(rs.getString("email"));
                bill.setGenre(rs.getString("genre"));
                bill.setTitle(rs.getString("title"));
                bill.setTotal(rs.getInt("price"));
                bill.setCost(rs.getInt("total"));
                bill.setRentdate(rs.getString("rentdate"));
                bill.setReturndate(rs.getString("returndate"));
                bill.setReturnCode(rs.getString("returncode"));
                bill.setReturnFilm(rs.getBoolean("returnfilm"));

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return bill;
    }
    
     
    public static ArrayList<Bill> getAllRecordsByUserId(int userid){
        ArrayList<Bill> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBOperation.getData("select bill.id, user.userid, film.filmid,user.name, user.email, film.genre, film.title, film.price,  bill.rentdate, bill.duedate, bill.returndate, bill.returncode, bill.returnfilm, bill.total from bill inner join user on user.userid = bill.userid inner join film on film.filmid = bill.filmid where user.userid ="+userid);
            while(rs.next()){
                Bill bill = new Bill();
                bill.setFilmid(rs.getInt("filmid"));
                bill.setId(rs.getInt("id"));
                bill.setGenre(rs.getString("genre"));
                bill.setTitle(rs.getString("title"));
                bill.setCost(rs.getInt("total"));
                bill.setUserid(rs.getInt("userid"));
                //bill.setName(rs.getString("user.name"));
                bill.setEmail(rs.getString("email"));

                bill.setTitle(rs.getString("title"));
                bill.setTotal(rs.getInt("price"));
                bill.setRentdate(rs.getString("rentdate"));
                bill.setReturndate(rs.getString("returndate"));
                bill.setReturnCode(rs.getString("returncode"));
                bill.setReturnFilm(rs.getBoolean("returnfilm"));
                arrayList.add(bill);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    
    
    
    public static ArrayList<Bill> getAllRecordsById(int id, int userid){
        ArrayList<Bill> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBOperation.getData("select bill.id, user.userid, film.filmid,user.name, user.email, film.genre, film.title, film.price,  bill.rentdate, bill.duedate, bill.returndate, bill.returncode, bill.returnfilm, bill.total from bill inner join user on user.userid = bill.userid inner join film on film.filmid = bill.filmid where id="+id);
            while(rs.next()){
                Bill bill = new Bill();
                bill.setFilmid(rs.getInt("filmid"));
                bill.setId(rs.getInt("id"));
                bill.setGenre(rs.getString("genre"));
                bill.setTitle(rs.getString("title"));
                bill.setRentdate(rs.getString("rentdate"));
                bill.setReturndate(rs.getString("returndate"));
                bill.setDuedate(rs.getString("duedate"));
                arrayList.add(bill);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    
    
}
