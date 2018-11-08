/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mvc.model;

import java.sql.*;
import java.sql.Connection;

/**
 *
 * @author conor_000
 */
public class LoginModel {
   private Connection connect = null;
   Connection conn = null;
   private boolean loginValid = false;
   
   public boolean getLogin(){
       return loginValid;
   }
   
   public void loginValidation(String user, char [] passChars ) throws Exception{
       
   
   if(passChars!=null) { 
       String pass=new String(passChars);
       
       try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager
          .getConnection("jdbc:mysql://localhost/accounts?"
              + "user=sqluser&password=sqluserpw");

        String sql="SELECT username, password FROM TakeawayAccounts where username=? and password=?";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,user);
        ps.setString(2,pass);
        ResultSet rs=ps.executeQuery();
        if(rs.next()) {
           //found
           
           loginValid = true;
           /*
           errorLabel = new JLabel("Logging in");
           add(errorLabel);
           */
        }
        else{
           //not found
          
           loginValid = false;
           /*
           errorLabel = new JLabel("Invalid username or password");
           add(errorLabel);
           */
        }
        rs.close();
        ps.close();
        conn.close();
       }
       catch(ClassNotFoundException exc){
            System.out.println(exc);
            exc.printStackTrace();
            throw exc;
           
           //System.out.println("Could not find data");
       }
       
      catch(SQLException exc){
          exc.printStackTrace();
          throw exc;
      }
       finally{
           //close();
       }
   }
   }
}
