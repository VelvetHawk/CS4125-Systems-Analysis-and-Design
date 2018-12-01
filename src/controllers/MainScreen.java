package controllers;

import display.views.Screens;
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
        myController.setScreen(Screens.LOGIN);
    }


    @FXML
    private void goToRegistration(javafx.event.ActionEvent event){
        myController.setScreen(Screens.REGISTRATION);
    }
// i was creating this just for the test
//    @FXML
//    private void goToDrinks(javafx.event.ActionEvent event){
//        myController.setScreen(Screens.Select_Drink);
//    }


}