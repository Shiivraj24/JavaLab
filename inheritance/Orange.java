package inheritance;

public class Orange extends Fruit {

	public Orange(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, isFresh);

	}

	@Override
	public void taste() {

		System.out.println("Sweet n sour");
	}

	public void pulp() {

		System.out.println(super.getName() + " Extracting juice");
	}

	/*
	 * public String toString() { return super.getName() +" " +super.getColor() +" "
	 * + super.getWeight()+" Extracting juice";
	 * 
	 * }
	 */
}
