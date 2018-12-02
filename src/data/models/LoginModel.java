/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mvc.model;
package data.models;

import java.sql.*;
import java.sql.Connection;

import data.SQLConnector;
import data.DatabaseEnum;

/**
 *
 * @author conor_000
 */
public class LoginModel
{
    Connection conn = null;
    private boolean loginValid = false;

    public boolean getLogin()
    {
        return loginValid;
    }

    public void loginValidation(String user, char [] passChars ) throws Exception
    {
        if(passChars!=null) {
            String pass = new String(passChars);
            //add '' to values to allow them to be added to sql queries
            user = "'" + user  + "'";
            pass = "'" + pass + "'";
            SQLConnector SQLconn = new SQLConnector();
            SQLconn.getConnection(DatabaseEnum.MYSQL);
            String [] columns = {"username", "password"};
            ResultSet rs = SQLconn.select("users", columns, " WHERE username =" + user + " AND PASSWORD =" + pass, null );
            if(rs.next()) {
                //found
                loginValid = true;
            } else {
                //not found
                loginValid = false;
            }
            //System.out.println(loginValid);
            rs.close();
            SQLconn.closeConnection();
        }
        else
            System.out.println("Invalid password passed");
    }
}

