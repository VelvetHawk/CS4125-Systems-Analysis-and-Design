package controllers;

import display.views.RegisterView;
import data.RegisterModel;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RegisterController {
    RegisterModel model;
    RegisterView view;
    boolean registered;
    boolean alreadyRegistered = true;

    public RegisterController(RegisterView view) throws Exception{
          model = new RegisterModel();
          this.view = view;
    }

    public void checkRegistration(String user, char[] pass) throws Exception{
            try {
                alreadyRegistered = model.checkRegistered(user, pass);
                if (!alreadyRegistered) {
                    //User is not already registered, so register them
                    model.registerUser(user, pass);
                    registered = model.getRegistered();
                    if (registered) {
                        view.setMessage("Successfuly registered");
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
