package controllers;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import main.Restaurant;

import java.net.URL;
import java.util.ResourceBundle;



/**
 * FXML Controller class
 *
 * @author maqayoom
 */
public class LoginScreen implements Initializable, ControlledScreen {

    ScreensController myController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setScreenParent( ScreensController screenParent){ myController = screenParent; }


    @FXML
    private void goToMainScreen(javafx.event.ActionEvent event){ // only if the user press back this will return the user to the main screen
        myController.setScreen(Restaurant.mainScreenId);
    }
    @FXML
    private void goToMainMenu(javafx.event.ActionEvent event){ // only if the user is successfully logged in then, it'll take the user to the main menu
        myController.setScreen(Restaurant.mainMenuId);
    }


}