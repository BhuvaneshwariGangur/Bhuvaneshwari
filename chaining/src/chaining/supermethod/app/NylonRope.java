package chaining.supermethod.app;

public class NylonRope extends Rope {
	
	public NylonRope() {
		super("normal", "lifting", 450, "white");
		System.out.println("invoking no-arg Const. of nylonrope");
	}

	public NylonRope(String name, String use, double price, String color) {
		super(name, use, price, color);
		System.out.println("invoking String,double,double,String Cpnst. of nylonRope");
	}

}
