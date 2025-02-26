package constructorChainingwithInherit;

public class GelPen extends Pen {
	int price;

	public GelPen(int price) {
		super(40);
		System.out.println("Price of gel Pen " + price);
	}

	public static void main(String[] args) {
		System.out.println("Start");
		GelPen pen = new GelPen(50);
		BallPen pen2 = new BallPen(200);
		System.out.println("End");
	}

}
