package constructorChainingwithInherit;

public class Pen extends Marker {
	String type;
	int price;

	public Pen(String type, int price) {
		super("blue", "Natraj");
		this.type = type;
		this.price = price;
		System.out.println("Pen is of " + type + " " + "and price is " + price);
	}

	public Pen(int price) {
		System.out.println("Pen is ball Pen and Price is " + price);
	}
}
