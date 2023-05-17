package Tester;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import static ShopUtils.IOUtils.restoreProductDetails;

public class TestDeSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file names");
			System.out.println("Product details restored from file :");
			restoreProductDetails(sc.nextLine()).forEach((k) -> System.out.println(k));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
