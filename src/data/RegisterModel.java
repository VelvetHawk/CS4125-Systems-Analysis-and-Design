package data;

import java.sql.*;
import java.sql.Connection;

import data.SQLConnector;

public class RegisterModel{

    Connection conn = null;
    boolean alreadyRegistered = false;
    boolean registered = false;

    public RegisterModel() throws Exception {
        SQLConnector SQLconn = new SQLConnector();
        conn = SQLconn.getConnection();
    }

    public boolean checkRegistered(String user, char[] pass){
         return alreadyRegistered;
    }

    public boolean getRegistered(){
        return registered;
    }

    public void registerUser(String user, char[] pass) throws Exception{
         String password = new String(pass);
         String sql = "INSERT INTO accounts.takeawayaccounts values(default,?,?) ";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, user);
         ps.setString(2, password);
         int registerSuccess = ps.executeUpdate();
         if(registerSuccess>0){
             registered = true;
         }
         else{
             registered = false;
         }



            ps.close();
            conn.close();
    }
}
