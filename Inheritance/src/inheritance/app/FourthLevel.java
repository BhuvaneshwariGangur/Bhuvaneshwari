package inheritance.app;

public class FourthLevel extends Hierarchy {
	String status;
	
	public void Leaf(String status) {
		System.out.println("invoking main in no-arg in fourth level hierarchy");
		this.status=status;
		System.out.println("leaf is :"+this.status);
		
	}

}
