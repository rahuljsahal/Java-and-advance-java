package constructorChainingwithInherit;

public class BallPen extends Pen {
	int quantity;

	public BallPen(int quantity) {
		super("ball pen", 10);
		this.quantity = quantity;
		System.out.println("Quantity is " + quantity);
	}

}
