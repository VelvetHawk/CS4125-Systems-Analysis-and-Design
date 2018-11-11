/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mvc.view;

//import com.mvc.controller.LoginController;
package views;

import controllers.LoginController;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javaapplication5.LoginPage;
import javax.swing.*;

/**
 *
 * @author conor_000
 */
public class LoginView extends JFrame{
    
    private JLabel nameLabel;
    private JLabel passwordLabel;
    private JTextField nameText;
    private JPasswordField passwordField;
    private JButton submitButton;
    private JLabel errorLabel;
    private JLabel msg;
    
    public LoginView(){
    
    super("Log in!");
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(178,190);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    nameLabel = new JLabel("User ID: ");
    add(nameLabel);

    nameText = new JTextField(10);
    add(nameText);

    passwordLabel = new JLabel("Password: ");
    add(passwordLabel);

    passwordField = new JPasswordField(10);
    add(passwordField);

    submitButton = new JButton("Submit");
    add(submitButton);
    
    LoginController controller = new LoginController(this);
    
    //controller.ButtonHandler handler = new controller.ButtonHandler();
    
    submitButton.addActionListener( new ActionListener(){
        public void actionPerformed(ActionEvent e){
                String user = nameText.getText();
                char [] passChars =passwordField.getPassword();
                controller.checkCredentials(user, passChars);
                
                
            }
        }
        );
    }
    
    public void setMessage(String message){
		System.out.println(message);
        msg = new JLabel(message);
        add(msg);
    }

    //LoginPage.ButtonHandler handler = new LoginPage.ButtonHandler();
    //submitButton.addActionListener(handler);
    }



