package main;

import controllers.ScreensController;
import display.components.CartListPanel;
import display.views.LoginView;
import display.views.RegisterView;

import javax.swing.*;
import consumables.decorators.Consumable;
import consumables.decorators.ConsumableFactory;
import display.views.Screens;
import javafx.application.Application;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

//public class Restaurant extends Application
//{
//    private LoginView loginView;
//	public static void main(String[] args)
//	{
//	    launch(args);
		//RegisterLogin rl = new RegisterLogin();
		//ConsumableFactory c = new ConsumableFactory();
        //Consumable f = c.getConsumable("pizza");
		//RegisterLogin rl = new RegisterLogin();


//		// REMOVE LATER, FOR TESTING
//		JFrame frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		// Setup cart list
//		CartListPanel panel = new CartListPanel("Sample Title", '\u20AC', 2);
//		panel.setAddItemActionListener(event ->
//		{
//			panel.addItem(5.00, "Item name", "MEDIUM");
//			panel.updateSelf();
//
//		});
//		for (int i = 0; i < 10; i++)
//			panel.addItem(5.00, "Item name", "MEDIUM");
//		panel.updateSelf();
//		frame.add(panel);
//
//		// Setup choice panel
////		StaticChoicePanel<String> panel2 = new StaticChoicePanel<>("Select:");
////		frame.add(panel2);
//
//		frame.setSize(400, 500);
//		frame.setLocationRelativeTo(null); // Center
//		frame.setVisible(true);
//	}
//
//




//}
//




import controllers.ScreensController;
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