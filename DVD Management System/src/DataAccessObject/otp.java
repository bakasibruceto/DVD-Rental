/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;

import java.util.*;

public class otp {
    
    public char[] method(int l){
        
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random r = new Random();
        char q[]=new char [l];
        for(int i = 0; i<l ; i++){
            q[i]=s.charAt(r.nextInt(s.length()));
        }
        return q;
    }
    
   
}
