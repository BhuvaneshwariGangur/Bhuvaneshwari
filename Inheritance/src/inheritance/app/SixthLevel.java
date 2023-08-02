package inheritance.app;

public class SixthLevel extends Hierarchy{
	
	String type;
	
	public  void Fruit(String type) {
		System.out.println("invoking main in no-arg in sixth  level hierarchy");
		this.type=type;
		System.out.println("fruit is :"+this.type);
	}

}
