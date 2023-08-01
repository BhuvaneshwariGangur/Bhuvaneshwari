package association.app;

public class Browser {
	public String type;
	public Internet internet;
	
	public  void currency() 
	{
		System.out.println("Invoking currency in Browser");
		if(this.internet!=null)
		{
			 this.internet.amount();
		}
		else
		{
			System.out.println("Internet is Null, Hence Not operate amount () Method");
		}
	}
	public void server()
	{
		
		System.out.println("Invoking server in Browser");
		if(this.internet!=null)
		{
			this.internet.port();
		}
		else
		{
			System.out.println("Internet is Null, Not operate port() Method");
		}

	}
}

