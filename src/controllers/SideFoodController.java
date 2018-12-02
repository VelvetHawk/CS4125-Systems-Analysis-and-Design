package controllers;

import java.net.URL;
import java.util.ResourceBundle;

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
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
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
}
