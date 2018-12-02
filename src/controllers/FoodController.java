package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import display.views.PopUpScreens;
import display.views.Screens;
import javafx.scene.control.Button;
import main.Restaurant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author maqayoom
 */
public class FoodController implements Initializable, ControlledScreen
{
    ScreensController myController;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
    public void setScreenParent(ScreensController screenParent)
    {
        myController = screenParent;
    }

    @FXML
    private void goToMainMenu(ActionEvent event)
    {
        // TODO: Close dialogue box
        ((Button)event.getTarget()).getScene().getWindow().hide();
    }

    @FXML
    private void getPlanBurger(ActionEvent event)
    {
        // TODO: Make food choice popup appear
        myController.setPopUpScreen(PopUpScreens.SELECT_SIDE_OR_DRINK);
        System.out.println("PLANE BURGER is clicked");
    }

    @FXML
    private void getDoubleBurger(ActionEvent event)
    {
        System.out.println("Double BURGER is clicked");
        // TODO: Make food choice popup appear
        myController.setPopUpScreen(PopUpScreens.SELECT_SIDE_OR_DRINK);
    }

    @FXML
    private void getRegularBurger(ActionEvent event)
    {
        System.out.println("Regular BURGER is clicked");
        // TODO: Make food choice popup appear
        myController.setPopUpScreen(PopUpScreens.SELECT_SIDE_OR_DRINK);
    }

    @FXML
    private void getShamKebab(ActionEvent event)
    {
        System.out.println("sham kebab is clicked");
        // TODO: Make food choice popup appear
        myController.setPopUpScreen(PopUpScreens.SELECT_SIDE_OR_DRINK);
    }

    @FXML
    private void getTavaKebab(ActionEvent event)
    {
        System.out.println("Tava kebab is clicked");
        // TODO: Make food choice popup appear
        myController.setPopUpScreen(PopUpScreens.SELECT_SIDE_OR_DRINK);
    }

    @FXML
    private void getSeekhKebab(ActionEvent event)
    {
        System.out.println("Seekh kebab  is clicked");
        // TODO: Make food choice popup appear
        myController.setPopUpScreen(PopUpScreens.SELECT_SIDE_OR_DRINK);
    }

    @FXML
    private void getLargePizza(ActionEvent event)
    {
        // TODO: Make food choice popup appear
        System.out.println("Topping choice selected");
        myController.setPopUpScreen(PopUpScreens.SELECT_TOPPING);
    }

    @FXML
    private void getMeduimPizza(ActionEvent event)
    {
        // TODO: Make food choice popup appear
        System.out.println("Topping choice selected");
        myController.setPopUpScreen(PopUpScreens.SELECT_TOPPING);
    }

    @FXML
    private void getSmallPizza(ActionEvent event)
    {
        // TODO: Make food choice popup appear
        System.out.println("Topping choice selected");
        myController.setPopUpScreen(PopUpScreens.SELECT_TOPPING);
    }
}
