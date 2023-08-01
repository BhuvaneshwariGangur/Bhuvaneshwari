package association.app;

public class Sport {
	
	public String name;
	public Player[] players;
	
	public Sport(String name, Player[] players){
	this.name=name;
	this.players=players;
		
	}
	public void printInfo() {
		System.out.println("printing sports info");
		System.out.println("sports name:"+name);
		
		for(int index = 0;index<this.players.length;index++)
		{
			Player player=players[index];
		    player.printInfo();
	}
	} 
}
