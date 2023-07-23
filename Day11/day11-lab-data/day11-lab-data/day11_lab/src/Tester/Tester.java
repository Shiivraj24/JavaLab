package Tester;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import static utils.EmpValidationRules.*;
import com.myorg.Department;
import com.myorg.Employee;
import static utils.IOUtils.storeEmployee;
import static utils.IOUtils.restoreEmpDetails;

import utils.EmpValidationRules;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			//init restore
			System.out.println("Enter file name");
			String fileName =sc.next();
			Map<String, Employee> empMap = restoreEmpDetails(fileName);
			System.out.println("restored map");
			boolean exit =false;
			while (!exit) {
				System.out.println("");
				try {
					switch (sc.nextInt()) {
					
					case 1:
					    System.out.println("Enter emp details:id, firstName,lastName,  dept,  joinDate, salary");
					    String empId = checkForDup(sc.next(),empMap);
					    String firstName =sc.next();
					    String lastName= sc.next();
					    double salary =sc.nextDouble();
					    Department department =parseAndValidateDepartment(sc.next());
					    LocalDate joinDate = parseAndValidateJoinDate(sc.next());
					    //Object salary;
						empMap.put(empId, empId, firstName,lastName,  department,  joinDate, salary);
					    System.out.println("emp added");
						break;
						
					case 2:
						System.out.println("All emps");
						
						
						break;
						
					case 0:exit=true;
						//store emp details in bin file 
					storeEmployee(empMap, fileName);
						break;	

					default:
						break;
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
