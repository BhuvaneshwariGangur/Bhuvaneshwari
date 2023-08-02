package inheritance.app;

public class EightLevel extends Hierarchy{
	
	String name;
	public void Juice(String name) {
		System.out.println("invoking main in no-arg in eight level hierarchy");
		this.name=name;
		System.out.println("juice is :"+this.name);
	}

}
