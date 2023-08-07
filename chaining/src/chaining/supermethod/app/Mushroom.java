package chaining.supermethod.app;

public class Mushroom {
	
	public String name;
	public int price;
	public String place;
	public String color;
	
	public Mushroom (String name, int price, String place, String color) {
		System.out.println("invoking String,int,String,String Cpnst. of Mushroom");
		
		this.name=name;
		this.price=price;
		this.place=place;
		this.color=color;

		
	}

}
