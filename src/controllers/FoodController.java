package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import consumables.Size;
import consumables.decorators.*;
import consumables.factories.FactoryProducer;
import consumables.food.Food;
import consumables.side.Sides;
import consumables.toppings.Toppings;
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
    private ConsumableFactory foodFactory;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
	    foodFactory = FactoryProducer.getFactory(Consumables.FOOD);
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
    private void getLargeBurger(ActionEvent event)
    {
        // TODO: Make food choice popup appear
        //myController.setPopUpScreen(PopUpScreens.SELECT_SIDE_OR_DRINK);
        System.out.println("Large BURGER is clicked");
	    addFood(Food.BURGER, Size.LARGE);
    }

    @FXML
    private void getMediumBurger(ActionEvent event)
    {
        System.out.println("Medium BURGER is clicked");
        // TODO: Make food choice popup appear
        //myController.setPopUpScreen(PopUpScreens.SELECT_SIDE_OR_DRINK);
	    addFood(Food.BURGER, Size.MEDIUM);
    }

    @FXML
    private void getSmallBurger(ActionEvent event)
    {
        System.out.println("Small BURGER is clicked");
        // TODO: Make food choice popup appear
        //myController.setPopUpScreen(PopUpScreens.SELECT_SIDE_OR_DRINK);
	    addFood(Food.BURGER, Size.SMALL);
    }

    @FXML
    private void getLargeKebab(ActionEvent event)
    {
        System.out.println("Large kebab is clicked");
        // TODO: Make food choice popup appear
        //myController.setPopUpScreen(PopUpScreens.SELECT_SIDE_OR_DRINK);
	    addFood(Food.KEBAB, Size.LARGE);
    }

    @FXML
    private void getMediumKebab(ActionEvent event)
    {
        System.out.println("Medium kebab is clicked");
        // TODO: Make food choice popup appear
        //myController.setPopUpScreen(PopUpScreens.SELECT_SIDE_OR_DRINK);
	    addFood(Food.KEBAB, Size.MEDIUM);
    }

    @FXML
    private void getSmallKebab(ActionEvent event)
    {
        System.out.println("Small kebab  is clicked");
        // TODO: Make food choice popup appear
        //myController.setPopUpScreen(PopUpScreens.SELECT_SIDE_OR_DRINK);
	    addFood(Food.KEBAB, Size.SMALL);
    }

    @FXML
    private void getLargePizza(ActionEvent event)
    {
        // TODO: Make food choice popup appear
        System.out.println("Large choice selected");
        //myController.setPopUpScreen(PopUpScreens.SELECT_TOPPING);
	    addFood(Food.PIZZA, Size.LARGE);
    }

    @FXML
    private void getMediummPizza(ActionEvent event)
    {
        // TODO: Make food choice popup appear
        System.out.println("Medium choice selected");
       // myController.setPopUpScreen(PopUpScreens.SELECT_TOPPING);
	    addFood(Food.PIZZA, Size.MEDIUM);
    }

    @FXML
    private void getSmallPizza(ActionEvent event)
    {
        // TODO: Make food choice popup appear
        System.out.println("small choice selected");
        //myController.setPopUpScreen(PopUpScreens.SELECT_TOPPING);
	    addFood(Food.PIZZA, Size.SMALL);
    }
    @FXML
    private void getPizzaTopping(ActionEvent event)
    {
        // TODO: Make food choice popup appear
        System.out.println("Topping choice selected");
        //myController.setPopUpScreen(PopUpScreens.SELECT_TOPPING);
        myController.setPopUpScreen(PopUpScreens.SELECT_TOPPING);
    }
	
	private void addFood(Food foodType, Size size)
	{
		Consumable food = foodFactory.getFood();
		food = foodFactory.addFood(foodType, food);
		myController.getCustomerOrder().addFood((FoodDecorator) food, size);
	    /*
	        NOTE: Can add optional code to close the window as confirmation
	     */
	}
}
