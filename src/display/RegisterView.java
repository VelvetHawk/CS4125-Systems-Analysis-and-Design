package display;

import controllers.RegisterController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RegisterView extends JFrame {

    private JLabel nameLabel;
    private JLabel passwordLabel;
    private JTextField nameText;
    private JPasswordField passwordField;
    private JButton submitButton;
    private JLabel errorLabel;
    private JLabel msg;

    public RegisterView() throws Exception {

        super("Register");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(178, 190);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        nameLabel = new JLabel("User ID: ");
        add(nameLabel);

        nameText = new JTextField(10);
        add(nameText);

        passwordLabel = new JLabel("Password: ");
        add(passwordLabel);

        passwordField = new JPasswordField(10);
        add(passwordField);

        submitButton = new JButton("Submit");
        add(submitButton);


        RegisterController controller = new RegisterController(this);

        //controller.ButtonHandler handler = new controller.ButtonHandler();


        submitButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               try {
                   String user = nameText.getText();
                   char[] passChars = passwordField.getPassword();
                   controller.checkRegistration(user, passChars);
               }
               catch(Exception exc){

               }


           }
       });
    }

    public void setMessage(String message){
        System.out.println(message);
        msg = new JLabel(message);
        add(msg);
    }
}
