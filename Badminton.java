 class Badminton{
	String name;
	 int players;
	 String coachName;
     int seat;
	String place;
    
	
	public static void main(String []args)
	{
	System.out.println(" invoking main in badminton");
	
	    Badminton badminton= new Badminton();
		System.out.println(badminton.name); //null
	    System.out.println(badminton.players); //null
		System.out.println(badminton.coachName); //null
	    System.out.println(badminton.seat ); //0
	    System.out.println(badminton.place); //null
		
	    System.out.println(" ===================="); //null
		badminton.name="wankede";
     	badminton.players=1;
        badminton.coachName="gopichand";
		badminton.seat=230;
	    badminton.place = "bengaloru";
		
		System.out.println(badminton.name); //null
	    System.out.println(badminton.players); //null
		System.out.println(badminton.coachName); //null
	    System.out.println(badminton.seat ); //0
	    System.out.println(badminton.place); //null
		
		Badminton badminton1= new Badminton();
		System.out.println(badminton1.name); //null
	    System.out.println(badminton1.players); //null
		System.out.println(badminton1.coachName); //null
	    System.out.println(badminton1.seat ); //0
	    System.out.println(badminton1.place); //null
		
	    System.out.println(" ===================="); //null
		badminton.name="Eden gardens";
     	badminton.players=2;
        badminton.coachName = "kashyap";
		badminton.seat=450;
	    badminton.place = "kolkatha";
		
		System.out.println(badminton1.name); //null
	    System.out.println(badminton1.players); //null
		System.out.println(badminton1.coachName); //null
	    System.out.println(badminton1.seat ); //0
	    System.out.println(badminton1.place); //null
		
		
		}
   
	}