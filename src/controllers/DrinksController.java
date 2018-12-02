package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import consumables.decorators.Consumable;
import consumables.decorators.ConsumableFactory;
import consumables.decorators.Consumables;
import consumables.decorators.DrinkDecorator;
import consumables.drinks.Drinks;
import consumables.factories.FactoryProducer;
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
public class DrinksController implements Initializable, ControlledScreen
{
    ScreensController myController;
    private ConsumableFactory drinkFactory;
	
	/**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
        drinkFactory = FactoryProducer.getFactory(Consumables.DRINK);
    }    
    
    public void setScreenParent(ScreensController screenParent)
    {
        myController = screenParent;
    }

    @FXML
    private void goToMainMenu(ActionEvent event)
    {
        myController.setScreen(Screens.MAIN_MENU);
    }

    @FXML
    private void getClubOrange(ActionEvent event)
    {
        System.out.println("Club Orange is clicked");
	    addDrink(Drinks.CLUBORANGE);
    }

    @FXML
    private void getCocacola(ActionEvent event)
    {
        System.out.println("COCACOLA is clicked");
	    addDrink(Drinks.COCACOLA);
    }

    @FXML
    private void getDietcocacola(ActionEvent event)
    {
        System.out.println("DIETCOCACOLA is clicked");
	    addDrink(Drinks.DIETCOCACOLA);
    }

    @FXML
    private void getPepsi(ActionEvent event)
    {
        System.out.println("PEPSI is clicked");
	    addDrink(Drinks.PEPSI);
    }

    @FXML
    private void getPepsiMax(ActionEvent event)
    {
        System.out.println("PEPSIMAX is clicked");
	    addDrink(Drinks.PEPSIMAX);
    }

    @FXML
    private void getSevenUp(ActionEvent event)
    {
        System.out.println("SEVENUP is clicked");
	    addDrink(Drinks.SEVENUP);
    }

    @FXML
    private void getSprite(ActionEvent event)
    {
        System.out.println("SPRITE is clicked");
	    addDrink(Drinks.SPRITE);
    }

    @FXML
    private void getWater(ActionEvent event)
    {
        System.out.println("WATER is clicked");
	    addDrink(Drinks.SPRITE);
    }
    
    private void addDrink(Drinks drinkType)
    {
	    Consumable drink = drinkFactory.getDrink();
	    drink = drinkFactory.addDrink(drinkType, drink);
	    myController.getCustomerOrder().addDrink((DrinkDecorator) drink);
    }
}
