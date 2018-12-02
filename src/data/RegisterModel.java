package data;

import java.sql.Connection;



public class RegisterModel
{
    Connection conn = null;
    boolean alreadyRegistered = false;
    boolean registered = false;
    SQLConnector SQLconn = new SQLConnector();

    public RegisterModel() throws Exception
    {
        SQLconn.getConnection(DatabaseEnum.MYSQL);
    }

    public boolean checkRegistered(String user, char[] pass)
    {
        //TODO: check if registered
        return alreadyRegistered;
    }

    public boolean getRegistered()
    {
        return registered;
    }

    public void registerUser(String name,
                             String surname,
                             String user,
                             char[] pass,
                             String email,
                             String address,
                             String phone) throws Exception
    {
        String password = new String(pass);
        String [] columns = new String[12];
        String [] values = new String[12];
        values[0] = "default";
        values[1] = name;
        values[2] = surname;
        values[3] = user;
        values[4] = password;
        values[5] = email;
        values[6] = address;
        values[7] = phone;
        values[8] = "default";
        values[9] = "default";
        values[10] = "default";
        values[11] = "default";
        boolean registerSuccess = SQLconn.insert("users", columns, values);
        if (registerSuccess) {
            System.out.println("Registered successfully");
            registered = true;
        } else {
            registered = false;
        }
        SQLconn.closeConnection();
    }
}



