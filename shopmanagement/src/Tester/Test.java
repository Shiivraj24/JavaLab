package Tester;

import java.util.List;
import java.util.Scanner;
import static ShopUtils.ShopUtils.populateList;
import com.app.core.*;

import customexception.ProductException;

import static validationRules.validations.validateAllInputs;
public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			
			List<Products> list = populateList();
			boolean exit = false;
			
			while(!exit) {
				System.out.println("Options 1. Add a product 2. Display all "
						+ "3. Get specific product details 4. Apply discount  "
						+ "5. Delete product details  by pid6. Delete product by category " + "0.Exit");
				System.out.println("Choose an option");
			
			switch (sc.nextInt()) {
			case 1:
				System.out.println(
						"Enter product details : productId,  name, desc,  quantity,  price, productCategory,\r\n"
						+ "	manufactureDate");
				Products product =validateAllInputs(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.next(), sc.next(), list);
				list.add(product);
				System.out.println("product added....");
				break;
			case 2:
				System.out.println("shop contents :");
				for(Products p :list)
					System.out.println(p);
				break;
				
			case 3:
				System.out.println("Enter product id");
				Products product1 = new Products(sc.next());
				int index = list.indexOf(product1);
				if (index == -1)
					throw new ProductException("product not found");
				System.out.println(list.get(index));
				break;
			case 0:
				break;
			}
			
			}
		} catch (Exception e) {
			
		}

	}

}
