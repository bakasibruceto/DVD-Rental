/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Genre;
import java.sql.*;

public class Genredao {
    
    public static void save(Genre genre){
        String query = "insert into genre (genre) values('"+genre.getGenre()+"')";
        DBOperation.setDataOrDelete(query, "Genre Added Succesfully");
        
    }
    
    /*
    public static getGenreid(String genre){
        Genre genre = new Genre();
         try {
            ResultSet rs = DBOperation.getData("Select * from genre where genre ="+genre+"'");
            while(rs.next()){
                genre.getId(rs.getInt("genreid"));
                
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return genre;
        
        
    }*/
    
    
    
    public static ArrayList<Genre> getAllRecords(){
        ArrayList<Genre> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBOperation.getData("select*from genre");
            while(rs.next()){
                Genre genre = new Genre();
                genre.setId(rs.getInt("genreid"));
                genre.setGenre(rs.getString("genre"));
                arrayList.add(genre);
                
            }
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
        return arrayList;
    }
    
    public static void delete(String id){
        String query = "delete from genre where genreid = '"+id+"'";
        DBOperation.setDataOrDelete(query, "Genre Deleted Succesfully");
    }
}
