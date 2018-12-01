package controllers;

import java.net.URL;
import java.util.ResourceBundle;

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
        myController.setScreen(Restaurant.mainScreenId);
    }

    @FXML
    private void goToStaticScreen(ActionEvent event){
        myController.setScreen(Restaurant.staticChoiceId);
    }

}
