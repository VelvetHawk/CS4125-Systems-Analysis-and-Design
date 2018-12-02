package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import display.views.PopUpScreens;
import display.views.Screens;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.Restaurant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author maqayoom
 */
public class OrderTypeChoiceController implements Initializable , ControlledScreen {
	
	@FXML private AnchorPane rootPane;
	@FXML private Label paneTitle;
	@FXML private VBox foodChoice;
	@FXML private VBox sideChoice;
	@FXML private VBox drinkChoice;
	@FXML private Button backButton;

	ScreensController myController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
	    // Default
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
	
    @FXML
    private void foodChoiceClicked(MouseEvent event)
    {
        // TODO: Make food choice popup appear
	    System.out.println("Food choice selected");
	    myController.getPopUpScreen(PopUpScreens.SELECT_FOOD, 600, 600);
    }
    
	@FXML
	private void sideChoiceClicked(MouseEvent event)
	{
		// TODO: Make side choice popup appear
		System.out.println("Food choice selected");
		myController.getPopUpScreen(PopUpScreens.SELECT_TOPPING, 600, 600);
	}
	
	@FXML
	private void drinkChoiceClicked(MouseEvent event)
	{
		// TODO: Make drink choice popup appear
		System.out.println("Food choice selected");
		myController.getPopUpScreen(PopUpScreens.SELECT_DRINK, 600, 600);
	}
    

    @FXML
    private void backButtonClicked(ActionEvent event)
    {
        //backButton.setText("Clicked!");
        // TODO: Close dialogue box
	    ((Stage)rootPane.getParent().getScene().getWindow()).close();
	    myController.getChildren().remove(0);
	    myController.setScreen(Screens.MAKE_ORDER);
    }
}
