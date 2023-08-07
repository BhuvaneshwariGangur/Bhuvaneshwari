package chaining.supermethod.app;

public class EdgeRouter extends Router{
	
	public EdgeRouter () {
		super("wired", "local","recieves data", 160000);
		System.out.println("invoking no-arg Const. of Router");
	}
	
	public EdgeRouter(String type, String network, String use,int price) {
		super(type, network,use,price);
		System.out.println("invoking String,String,String,int Cpnst. of Router");
	}

}
