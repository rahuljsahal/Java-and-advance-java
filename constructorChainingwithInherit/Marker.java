package constructorChainingwithInherit;

public class Marker {
	String brand;
	String color;

	public Marker(String brand) {
		this.brand = brand;
		System.out.println("Brand is " + brand);
	}

	public Marker(String color, String brand) {
		this(brand);
		this.color = color;
		System.out.println("Color is " + color);
	}

	public Marker() {
		// TODO Auto-generated constructor stub
	}

}
