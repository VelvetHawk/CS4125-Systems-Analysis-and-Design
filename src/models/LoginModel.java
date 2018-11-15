/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mvc.model;
package models;

import java.sql.Connection;

/**
 *
 * @author conor_000
 */
public class LoginModel {
    private Connection conn = null;
    private boolean loginValid = false;

    public boolean getLoginValid(){
       return loginValid;
    }

    public void setConnection(Connection conn ){
        this.conn = conn;
    }

    public Connection getConnection(){
        return conn;
    }


}

