package chaining.supermethod.app;

public class Floors extends Ground{
	public Floors() {
		super("surface", 4,5, 15000000);
		System.out.println("invoking no-arg Const. of Ground");
	}
	
	public Floors(String type, int Floors, double buildings, double price) {
		super(type, Floors, buildings,price);
		System.out.println("invoking String,int,double,double Cpnst. of Ground");
	}

}
