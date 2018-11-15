/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mvc.controller;

//import com.mvc.model.LoginModel;
//import com.mvc.view.LoginView;

package controllers;

import data.SQLConnector;
import models.LoginModel;
import display.views.LoginView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author conor_000
 */
public class LoginController {

    
    private LoginView view;
    private LoginModel model;
    private boolean loginValid = false;

    public LoginController(LoginView view){
         this.view = view;
         model = new LoginModel();
   }




   public void checkCredentials(String username, String password){



       try {

           loginValidation(username, password);
           loginValid = model.getLoginValid();
           if(loginValid){
               view.setMessage("Loggin in");
           }
           else{
               System.out.println("invalid");
               view.setMessage("invalid name or password");
           }
       } catch (Exception ex) {
           //Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    public void loginValidation(String user, String passChars ) throws Exception
    {


        if(passChars!=null) {
            String pass=new String(passChars);
            SQLConnector SQLconn = new SQLConnector();
            model.setConnection(SQLconn.getConnection());

            String sql="SELECT Username, Password FROM Users where username=? and password=?";
            PreparedStatement ps=model.getConnection().prepareStatement(sql);
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
            model.getConnection().close();

        }
    }
   
}
