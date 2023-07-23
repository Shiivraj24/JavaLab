package Tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import static utils.DBUtils.openConnection;
public class TestPSTSelect {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);
			Connection cn =openConnection ();
		 PreparedStatement pst = cn.prepareStatement("Select * from users where role = ? and reg_amt >? "))
				{
    
			System.out.println("Enter role and reg ammt");
			pst.setString(1, sc.next());
			pst.setDouble(2, sc.nextDouble());
			//execute method: execQuery/execUpdate/execute
			//public RST executeQuery() throws SE
			
		try(ResultSet rst = pst.executeQuery()){
			//rst API :public boolean next() throwa SE
			while (rst.next()) {
				
				//readrow data:RST API public Type(int colpos,String colName)
				rst.getType();
				System.out.println("id: " +rst.getInt(1)+ " , " + "full name: " + rst.getString(2)+" , "+"reg_Date: "+rst.getString(7));
			}
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}