package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import display.views.Screens;
import main.Restaurant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author maqayoom
 */
public class StaticChoiceController implements Initializable , ControlledScreen {

    ScreensController myController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }


    @FXML
    private void backButtonClicked(ActionEvent event)
    {
        //backButton.setText("Clicked!");
        System.out.println("Meep");
    }

    @FXML
    private void goBackToToMainMenu(javafx.event.ActionEvent event){ // only if the user is successfully logged in then, it'll take the user to the main menu
        myController.setScreen(Screens.MAIN_MENU);
    }
}
