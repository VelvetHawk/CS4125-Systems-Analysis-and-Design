/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mvc.view;

//import com.mvc.controller.LoginController;
package display.views;

import controllers.LoginController;



/*
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javaapplication5.LoginPage;
import javax.swing.*;

/**
 *
 * @author conor_000
 */

/*
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



*/



import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginView extends Application
{
    private RegisterView registration;

    private Button loginbtn, registrationbtn, clearbtn;
    private HBox hbBtn, hbtn1;
    private TextField userTextField;
    private Label userName, password_label;
    private PasswordField password_field;
    private GridPane grid;
    private Scene scene;
    private Text scenetitle;
    /*
    public static void main(String[] args) {
        launch(args);

    }
    */


    @Override
    public void start(Stage primaryStage)
    {
        // set the title to login
        primaryStage.setTitle("Login ");
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        // on the form itself set the titel to login
        scenetitle = new Text("Login");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        userTextField = new TextField();
        userTextField.setPromptText("User Name");
        grid.add(userTextField, 1, 1);

        password_label = new Label("Password:");
        grid.add(password_label, 0, 2);

        password_field = new PasswordField();
        password_field.setPromptText("Password");
        grid.add(password_field, 1, 2);
        // login button
        loginbtn = new Button("Sign in");
        hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_CENTER);
        hbBtn.getChildren().add(loginbtn);
        grid.add(loginbtn, 0, 4);

        //register button
        registrationbtn = new Button("Register");
        hbtn1 = new HBox(10);
        hbtn1.setAlignment(Pos.BOTTOM_CENTER);
        hbtn1.getChildren().add(registrationbtn);
        grid.add(registrationbtn,1,4);

        // clear button

        clearbtn = new Button("Clear");
        hbtn1 = new HBox(10);
        hbtn1.setAlignment(Pos.BOTTOM_CENTER);
        hbtn1.getChildren().add(clearbtn);
        grid.add(clearbtn,2,4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        LoginController controller = new LoginController(this);

        //controller.ButtonHandler handler = new controller.ButtonHandler();


        // login button action
        loginbtn.setOnAction(actionEvent -> {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Sign in button pressed");
            String user = userTextField.getText();
            String password = password_field.getText();
            if(user.isEmpty() || password.isEmpty()){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("Login Filed");
                alert.setContentText("Please enter your username and password");

                alert.showAndWait();
            }else{
                // check in the login controller if the user and password are correct.
                controller.checkCredentials(user, password);
            }


            //System.out.println("Name "+userTextField.getText()+"\n"+"Password "+password_field.getText());
        });
        // clear button action
        registrationbtn.setOnAction(actiontEvent -> {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Register button pressed");
            createAccount();
            primaryStage.close();

        });
        // clear button action
        clearbtn.setOnAction(actiontEvent -> {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Clear button pressed");
            clear_loging_textFields();
        });




        scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    // clear text fields
    public void clear_loging_textFields(){
        userTextField.setText("");
        password_field.setText("");
    }
    // create acount class method that class the Registration class, createUser is method in that class
    public void createAccount(){

        registration = new RegisterView();
        registration.createUser();
    }

    public void setMessage(String message){
        System.out.println(message);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Login");
        alert.setHeaderText("Login Filed, make sure the inputs are correct");
        alert.setContentText(message);

        alert.showAndWait();
        //msg = new JLabel(message);
        //add(msg);
    }


}
