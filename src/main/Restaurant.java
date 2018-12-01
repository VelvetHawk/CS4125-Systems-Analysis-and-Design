package main;

import consumables.decorators.Consumable;
import consumables.decorators.ConsumableFactory;
import controllers.ScreensController;
import consumables.decorators.Consumables;
import consumables.decorators.FactoryProducer;
import consumables.drinks.Drinks;
import consumables.factories.DrinksFactory;
import consumables.states.CreatedState;
import consumables.states.DeliveredState;
import consumables.states.Orders;
import controllers.ScreensController;
import display.views.Screens;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author maqayoom
 */
public class Restaurant extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        /*
	    testing state pattern
	     */
        Orders o  = new Orders();
        CreatedState c = new CreatedState();
        c.doAction(o);
        System.out.println(o.getState().toString());

        DeliveredState d = new DeliveredState();
        d.doAction(o);
        System.out.println(o.getState().toString());

        /*
        testing abstract factory
         */
        ConsumableFactory drinksFactory = FactoryProducer.getFactory(Consumables.DRINK);
        Consumable drinkOrder = drinksFactory.getDrink();
        drinkOrder = drinksFactory.addDrink(Drinks.COCACOLA, drinkOrder);
        drinkOrder = drinksFactory.addDrink(Drinks.WATER, drinkOrder);

        System.out.println("Drink cost: " + drinkOrder.getCost());
        System.out.println("Drink: " + drinkOrder.getName());



        ScreensController mainContainer = new ScreensController();

        mainContainer.loadScreen(Screens.MAIN, "/display/views/mainScreen.fxml");
        mainContainer.loadScreen(Screens.LOGIN, "/display/views/login.fxml");
        mainContainer.loadScreen(Screens.REGISTRATION, "/display/views/registration.fxml");
        mainContainer.loadScreen(Screens.MAIN_MENU, "/display/views/mainMenu.fxml");
        mainContainer.loadScreen(Screens.MAKE_ORDER, "/display/views/staticChoice.fxml");

        mainContainer.setScreen(Screens.MAIN); // set the main screen at the start
        // grouping the scene to root.
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}