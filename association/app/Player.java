package association.app;

public class Player {

	public String name;
	public int exp;
	public Building building;
	public HomeTown town;

	public Player(String name,int exp, Building building, HomeTown town) {
		this.name=name;
		this.exp=exp;
		this.building=building;
		this.town=town;
	}
	public void printInfo()
	{
		System.out.println("printing info in player");
		System.out.println("player name:"+this.name);
		System.out.println("player exp:"+this.exp);
		
		town.printInfo();
		building.printInfo();
		
	}

}
