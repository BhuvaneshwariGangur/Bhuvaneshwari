package inheritance.app;

public class TwoLevel extends Hierarchy{
	
	String type;
	
	public void Root(String type) {
		System.out.println("invoking main in no-arg in two level hierarchy");
		this.type=type;
		System.out.println("root is :"+this.type);

	}

}
