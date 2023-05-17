package ShopUtils;

import java.util.ArrayList;
import java.util.List;
import com.app.core.Products;
import static validationRules.validations.*;


public interface ShopUtils {

	public static List<Products> populateList() {
		try {
			List<Products> list = new ArrayList<>();
			list.add(validateAllInputs("100", "White_Bread", "Tasty Bread", 70, 35.00, "BREAD", "2022-05-09", list));
			list.add(validateAllInputs("50", "Marie", "Healthy Biscuits", 80, 10, "BISCUITS", "2022-05-01", list));
			list.add(validateAllInputs("40", "Monaco", "Salty Biscuits", 75, 15, "BISCUITS", "2022-04-21", list));
			list.add(validateAllInputs("60", "Sunflowe_Oil", "Healthy Oil", 50, 240, "OIL", "2022-01-20", list));
			list.add(validateAllInputs("70", "Gemini_Oil", "Vegetable Oil", 80, 220, "OIL", "2022-01-30", list));
			list.add(validateAllInputs("80", "Mango", "Seasonal Fruit", 45, 800, "FRUITS", "2022-05-06", list));
			list.add(validateAllInputs("15", "Watermelon", "Great Fruit", 60, 70, "FRUITS", "2022-05-04", list));
			// list.add(validateAllInputs(100, "White_Bread", "Tasty Bread", 70, 35.00,
			// "BREAD","2022-05-09",list));
			return list;

		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}
}
