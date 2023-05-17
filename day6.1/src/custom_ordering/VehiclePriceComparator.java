package custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehiclePriceComparator implements Comparator<Vehicle> {
	@Override
	public int compare(Vehicle v1, Vehicle v2) {
	
			return Double.valueOf(v1.getNetPrice()).compareTo(v2.getNetPrice());
		
	}

}
