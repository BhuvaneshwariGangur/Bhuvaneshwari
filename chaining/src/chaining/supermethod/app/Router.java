package chaining.supermethod.app;

public class Router {
	public String type;
	public String network;
	public String use;
	public int price;
	
	public Router (String type, String network, String use, int price) {
		
		System.out.println("invoking String,int,double,double Cpnst. of Gold");
		
		
		
		this.type=type;
		this.network=network;
		this.use=use;
		this.price=price;
	}


}
