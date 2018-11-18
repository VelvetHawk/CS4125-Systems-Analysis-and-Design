package display.views;

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
    private JLabel surnameLabel;
    private JTextField surnameText;
    private JLabel usernameLabel;
    private JTextField usernameText;
    private JLabel emailLabel;
    private JTextField emailText;
    private JLabel addressLabel;
    private JTextField addressText;
    private JLabel phoneLabel;
    private JTextField phoneText;
    private JButton submitButton;
    private JLabel errorLabel;
    private JLabel msg;

    public RegisterView() throws Exception {

        super("Register");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(178, 190);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        nameLabel = new JLabel("Name: ");
        add(nameLabel);

        nameText = new JTextField(10);
        add(nameText);

        surnameLabel = new JLabel("Surname: ");
        add(surnameLabel);

        surnameText = new JTextField(10);
        add(surnameText);

        usernameLabel = new JLabel("Username: ");
        add(usernameLabel);

        usernameText = new JTextField(10);
        add(usernameText);

        passwordLabel = new JLabel("Password: ");
        add(passwordLabel);

        passwordField = new JPasswordField(10);
        add(passwordField);

        emailLabel = new JLabel("Email: ");
        add(emailLabel);

        emailText = new JTextField(10);
        add(emailText);

        addressLabel = new JLabel("Address: ");
        add(addressLabel);

        addressText = new JTextField(20);
        add(addressText);

        phoneLabel = new JLabel("Phone: ");
        add(phoneLabel);

        phoneText = new JTextField(20);
        add(phoneText);

        submitButton = new JButton("Submit");
        add(submitButton);

        RegisterController controller = new RegisterController(this);

        //controller.ButtonHandler handler = new controller.ButtonHandler();


        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = nameText.getText();
                    String surname = surnameText.getText();
                    String user = usernameText.getText();
                    char[] passChars = passwordField.getPassword();
                    String email = emailText.getText();
                    String address = addressText.getText();
                    String phone = phoneText.getText();
                    controller.checkRegistration(name, surname, user, passChars, email, address, phone);
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

