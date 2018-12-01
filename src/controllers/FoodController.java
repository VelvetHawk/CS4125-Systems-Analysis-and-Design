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
public class FoodController implements Initializable, ControlledScreen {

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
    private void getPlanBurger(ActionEvent event){
        System.out.println("PLANE BURGER is clicked");
    }
    @FXML
    private void getDoubleBurger(ActionEvent event){
        System.out.println("Double BURGER is clicked");
    }
    @FXML
    private void getRegularBurger(ActionEvent event){
        System.out.println("Regular BURGER is clicked");
    }
    @FXML
    private void getShamKebab(ActionEvent event){
        System.out.println("sham kebab is clicked");
    }
    @FXML
    private void getTavaKebab(ActionEvent event){
        System.out.println("Tava kebab is clicked");
    }
    @FXML
    private void getSeekhKebab(ActionEvent event){
        System.out.println("Seekh kebab  is clicked");
    }
    @FXML
    private void getLargePizza(ActionEvent event){
        myController.setScreen(Screens.Select_Topping);

        System.out.println("Large Pizza  is clicked");
    }
    @FXML
    private void getMeduimPizza(ActionEvent event){
        myController.setScreen(Screens.Select_Topping);
        System.out.println("Medium Pizza  is clicked");
    }
    @FXML
    private void getSmallPizza(ActionEvent event){
        myController.setScreen(Screens.Select_Topping);
        System.out.println(" Small Pizza  is clicked");
    }

}
