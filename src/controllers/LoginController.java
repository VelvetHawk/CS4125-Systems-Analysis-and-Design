/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mvc.controller;

//import com.mvc.model.LoginModel;
//import com.mvc.view.LoginView;

package controllers;

import models.LoginModel;
import display.views.LoginView;

/**
 *
 * @author conor_000
 */
public class LoginController
{
    private LoginView view;
    private LoginModel model;
    boolean loginValid = false;
    
    public LoginController(LoginView view)
    {
         this.view = view;
         model = new LoginModel();
    }

    public void checkCredentials(String username, char[] password)
    {
        try {
            model.loginValidation(username, password);
            loginValid = model.getLogin();
            if(loginValid) {
                view.setMessage("Loggin in");
            } else {
                System.out.println("invalid");
                view.setMessage("invalid name or password");
            }
        } catch (Exception ex) {
           //Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean getLoginValid(){
        return this.loginValid;
    }
}
