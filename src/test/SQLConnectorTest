

/*
import org.junit.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.sql.Connection;
import java.sql.*;
*/

import data.SQLConnector;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;

//import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SQLConnectorTest {
    SQLConnector sqlconnect = new SQLConnector();
    String [] columns = {"username", "password"};

    @Test
    public void test(){

    }


    @Test
    public void testUpdate(){
        try {
            sqlconnect.getConnection();
        }
        catch(Exception e){

        }
        String [] columns = {"username", "password"};
        String [] values = {"Mikeyo", "pass123"};
        boolean updated = sqlconnect.update("takeawayaccounts", columns, values, "WHERE ID = 4" );
        System.out.println(updated);
        assertEquals(updated,true);
        assertTrue(updated);
    }

    @Test
    public void testSelect(){

        String [] columns = {"username", "password"};
        try {
            sqlconnect.getConnection();
        }
        catch(Exception e){

        }
        ResultSet rs = sqlconnect.select("takeawayaccounts", columns, null, null);
    }

    @Test
    public void testInsertDelete(){
        String [] columns = {"username", "password"};
        String [] values = {"testuser", "testpass"};
        try {
            sqlconnect.getConnection();
        }
        catch(Exception e){

        }
        boolean insertSuccess = sqlconnect.insert("takeawayaccounts", columns, values);
        assertTrue(insertSuccess);
        boolean deleteSuccess = sqlconnect.delete("takeawayaccounts", "WHERE username = 'testuser'");
        assertTrue(deleteSuccess);

    }




}

