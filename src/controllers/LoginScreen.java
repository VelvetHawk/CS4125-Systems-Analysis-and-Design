package controllers;


import display.views.Screens;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import main.Restaurant;
import models.LoginModel;

import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.ResourceBundle;





/**
 * FXML Controller class
 *
 * @author maqayoom
 */
public class LoginScreen implements Initializable, ControlledScreen {

    private LoginModel model;
    boolean loginValid = false;
    // the field are fxml input from the user
    @FXML private TextField username;
    @FXML private PasswordField password;

    ScreensController myController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        model = new LoginModel();
    }

    public void setScreenParent( ScreensController screenParent){ myController = screenParent; }


    public void checkCredentials(String username, char[] password)
    {
        try { // check username and password in model wiht login validations method that's a void method.
            model.loginValidation(username, password);
            //System.out.println("DEBUG: meep after");
            loginValid = model.getLogin();
            if(!loginValid) {
                setMessage("invalid name or password");
                clear_loging_textFields();  // clear users input
            }
        } catch (Exception ex) {
            //ex.printStackTrace();
        }
    }
    public boolean getLoginValid(){
        return this.loginValid;
    }
    public void setMessage(String message)      // get the dialog box for any errors in the validations
    {
        System.out.println(message);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Login");
        alert.setHeaderText("Login, Information");
        alert.setContentText(message);
        alert.showAndWait();
        //msg = new JLabel(message);
        //add(msg);
    }
    // clear text fields
    public void clear_loging_textFields()
    {
        username.setText("");
        password.setText("");
    }

    @FXML
    private void goToMainScreen(javafx.event.ActionEvent event){ // only if the user press back this will return the user to the main screen
        myController.setScreen(Screens.MAIN);
    }

    @FXML
    private void goToMainMenu(javafx.event.ActionEvent event){ // only if the user is successfully logged in then, it'll take the user to the main menu
        String user = username.getText();
        String userpassword = password.getText();
        char [] password1 = userpassword.toCharArray();
        //char [] password =password_field.getText();
        if(user.isEmpty() || password1.length == 0){
            setMessage("Please enter your username and password");

        }else{  // check in the login controller if the user and password are correct.
            checkCredentials(user, password1);
            if(getLoginValid() == true){
                myController.setScreen(Screens.MAIN_MENU);
            }
        }
    }

}