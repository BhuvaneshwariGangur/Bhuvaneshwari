package chaining.supermethod.app;

public class BeechMushroom extends Mushroom{
	
	public BeechMushroom() {
		super("cremini mushrrom", 350,"beach","white");
		System.out.println("invoking no-arg Const. of Mushroom");
	}
	
	public BeechMushroom(String name, int price, String place, String color) {
		super(name, price, place,color);
		System.out.println("invoking String,int,String,String Cpnst. of Mushroom");
	}

}
