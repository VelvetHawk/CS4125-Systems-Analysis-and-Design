package data;

import java.sql.Connection;

public interface DatabaseConnector
{
	public Connection getConnection() throws Exception;
	public boolean insert(String table, String[] columns, String[] values);
	public String[][] select(String table, String[] columns, String whereClause, String orderByClause);
	public boolean update(String table, String[] columns, String[] values, String whereClause);
	public boolean delete(String table, String whereClause);
}
