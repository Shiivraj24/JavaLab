package Tester;
import java.sql.*;
import static utils.DBUtils.openConnection;

public class TestSql {
       public static void main(String[] args) {
		try(Connection cn = openConnection())
		{
			System.out.println("connected to db"+cn);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	
}
