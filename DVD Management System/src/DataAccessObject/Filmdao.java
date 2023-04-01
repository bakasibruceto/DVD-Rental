/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Film;
import java.sql.*;


/**
 *
 * @author ASUS-NOTEBOOK
 */
public class Filmdao {
    
   
    
    
    
    public static void save(Film film){
        String query = "insert into film (genre, title, Description, Release_Year, Price) values ('"+film.getGenre()+"','"+film.getTitle()+"','"+film.getDescription()+"','"+film.getReleaseyear()+"','"+film.getPrice()+"')";
        DBOperation.setDataOrDelete(query,"Film added Succesfully");
    
    }
    
    public static ArrayList<Film> getAllRecords(){
        ArrayList<Film> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBOperation.getData("select * from film");
            while(rs.next()){
                Film film = new Film();
                film.setId(rs.getInt("filmid"));
                film.setGenre(rs.getString("genre"));
                film.setTitle(rs.getString("title"));
                film.setDescription(rs.getString("description"));
                film.setReleaseyear(rs.getInt("release_year"));
                film.setPrice(rs.getString("price"));
                film.setRentstatus(rs.getBoolean("rentstatus"));
                arrayList.add(film);
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        return arrayList;
    }
    
    public static void update(Film film){
        String query = "update film set genre = '"+film.getGenre()+"', title='"+film.getTitle()+"', description= '"+film.getDescription()+"', release_year ='"+film.getReleaseyear()+"', price='"+film.getPrice()+"'where filmid ='"+film.getId()+"';";
        DBOperation.setDataOrDelete(query,"Film Updated Succesfully.");
    }
    
    
    
    public static void updaterentstatus (int filmid){
        String query ="update film set rentstatus = true where filmid ="+filmid;
        DBOperation.setDataOrDelete(query,"");
    }
    
    public static void updaterentstatustofalse (int filmid){
        String query ="update film set rentstatus = false where filmid ="+filmid;
        DBOperation.setDataOrDelete(query,"");
    }
    
    public static void delete(String id){
        String query = "delete from film where filmid ='"+id+"';";
        DBOperation.setDataOrDelete(query,"Film Deleted Succesfully.");
        
    }
    public static ArrayList<Film> getAllRecordsByGenre(String genre){
        ArrayList<Film> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBOperation.getData("select film.filmid, film.genre, film.title, film.description, film.Release_Year, film.Price, film.rentstatus from film where genre ='"+genre+"' and rentstatus = false");
            while(rs.next()){
                Film film = new Film();
                film.setTitle(rs.getString("title"));
                arrayList.add(film);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    public static ArrayList<Film> filterFilmbytitle(String title, String genre){
        ArrayList<Film> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBOperation.getData("select film.filmid, film.genre, film.title, film.description, film.Release_Year, film.Price, film.rentstatus from film where title like'%"+title+"%' and genre = '"+genre+"' and rentstatus = false");
            while(rs.next()){
                Film film = new Film();
                film.setTitle(rs.getString("title"));
                film.setReleaseyear(rs.getInt("release_year"));
                arrayList.add(film);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static Film getFilmByTitle(String title){
        Film film = new Film();
         try {
            ResultSet rs = DBOperation.getData("select film.filmid, film.genre, film.title, film.description, film.Release_Year, film.Price, film.rentstatus from film where title='"+title+"'and rentstatus = false");
            while(rs.next()){
                
                film.setTitle(rs.getString(3));
                //film.setGenre(rs.getString(3));
                film.setId(rs.getInt("filmid"));
                film.setReleaseyear(rs.getInt("release_year"));
                film.setDescription(rs.getNString(4));
                film.setPrice(rs.getString(6));
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return film;
        
    }
    
     public static Film getFilmByTitletofalse(int id){
        Film film = new Film();
         try {
            ResultSet rs = DBOperation.getData("select film.filmid, film.genre, film.title, film.description, film.Release_Year, film.Price, film.rentstatus from film where filmid='"+id+"'and rentstatus = true");
            while(rs.next()){
                
                film.setTitle(rs.getString("title"));
                film.setId(rs.getInt("filmid"));
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return film;
        
    }
    

    
    
    
}
