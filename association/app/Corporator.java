package association.app;

public class Corporator {
	public Building[] buildings;
	public String name;

	public Corporator( String name,Building[] buildings) 
	{
				this.name=name;
				this. buildings=buildings;

	}
	public void printInfo() {
		System.out.println("Invoking main in info");
		System.out.println("corporator name:"+this.name);
		
		for(int corp = 0;corp<this.buildings.length;corp++) {
			Building build=buildings[corp];
			build.printInfo();
		}
		
	}

}
