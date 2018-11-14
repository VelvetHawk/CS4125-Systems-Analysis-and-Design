/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mvc.model;
package models;

import java.sql.*;
import java.sql.Connection;

import data.SQLConnector;

/**
 *
 * @author conor_000
 */
public class LoginModel {

   Connection conn = null;
   private boolean loginValid = false;

   public boolean getLogin(){
       return loginValid;
   }

   public void loginValidation(String user, String passChars ) throws Exception{


   if(passChars!=null) {
       String pass=new String(passChars);
       SQLConnector SQLconn = new SQLConnector();
       conn = SQLconn.getConnection();

	    String sql="SELECT Username, Password FROM Users where username=? and password=?";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,user);
        ps.setString(2,pass);
        ResultSet rs=ps.executeQuery();
        System.out.println(rs);
        if(rs.next()) {
           //found

           loginValid = true;

        }
        else{
           //not found

           loginValid = false;

        }

        rs.close();
        ps.close();
        conn.close();

   }
   }
}

