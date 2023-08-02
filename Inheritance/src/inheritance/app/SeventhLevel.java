package inheritance.app;

public class SeventhLevel extends Hierarchy{
	
	String type;
	
	public void Soil(String type) {
		System.out.println("invoking main in no-arg in seventh level hierarchy");
		this.type=type;
		System.out.println("soil is :"+this.type);
		
	}

}
