package display.views;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MenusView
{
    private LoginView loginView;
    
    public void startMenu()
    {
        Stage menuStage = new Stage();
        menuStage.setTitle("Menu");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 500, 500, Color.WHITE);

        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(menuStage.widthProperty());
        root.setTop(menuBar);

        // Account menu - profile, logout, exit Application which will close the application
        Menu accountMenu = new Menu("Account");
        accountMenu.getItems().addAll(
                new MenuItem("Profile"),
                new MenuItem("logout"),
                new SeparatorMenuItem(),
                new MenuItem("Exit Application")
        );

        accountMenu.getItems().get(0).setOnAction(event ->{

            System.out.println("you have just pressed profile button");
        });

        accountMenu.getItems().get(1).setOnAction(event -> {
            System.out.println("You have pressed the logout option");
            menuStage.close();
            Stage stage = new Stage();
            loginView = new LoginView();
            loginView.start(stage);
        });

        accountMenu.getItems().get(3).setOnAction(event -> Platform.exit());

        // orders menu, order status, change order, place order
        Menu ordersMenu = new Menu("Orders");
        ordersMenu.getItems().addAll(
                new MenuItem("order status"),
                new MenuItem("change order"),
                new MenuItem("place order"),
                new SeparatorMenuItem(),
                new MenuItem("check order")
        );

        ordersMenu.getItems().get(0).setOnAction(event -> {
            System.out.println("Order status is clicked");
        });

        ordersMenu.getItems().get(1).setOnAction(event -> {
            System.out.println("change order");
        });

        ordersMenu.getItems().get(2).setOnAction(event -> {
            System.out.println("place");
        });

        // view Reviews menu
        Menu viewReviewsMenu = new Menu("View Reviews");

        // check stocks
        Menu checkStockMenu = new Menu("Check Stock");

        menuBar.getMenus().addAll(accountMenu, ordersMenu, viewReviewsMenu, checkStockMenu);
        menuStage.setScene(scene);
        menuStage.show();
    }
}