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
public class DrinksController implements Initializable, ControlledScreen {

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
    private void goToMainMenu(ActionEvent event){
        myController.setScreen(Screens.MAIN_MENU);
    }

    @FXML
    private void getClubOrange(ActionEvent event){
        System.out.println("Club Orange is clicked");
    }
    @FXML
    private void getCocacola(ActionEvent event){
        System.out.println("COCACOLA is clicked");
    }
    @FXML
    private void getDietcocacola(ActionEvent event){
        System.out.println("DIETCOCACOLA is clicked");
    }
    @FXML
    private void getPepsi(ActionEvent event){
        System.out.println("PEPSI is clicked");
    }
    @FXML
    private void getPepsiMax(ActionEvent event){
        System.out.println("PEPSIMAX is clicked");
    }
    @FXML
    private void getSevenUp(ActionEvent event){
        System.out.println("SEVENUP is clicked");
    }
    @FXML
    private void getSprite(ActionEvent event){
        System.out.println("SPRITE is clicked");
    }
    @FXML
    private void getWater(ActionEvent event){
        System.out.println("WATER is clicked");
    }

}
