package inheritance;

public class Apple extends Fruit {

	public Apple(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, isFresh);

	}

	@Override
	public void taste() {

		System.out.println(" sour");
	}

	public void jam() {

		System.out.println(super.getName() + " making jam ");
	}

	/*
	 * public String toString() { return super.getName() +" "+super.getColor() + " "
	 * + super.getWeight()+" making jam ";
	 * 
	 * }
	 */

}
