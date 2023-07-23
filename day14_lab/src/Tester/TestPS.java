package Tester;

import static utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class TestPS {
	public static void main(String[] args) throws SQLException {
		try(Scanner sc = new Scanner(System.in)){
		
		Connection cn = openConnection();
				
		PreparedStatement pst = cn.prepareStatement("delete from users where id = ?");
				
		System.out.println("Enter user id to delete");
				pst.setInt(1,sc.nextInt());
				int updateCount = pst.executeUpdate();
				if (updateCount==1)
					System.out.println("user details deleted........");
		else 
			System.out.println("invalid user id");
	
				try(int rst = pst.executeUpdate()){
					//rst API :public boolean next() throwa SE
					while (rst.next()) 
							//readrow data:RST API public Type(int colpos,String colName)
						System.out.println("id: " +rst.getInt(1));
		
					}catch(Exception e) {
						e.printStackTrace();
			
					}
		}
	}
					}
