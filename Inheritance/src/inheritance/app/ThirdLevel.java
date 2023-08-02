package inheritance.app;

public class ThirdLevel extends Hierarchy{
	String color;
	
	public void Stem(String color ) {
		System.out.println("invoking main in no-arg in third level hierarchy");
		this.color=color;
		System.out.println("stem is :"+this.color);

		
	}

}
