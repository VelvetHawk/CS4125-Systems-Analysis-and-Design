package controllers;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import consumables.decorators.Consumable;
import consumables.decorators.ConsumableFactory;
import consumables.decorators.Consumables;
import consumables.decorators.FoodDecorator;
import consumables.factories.FactoryProducer;
import consumables.food.Food;
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
public class ToppingsController implements Initializable, ControlledScreen
{
    ScreensController myController;
	private ConsumableFactory toppingFactory;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
	    toppingFactory = FactoryProducer.getFactory(Consumables.TOPPING);
    }    
    
    public void setScreenParent(ScreensController screenParent)
    {
        myController = screenParent;
    }


    @FXML
    private void goToStatic(ActionEvent event)
    {
//        myController.setScreen(Screens.MAIN_MENU);
        //backButton.setText("Clicked!");
        // TODO: Close dialogue box
        ((Button)event.getTarget()).getScene().getWindow().hide();
    }
    @FXML
    private void goToFood(ActionEvent event)
    {
        //myController.setScreen(PopUpScreens.SELECT_TOPPING);
    }

    @FXML
    private void getBeef(ActionEvent event)
    {
        System.out.println("Beef is clicked");
	    addTopping(Toppings.BEEF);
    }
    @FXML
    private void getCheese(ActionEvent event)
    {
        System.out.println("Cheese is clicked");
	    addTopping(Toppings.CHEESE);
    }
    @FXML
    private void getChicken(ActionEvent event)
    {
        System.out.println("Chicken is clicked");
	    addTopping(Toppings.CHICKEN);
    }
    @FXML
    private void getHam(ActionEvent event)
    {
        System.out.println("Ham is clicked");
	    addTopping(Toppings.HAM);
    }
    @FXML
    private void getMushroom(ActionEvent event)
    {
        System.out.println("Mushroom is clicked");
	    addTopping(Toppings.MUSHROOM);
    }
    @FXML
    private void getPepperoni(ActionEvent event)
    {
        System.out.println("Pepperoni  is clicked");
	    addTopping(Toppings.PEPPERONI);
    }
    @FXML
    private void getPineapple(ActionEvent event)
    {
        System.out.println("Pineapple  is clicked");
	    addTopping(Toppings.PINEAPPLE);
    }
    @FXML
    private void getSausage(ActionEvent event)
    {
        System.out.println("Sausage  is clicked");
	    addTopping(Toppings.SAUSAGE);
    }

    @FXML
    private void getBeans(ActionEvent event)
    {
        System.out.println("Beans is clicked");
    }
    @FXML
    private void getChips(ActionEvent event)
    {
        System.out.println("Chips is clicked");
    }
    @FXML
    private void getColeslaw(ActionEvent event)
    {
        System.out.println("Coleslaw is clicked");
    }
    @FXML
    private void getGarlicbread(ActionEvent event)
    {
        System.out.println("Garlicbread is clicked");
    }
    @FXML
    private void getOnionRings(ActionEvent event)
    {
        System.out.println("onionRings is clicked");
    }
    
    // Adds the selected topping to the last item in the food list
    private void addTopping(Toppings topping)
    {
        ArrayList<FoodDecorator> food = myController.getCustomerOrder().getFood();
        // If the list is not empty (ie, at least one food item has been added)
	    if (food.size() > 0)
	    {
	    	Consumable lastFoodItem = food.get(food.size()-1);
	    	lastFoodItem = toppingFactory.addTopping(topping, lastFoodItem);
	    	food.set(food.size()-1, (FoodDecorator) lastFoodItem);
	    	// UI doesn't update until another object added otherwise
	    	myController.getCustomerOrder().notifyAllObservers();
	    }
    }
}
