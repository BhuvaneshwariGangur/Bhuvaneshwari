package chaining.supermethod.app;

public class Bites extends Coffe {
	
	public Bites() {
		super("coffe","bru", 100, 150);
		System.out.println("invoking no-arg Const. of Coffe");
	}
	
	public Bites(String type, String brand, double quantity, double price) {
		super(type, brand, quantity,price);
		System.out.println("invoking String,String,double,double Cpnst. of Coffe");
	}

}
