package chaining.supermethod.app;

public class Ground {
	public String type;
	public int Floors;
	public double buildings;
	public double price;
	
	public Ground (String type, int Floors, double buildings, double price) {
		
		System.out.println("invoking String,int,double,double Cpnst. of Gold");
		
		
		
		this.type=type;
		this.Floors=Floors;
		this.buildings=buildings;
		this.price=price;
	}

}
