package data;

import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SQLConnector implements DatabaseConnector
{
	Connection conn = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
	
	@Override
	public Connection getConnection() throws Exception
	{
		try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/accounts?"+ "user=sqluser&password=sqluserpw");

            return conn;
        } catch(ClassNotFoundException exc) {
            System.out.println(exc);
            exc.printStackTrace();
            throw exc;
           
           //System.out.println("Could not find data");
        } catch(SQLException exc) {
		    exc.printStackTrace();
            throw exc;
        } finally {

        }
	}

    public ResultSet select(String table, String[] columns, String whereClause, String orderByClause)
    {
        String result = "";
        try {
            statement = conn.createStatement();
            //resultSet = statement.executeQuery(SQLCmd);
            //result = writeResultSet(resultSet);
        } catch(Exception e) {
            logError(e);
        }
        return resultSet;
        //return result;
    }

    public boolean update(String table, String[] columns, String[] values, String whereClause)
    {
        try {
           // preparedStatement = conn.prepareStatement(SQLCmd);
           // int rows = preparedStatement.executeUpdate();
            return true;
        } catch(Exception e) {
            logError(e);
            return false;
        }
    }

    public boolean insert(String table, String[] columns, String[] values)
    {
        String strQuery = "INSERT INTO $tablename values(default,?,?) ";
        String sql =strQuery.replace("$tablename",table);
        System.out.println(sql);
	    int registerSuccess = 0;
        try {
            preparedStatement = conn.prepareStatement(sql);
            //preparedStatement.setString(1, table);
            for(int i=0;i<values.length;i++) {
                preparedStatement.setString(i+1, values[i]);
            }
            System.out.println(preparedStatement);
            registerSuccess = preparedStatement.executeUpdate();
            if(registerSuccess>0) {
                return true;
            } else {
                return false;
            }
        } catch(Exception e) {
            logError(e);
            return false;
        }
        //return registerSuccess;
    }

    public boolean delete(String table, String whereClause)
    {
        try {
            //preparedStatement = conn.prepareStatement(SQLCmd);
            //int rows = preparedStatement.executeUpdate();
            return true;
        } catch(Exception e) {
            logError(e);
            return false;
        }
    }

    private void logError(Exception e)
    {
        Logger.getLogger(SQLConnector.class.getName()).log(Level.SEVERE, null, e);
    }
}


