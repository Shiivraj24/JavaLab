package inheritance;

public abstract class Fruit {
	private String name, color;
	private double weight;
	private boolean isFresh;

	public Fruit(String name, String color, double weight, boolean isFresh) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}

	public String toString() {
		return  name +" " +color +  " " + weight;
	}

	public abstract void taste();

	public String getName() {
		return name;

	}

	public double getWeight() {
		return weight;

	}

	public boolean getFresh() {
		return isFresh;

	}

	public String getColor() {
		return color;

	}

}
