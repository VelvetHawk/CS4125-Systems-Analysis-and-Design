package data;

import java.sql.Connection;
import java.sql.*;


public class SQLConnector implements DatabaseConnector
{
	Connection conn = null;
	
	@Override
	public Connection getConnection() throws Exception
	{
		try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/accounts?"+ "user=sqluser&password=sqluserpw");

        return conn;
       }
       catch(ClassNotFoundException exc){
            System.out.println(exc);
            exc.printStackTrace();
            throw exc;
           
           //System.out.println("Could not find data");
       }
       
      catch(SQLException exc){
          exc.printStackTrace();
          throw exc;
      }
       finally{
               
       }
		
	}
	
	@Override
	public boolean insert(String table, String[] columns, String[] values)
	{
		// TODO: Finish implementation
		return false;
	}
	
	@Override
	public boolean select(String table, String[] columns, String whereClause, String orderByClause)
	{
		// TODO: Finish implementation
		return false;
	}
	
	@Override
	public boolean update(String table, String[] columns, String[] values, String whereClause)
	{
		// TODO: Finish implementation
		return false;
	}
	
	@Override
	public boolean delete(String table, String whereClause)
	{
		// TODO: Finish implementation
		return false;
	}
}

