/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Log;
import model.User;

/**
 *
 * @author ASUS-NOTEBOOK
 */
public class Logdao {
    
    public static void saveLog(Log log){
        
        String query = "insert into log (userid, logindate) values('"+log.getUserId()+"','"+log.getLogindate()+"')";
        DBOperation.setDataOrDelete(query, "");
        
    }
    
    public static ArrayList<Log> getLogRecords(int id){
    ArrayList<Log> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBOperation.getData("select * from log where userid ="+id);
            //"select * from log where userid ="+id
            while(rs.next()){
                
                Log log = new Log();
                //User user = new User();
                //user.setName(rs.getString("name"));
                //log.setLogId(rs.getInt("logid"));
                log.setLogindate(rs.getString("logindate"));
                arrayList.add(log);     
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        return arrayList;
    
}
    
        public static ArrayList<Log> getAllLogRecords(){
    ArrayList<Log> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBOperation.getData("select log.logid, user.name, log.logindate from log inner join user on user.userid = log.userid order by log.logid;");
            //"select * from log where userid ="+id
            while(rs.next()){
                
                Log log = new Log();
                log.setName(rs.getString("name"));
                log.setLogId(rs.getInt("logid"));
                log.setLogindate(rs.getString("logindate"));
                arrayList.add(log);     
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        return arrayList;
    
}
    
}
