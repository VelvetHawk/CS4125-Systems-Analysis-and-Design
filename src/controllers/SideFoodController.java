package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import consumables.decorators.*;
import consumables.drinks.Drinks;
import consumables.factories.FactoryProducer;
import consumables.side.Sides;
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
public class SideFoodController implements Initializable, ControlledScreen
{
    ScreensController myController;
    private ConsumableFactory sideFactory;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
	    sideFactory = FactoryProducer.getFactory(Consumables.SIDE);
    }    
    
    public void setScreenParent(ScreensController screenParent)
    {
        myController = screenParent;
    }


    @FXML
    private void goToStatic(ActionEvent event){
        // TODO: Close dialogue box
        ((Button)event.getTarget()).getScene().getWindow().hide();
    }

    @FXML
    private void getBeans(ActionEvent event)
    {
        System.out.println("Beans is clicked");
	    addSide(Sides.BEANS);
    }
    @FXML
    private void getChips(ActionEvent event)
    {
        System.out.println("Chips is clicked");
	    addSide(Sides.CHIPS);
    }
    @FXML
    private void getColeslaw(ActionEvent event)
    {
        System.out.println("Coleslaw is clicked");
	    addSide(Sides.COLESLAW);
    }
    @FXML
    private void getGarlicbread(ActionEvent event)
    {
        System.out.println("Garlicbread is clicked");
	    addSide(Sides.GARLICBREAD);
    }
    @FXML
    private void getOnionRings(ActionEvent event)
    {
        System.out.println("onionRings is clicked");
        addSide(Sides.ONIONRINGS);
    }
	
	private void addSide(Sides sideType)
	{
		Consumable drink = sideFactory.getSide();
		drink = sideFactory.addSide(sideType, drink);
		myController.getCustomerOrder().addSide((SideDecorator) drink);
	    /*
	        NOTE: Can add optional code to close the window as confirmation
	     */
	}
}
