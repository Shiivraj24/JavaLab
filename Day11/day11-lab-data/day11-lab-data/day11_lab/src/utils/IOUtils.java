package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.myorg.Employee;

import custom_exceptions.EmployeeHandlingException;

public interface IOUtils {
     //static method to store employee details
	static void storeEmployee(Map<String, Employee> emps,String fileName) throws EmployeeHandlingException, IOException{
		//IO Strm Serialization
		//java aap -->oos-->fos-->Bin file
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
			//ser
			out.writeObject(emps);
			
		}
		
	}
	//Static method restore emp
	static Map <String, Employee> restoreEmpDetails(String fileName){
		//deser= java app-->ois-->fis-->bin file
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
			return(Map<String, Employee>)in.readObject();
			
		}catch(Exception e) {
			System.out.println("err during de ser" +e);
			return new HashMap<String, Employee>();
		}
	}
}
