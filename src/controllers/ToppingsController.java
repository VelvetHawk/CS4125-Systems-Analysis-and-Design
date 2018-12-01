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
public class ToppingsController implements Initializable, ControlledScreen {

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
    private void goToFood(ActionEvent event){
        myController.setScreen(Screens.Select_Food);
    }

    @FXML
    private void getBeef(ActionEvent event){
        System.out.println("Beef is clicked");
    }
    @FXML
    private void getCheese(ActionEvent event){
        System.out.println("Cheese is clicked");
    }
    @FXML
    private void getChicken(ActionEvent event){
        System.out.println("Chicken is clicked");
    }
    @FXML
    private void getHam(ActionEvent event){
        System.out.println("Ham is clicked");
    }
    @FXML
    private void getMushroom(ActionEvent event){
        System.out.println("Mushroom is clicked");
    }
    @FXML
    private void getPepperoni(ActionEvent event){
        System.out.println("Pepperoni  is clicked");
    }
    @FXML
    private void getPineapple(ActionEvent event){
        System.out.println("Pineapple  is clicked");
    }
    @FXML
    private void getSausage(ActionEvent event){
        System.out.println("Sausage  is clicked");
    }

}
