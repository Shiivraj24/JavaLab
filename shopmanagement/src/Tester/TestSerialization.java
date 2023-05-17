package Tester;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.app.core.Products;
import static ShopUtils.ShopUtils.populateList;
import static ShopUtils.IOUtils.storeProductDetails;;
public class TestSerialization {
	public static void main(String[] args)  {
		try(Scanner sc = new Scanner(System.in)){
			List <Products> list = populateList();
			System.out.println("enter file name");
			storeProductDetails(sc.next(),list);
			System.out.println("products stored");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
