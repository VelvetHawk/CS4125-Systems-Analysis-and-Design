package data.models;

import data.SQLConnector;
import data.DatabaseEnum;

public class RegisterModel
{
    private boolean registered = false;
    private SQLConnector SQLConn = new SQLConnector();

    public RegisterModel() throws Exception
    {
        SQLConn.getConnection(DatabaseEnum.MYSQL);
    }

   public boolean checkRegistered(String user, char[] password) throws Exception
    {
        if (password != null)
        {
            String pass = new String(password);
            //add '' to values to allow them to be added to sql queries
            user = "'" + user  + "'";
            pass = "'" + pass + "'";
            SQLConnector SQLconn = new SQLConnector();
            SQLconn.getConnection(DatabaseEnum.MYSQL);
            String [] columns = {"username"};
            ResultSet rs = SQLconn.select("users", columns, " WHERE username =" + user, null );
            //Found a user already registered with the username
            if(rs.next())
            {
                registered = true;
            }
            rs.close();
            SQLconn.closeConnection();
        }
        return registered;
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
        registered = SQLConn.insert("users", columns, values);
        SQLConn.closeConnection();
    }
}



