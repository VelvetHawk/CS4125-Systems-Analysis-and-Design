package controllers;

import display.views.PopUpScreens;
import display.views.Screens;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MakeOrderController implements Initializable, ControlledScreen
{
	@FXML private AnchorPane rootPane;
	@FXML private Label paneTitle;
	@FXML private Button backButton;
	@FXML private Button addItemButton;
	@FXML private Label totalAmountLabel;
	
	private ScreensController myController;
	
	@Override
	public void initialize(URL url, ResourceBundle rb)
	{
	
	}
	
	@Override
	public void setScreenParent(ScreensController screenParent)
	{
		myController = screenParent;
	}
	
	@FXML
	private void goBackToToMainMenu(ActionEvent event)
	{
		// only if the user is successfully logged in then, it'll take the user to the main menu
		myController.setScreen(Screens.MAIN_MENU);
	}
	
	@FXML
	public void addItemButtonClicked(ActionEvent event)
	{
		//System.out.println("Boop");
		myController.setPopUpScreen(PopUpScreens.ORDER_TYPE_CHOICE);
	}

	@FXML
	public void getOrderCompleted(ActionEvent event)
	{
		//System.out.println("Boop");
		System.out.println("Order completed pressed");
		//myController.setPopUpScreen(PopUpScreens.ORDER_TYPE_CHOICE);
	}
}
