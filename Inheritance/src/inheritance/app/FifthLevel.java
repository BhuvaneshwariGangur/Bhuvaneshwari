package inheritance.app;

public class FifthLevel extends Hierarchy {
	String type;
	
	public void Flower(String type) {
	System.out.println("invoking main in no-arg in fifth level hierarchy");
	this.type=type;
	System.out.println("flower is :"+this.type);
	}

}
