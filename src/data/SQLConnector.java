package data;

import java.sql.Connection;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;


public class SQLConnector implements DatabaseConnector
{
    Connection conn = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet rs = null;

    @Override
    public void getConnection() throws Exception
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/Restaurant_DB?"+ "user=sqluser&password=sqlpw");
            //return conn;
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
        String strQuery = "Select";
        for(int i = 0; i < columns.length; i++) {
            strQuery += " " + columns[i];
            if(i+1<columns.length) {
                strQuery += ", ";
            }
        }
        strQuery += " FROM $tablename";
        if(whereClause != null) {
            strQuery += whereClause;
        }
        if(orderByClause != null) {
            strQuery+=orderByClause;
        }
        String sql =strQuery.replace("$tablename",table);
        System.out.println(sql);
        try {
            preparedStatement =conn.prepareStatement(sql);

            System.out.println(preparedStatement);
            rs = preparedStatement.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            int numberColumns = rsmd.getColumnCount();
            String [] row = new String[numberColumns];
            //result = writeResultSet(resultSet);
            ArrayList allRows = new ArrayList();
            /*
            while(rs.next()){
                //System.out.println(rs);
                String[] currentRow = new String[numberColumns];
                for(int i = 1;i<=numberColumns;i++){
                    row[i-1]=rs.getString(columns[i-1]);
                    System.out.println(rs.getString(columns[i-1]) );
                }
                allRows.add(row);
                String [][] arrayRows = new String[allRows.size()][numberColumns];
                for(int i=0;i<allRows.size();i++){
                    String [] r = (String[])allRows.get(i);
                    for(int j=0;j<r.length;j++){

                    }
                }

                for(int i=0;i<allRows.size();i++){
                     String [] r = (String [])allRows.get(i);
                     arrayRows[i] = r;
                     //arrayRows[i] = allRows.get(i);
                }
                //arrayRows = allRows.toString(arrayRows);
                for(int i=0;i<arrayRows.length;i++){
                    for(int j=0;i<arrayRows[i].length;j++){
                        System.out.print(arrayRows[i][j] );
                    }
                    System.out.println();
                }

                //System.out.println(allRows);
                //String [][] rowsFound = Arrays.toString(allRows.get(i));
            }
            */
            //System.out.println(allRows);
        } catch(Exception e) {
            logError(e);
        }
        return rs;
        //return result;
    }

    public boolean update(String table, String[] columns, String[] values, String whereClause)
    {
        String strQuery = "Update $tablename SET";
        for(int i = 0; i < columns.length; i++) {
            String set = " " + columns[i] + "=" + "'" + values[i] + "'";
            strQuery += set;
            if(i + 1 < columns.length) {
                strQuery+=", ";
            }
        }
        if(strQuery!=null) {
            strQuery += " " + whereClause;
        }
        String sql =strQuery.replace("$tablename",table);
        System.out.println(sql);
        int registerSuccess = 0;
        try {
            preparedStatement = conn.prepareStatement(sql);
            System.out.println(preparedStatement);
            registerSuccess = preparedStatement.executeUpdate();
            if(registerSuccess > 0) {
                return true;
            } else {
                return false;
            }
        } catch(Exception e) {
            logError(e);
            return false;
        }
    }

    public boolean insert(String table, String[] columns, String[] values)
    {
        String strQuery = "INSERT INTO $tablename values( ";
        for(int i = 0; i < values.length; i++) {
            //if value to be inserted isn't default add '' to make it valid
            if(values[i] != "default") {
                strQuery += "'" + values[i] + "'";
            } else {
                strQuery += values[i];
            }
            if(i + 1 < values.length) {
                strQuery+=", ";
            }
        }

        strQuery+= ")";
        String sql =strQuery.replace("$tablename",table);
        System.out.println(sql);
        int registerSuccess = 0;
        try {
            preparedStatement = conn.prepareStatement(sql);
            //preparedStatement.setString(1, table);
            System.out.println(preparedStatement);
            registerSuccess = preparedStatement.executeUpdate();
            if(registerSuccess > 0) {
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
        String strQuery = "DELETE FROM $tablename";
        String sql =strQuery.replace("$tablename",table);
        sql += " " + whereClause
        ;        System.out.println(sql);
        int deleteSuccess = 0;
        try {
            preparedStatement = conn.prepareStatement(sql);
            System.out.println(preparedStatement);
            deleteSuccess = preparedStatement.executeUpdate();
            if(deleteSuccess > 0) {
                return true;
            } else {
                return false;
            }
        } catch(Exception e) {
            logError(e);
            return false;
        }
    }

    private void logError(Exception e)
    {
        Logger.getLogger(SQLConnector.class.getName()).log(Level.SEVERE, null, e);
    }

    public void closeConnection() throws Exception
    {
        conn.close();
    }
}





