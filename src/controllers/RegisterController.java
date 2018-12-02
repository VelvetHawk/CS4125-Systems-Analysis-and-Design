package controllers;

import display.views.RegisterView;
import data.models.RegisterModel;
import display.views.LoginView;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RegisterController
{
    RegisterModel model;
    RegisterView view;
    boolean registered = true;
    boolean alreadyRegistered = true;

    public RegisterController(RegisterView view) throws Exception
    {
        model = new RegisterModel();
        this.view = view;
    }

    public void checkRegistration(String name, String surname, String user, char[] pass, String email, String address, String phone) throws Exception
    {
        try {
            alreadyRegistered = model.checkRegistered(user, pass);
            if (!alreadyRegistered) {
                //User is not already registered, so register them
                model.registerUser(name, surname, user, pass, email, address, phone);
                registered = model.getRegistered();
                if (registered) {
                    view.setMessage("Successfuly registered");
                    LoginView login = new LoginView();

                } else {
                    view.setMessage("Error registering");
                }
            } else {
                view.setMessage("User already exists");
            }
        }
        catch(Exception exc){
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, exc);
        }
    }
}

