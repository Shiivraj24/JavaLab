package utils;
import java.sql.*;

public class DBUtils {
	private static Connection cn ;
	//add a static method to open db conn
	public static Connection openConnection() throws SQLException
	{
		//DriveManager : Connection
		String url="jdbc:mysql://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		cn = DriverManager.getConnection(url,"root","admin123");
		return cn;
	}
}
