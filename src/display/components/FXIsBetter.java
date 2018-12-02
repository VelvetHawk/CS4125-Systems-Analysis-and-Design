package display.components;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXIsBetter extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage)
	{
		// Scenes
		//Cart List
//		CartList cartList = new CartList("Order", '\u20AC', 400, 250);
//		Scene testScene = new Scene(cartList, 400, 500);
////		Label label = new Label("Hello World");
////		label.setAlignment(Pos.CENTER);
//		String[] temp = {"Sample Name", "MEDIUM"};
//		for (int i = 0; i < 5; i++)
//			cartList.addRow(temp, 5.00);
		
		// Static Choice Panel
		String[] options = {"Food", "Sides", "Drinks"};
		String[] imagePaths = {
			"file:src\\resources\\food-200x200.png",
			"file:src\\resources\\sides-200x200.png",
			"file:src\\resources\\drinks-200x200.png"
		};
		StaticChoicePane choicePane = new StaticChoicePane("Select", options, imagePaths);
		Scene testScene = new Scene(choicePane, 650, 500);
		
		// Efficient
//		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/example/OrderTypeChoiceOrderTypeChoice.fxml"));
//		Parent root;
//		try
//		{
//			root = (AnchorPane) fxmlLoader.load();
//		}
//		catch (IOException ex)
//		{
//			System.out.println("Meep an error");
//			root = new GridPane();
//		}
//		Scene testScene = new Scene(root, 650, 500);
		
		primaryStage.setScene(testScene);
		primaryStage.setTitle("Cart List");
		primaryStage.show();
	}
}
