package data;

import java.sql.*;
import java.sql.Connection;

import data.SQLConnector;


public class RegisterModel
{
    Connection conn = null;
    boolean alreadyRegistered = false;
    boolean registered = false;
    SQLConnector SQLconn = new SQLConnector();
    //SQLConnector sqlConn = new SQLConnector;

    public RegisterModel() throws Exception
    {
        conn = SQLconn.getConnection();
    }

    public boolean checkRegistered(String user, char[] pass)
    {
         return alreadyRegistered;
    }

    public boolean getRegistered()
    {
        return registered;
    }

    public void registerUser(String user, char[] pass) throws Exception
    {
         String password = new String(pass);
         String [] columns = new String[2];
         String [] values = new String[2];
         values[0] = user;
         values[1] = password;
         //String sql = "INSERT INTO accounts.takeawayaccounts values(default,?,?) ";
         boolean registerSuccess = SQLconn.insert("accounts.takeawayaccounts", columns, values);
         //PreparedStatement ps = conn.insert(sql, user, pass);
         //PreparedStatement ps = conn.prepareStatement(sql);
        /*
         ps.setString(1, user);
         ps.setString(2, password);
         int registerSuccess = ps.executeUpdate();
         */
         if(registerSuccess) {
             registered = true;
         } else {
             registered = false;
         }
            //ps.close();
            conn.close();
    }
}

