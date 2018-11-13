package main;

import display.components.CartListPanel;
import display.views.LoginView;
import display.views.RegisterLogin;
import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;



public class Restaurant extends Application
{
	private LoginView loginView;
	public static void main(String[] args)
	{
		launch(args);
	}
	@Override
	public void start(Stage primaryStage){
		loginView = new LoginView();
		Stage stage = new Stage();
		loginView.start(stage);
	}
}
