package inheritance;

public class Mango extends Fruit {
    
	
	public Mango(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, isFresh);
		
	}

	@Override
	public void taste() {
		
		System.out.println("Sweet");
	}
	
	public void pulp() {
	
		System.out.println(super.getName()+" Extracting pulp()");
	}
	

	/*
	 * public String toString() { return super.getName()+ " "+super.getColor()
	 * +" "+super.getFresh()+" "+ super.getWeight() + " extracting pulp " ;
	 * 
	 * }
	 */
}
