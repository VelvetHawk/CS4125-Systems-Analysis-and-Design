package display.views;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class LoginPage extends JFrame
{
    private JLabel nameLabel;
    private JLabel passwordLabel;
    private JTextField nameText;
    private JPasswordField passwordField;
    private JButton submitButton;
    private JLabel errorLabel;
    private Connection connect = null;
    Connection conn = null;

    public LoginPage()
    {
        super("Log in!");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(178,190);
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

        ButtonHandler handler = new ButtonHandler();
        submitButton.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                loginValidation();
            } catch (Exception ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        public void loginValidation() throws Exception
        {
            String user = nameText.getText();
            char [] passChars = passwordField.getPassword();
            if(passChars!=null) {
                String pass=new String(passChars);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost/accounts?" +
                            "user=sqluser&password=sqluserpw");
                    String sql = "SELECT username, password FROM TakeawayAccounts where username=? and password=?";
                    PreparedStatement ps=conn.prepareStatement(sql);
                    ps.setString(1,user);
                    ps.setString(2,pass);
                    ResultSet rs=ps.executeQuery();
                    if(rs.next()) {
                        //found
                        errorLabel = new JLabel("Logging in");
                        add(errorLabel);
                    } else {
                        //not found
                        errorLabel = new JLabel("Invalid username or password");
                        add(errorLabel);
                    }
                    rs.close();
                    ps.close();
                    conn.close();
                } catch (ClassNotFoundException exc) {
                    throw exc;
                    //System.out.println("Could not find data");
                } catch(SQLException exc) {
                    throw exc;
                } finally {
                    //close();
                }
            }
        }
    }
}
