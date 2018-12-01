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
public class MainMenu implements Initializable, ControlledScreen {

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
    private void goToMainScreen(ActionEvent event){
        myController.setScreen(Screens.MAIN);
    }

    @FXML
    private void goToOrderScreen(ActionEvent event){
        myController.setScreen(Screens.MAKE_ORDER);
    }

}
