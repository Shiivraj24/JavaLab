package validationRules;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import customexception.ProductException;
import com.app.core.Category;
import com.app.core.Products;
public class validations {
	
       
       public static Products validateAllInputs(String productId, String name, String desc, int quantity, double price, String productCategory,
   			String manufactureDate,List<Products> list) throws ProductException {
    	  checkForDuplicate(productId,list);
    	  Category cat =validateAndParseCategory(productCategory);
    	  LocalDate d1 =validateAndParseDate(manufactureDate);
    	  int qty =validateQuntity( quantity);
    	  return new Products(productId,name,desc,qty,price,cat,d1);
       }

	 public static int validateQuntity(int quantity) throws ProductException {
		if (quantity < 0)
			throw new ProductException("Quntity should not be negative");
		return quantity;
	}

	 public static LocalDate validateAndParseDate(String manufactureDate) throws DateTimeParseException {
		LocalDate d1 =LocalDate.parse(manufactureDate);
			return d1;
	
	}

	public static Category validateAndParseCategory(String productCategory) throws IllegalArgumentException  {
		    return Category.valueOf(productCategory.toUpperCase());
		
	}

	public static void checkForDuplicate(String newproductId, List<Products> list) throws ProductException {
		   Products product = new Products(newproductId);
		       if (list.contains(product))
		    	   throw new ProductException("dup prod id found");
		       System.out.println("no dup found");
		       
		
	}
}

