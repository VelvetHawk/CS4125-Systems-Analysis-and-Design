package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import display.RegisterView;

public class RegisterLogin extends JFrame{
        JButton signInButton;
        JButton registerButton;
        public RegisterLogin(){
            super("Log in or Register");
            setLayout(new FlowLayout());
            setVisible(true);
            setSize(178,190);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            signInButton = new JButton("Sign In");
            registerButton = new JButton("Register");

            add(signInButton);
            add(registerButton);

            signInButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                      LoginView login = new LoginView();
                }
            });

            registerButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try {
                        RegisterView regView = new RegisterView();
                    }
                    catch(Exception exc){

                    }
                }
            } );

        }


}
