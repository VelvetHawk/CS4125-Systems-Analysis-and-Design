package display.views;

import controllers.RegisterController;

import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;



public class RegisterView
{
    private RegisterController controller;

    private LoginView login;
    private Button back, registrationbtn, clear_form_btn;
    private HBox hbBtn, hbtn1;
    private TextField nameTextField, surnameTextField,usernameTextField, password_TextField, emailTextField,	addressTextField, phoneTextField,	pointsTextField
            ,	account_type_IDTextField,	date_createdTextField, last_loginTextField;
    private Label name, surname, username, password_label, email,	address, phone,	points,	account_type_ID,	date_created, last_login;
    private PasswordField password_field;
    private GridPane grid;
    private Scene scene;
    private Text scenetitle;

    public RegisterView() {
    }


    public void createUser()
    {

        // set the title to Registration
        Stage reg_stage = new Stage();
        reg_stage.setTitle("Create User ");
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        // on the form itself set the titel to login
        scenetitle = new Text("Create user");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        // all the Labels are added to this area
        name = new Label("Name:");

        grid.add(name, 0, 1);
        surname = new Label("surname:");
        grid.add(surname, 0,2);
        email = new Label("Email:");
        grid.add(email,0, 3);
        username = new Label("Username");
        grid.add(username,0,4 );
        password_label = new Label("Password:");
        grid.add(password_label, 0, 5);
        address = new Label("Address:");
        grid.add(address, 0, 6);
        phone = new Label("Phone:");
        grid.add(phone, 0, 7);
        //points = new Label("Points:");
        //grid.add(points, 0 , 8);
        //account_type_ID = new Label("Account Type:");
        //grid.add(account_type_ID, 0 , 9);
        /*
        date_created = new Label("Date Created:");
        grid.add(date_created, 0, 10 );
        last_login = new Label("Last Login");
        grid.add(last_login, 0 , 11);
        */


        // all the textfields are added here for the above coded labels
        nameTextField = new TextField();
        nameTextField.setPromptText("Name");
        grid.add(nameTextField, 1, 1);
        surnameTextField = new TextField();
        surnameTextField.setPromptText("Surname");
        grid.add(surnameTextField, 1, 2 );
        emailTextField = new TextField();
        emailTextField.setPromptText("Email");
        grid.add(emailTextField, 1, 3);
        usernameTextField = new TextField();
        usernameTextField.setPromptText("Username");
        grid.add(usernameTextField, 1 , 4);
        password_TextField = new PasswordField();
        password_TextField.setPromptText("Password");
        grid.add(password_TextField, 1, 5 );
        addressTextField = new TextField();
        addressTextField.setPromptText("Address");
        grid.add(addressTextField, 1, 6 );
        phoneTextField = new TextField();
        phoneTextField.setPromptText("Phone/mobile number");
        grid.add(phoneTextField, 1, 7);
        // comment this out when you have decided to the add this field in the register form
        //pointsTextField = new TextField();
        //pointsTextField.setPromptText("Points");
        //grid.add(pointsTextField, 1, 8);
        //comment this out when you have decided to the add this field in the register form
        /*ObservableList<String> options = FXCollections.observableArrayList(
                "Manager",
                "Employee",
                "Customer"
        );
        */

        //ComboBox comboBox = new ComboBox(options);
        //grid.add(comboBox, 1 , 9);
        /*
        /*account_type_IDTextField = new TextField();
        account_type_IDTextField.setPromptText("Account Type");
        grid.add(account_type_IDTextField,1, 8);
        */
        /*
        DatePicker dateCreate = new DatePicker();
        grid.add(dateCreate, 1, 10);
        DatePicker last_login = new DatePicker();
        grid.add(last_login, 1, 11);
        */

        // register button
        registrationbtn = new Button("Create");
        hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_CENTER);
        hbBtn.getChildren().add(registrationbtn);
        grid.add(registrationbtn, 0, 12);
        // back button
        back = new Button("Back");
        hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BASELINE_CENTER);
        hbBtn.getChildren().add(back);
        grid.add(back, 1, 12);

        // a Clear form button if user wish to clear the form and rewrite the information on the format
        clear_form_btn = new Button("Clear");
        hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BASELINE_CENTER);
        hbBtn.getChildren().add(clear_form_btn);
        grid.add(clear_form_btn, 2, 12);

        // a text field, when a user press a button , the text will show up on the GUI
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 13);
        System.out.println("Your are in the st");
        // back button action
        back.setOnAction(actionEvent -> {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Back button pressed");

            login = new LoginView();
            Stage stage = new Stage();
            login.start(stage);
            reg_stage.close();

        });

        // create/register button action
        registrationbtn.setOnAction(actionEvent -> {
            actiontarget.setFill(Color.FIREBRICK);
            // when the regesteretion is completed
            String name, surname, email, address, phone, points, password;

            name = nameTextField.getText();
            surname = surnameTextField.getText();
            email = emailTextField.getText();
            address = addressTextField.getText();
            phone = phoneTextField.getText();
            //points = pointsTextField.getText();
            password = password_TextField.getText();




            String username = usernameTextField.getText();
            char[] passwordChar = password.toCharArray();




            if(name.isEmpty() || surname.isEmpty() || email.isEmpty() || address.isEmpty() ||
                    phone.isEmpty() || password.isEmpty() || username.isEmpty() || passwordChar.length ==0){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("Creating New user");
                alert.setContentText("Please complete the form before press the button");

                alert.showAndWait();

            }else{
                controller = null;
                try {
                    controller = new RegisterController(this);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    // account type is setup as default to Customers.
                    controller.checkRegistration(name, surname, username, passwordChar, email, address, phone);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            //clearForm();
            actiontarget.setText("Register button pressed");
            System.out.println("Create button is pressed");
        });
        // create/register button action
        clear_form_btn.setOnAction(actionEvent -> {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Clear button pressed");
            //System.out.println("C button is pressed");
            clearForm();
        });



        scene = new Scene(grid, 500, 500);
        reg_stage.setScene(scene);
        reg_stage.show();
    }

    // a method that clears the form inputs
    public void clearForm(){
        nameTextField.setText("");
        surnameTextField.setText("");
        emailTextField.setText("");
        addressTextField.setText("");
        phoneTextField.setText("");
        pointsTextField.setText("");
        //account_type_IDTextField.setText("");
        password_TextField.setText("");

        System.out.println("you are pressing the clear button");

    }

    public void setMessage(String message){
        System.out.println(message);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText(message);

        alert.showAndWait();

        //msg = new JLabel(message);
        //add(msg);
    }



}