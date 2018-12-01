package controllers;

import main.Restaurant;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author maqayoom
 */
public class MainScreen implements Initializable, ControlledScreen {

    ScreensController myController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setScreenParent(ScreensController screenParent){ myController = screenParent; }


    @FXML
    private void goToLogin(javafx.event.ActionEvent event){
        myController.setScreen(Restaurant.loginScreenId);
    }


    @FXML
    private void goToRegistration(javafx.event.ActionEvent event){
        myController.setScreen(Restaurant.registrationId);
    }


}