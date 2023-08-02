package inheritance.app;

public class SingleLevel extends Hierarchy{
	String type;
	
	public void Seed(String type) {
		System.out.println("invoking the no-arg in single level hierarchy");
		this.type=type;
		System.out.println("seed is :"+this.type);
		
	}

}
