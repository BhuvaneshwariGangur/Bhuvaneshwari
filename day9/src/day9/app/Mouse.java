package day9.app;

public class Mouse {
	public void mouse()
	{
		System.out.println("Calling method of no-arg...");
		mouse(90);
	}

	public void mouse(String type)
	{
		System.out.println("Calling method of String. arg..");
		System.out.println("Type : "+type);
		mouse("wired","Lenovo");
	}

	public void mouse(String type,String name)
	{
		System.out.println("Calling method of Strin,String arg...");
		System.out.println("Type : "+type);
		System.out.println("Name : "+name);
	}

	public void mouse(int number)
	{
		System.out.println("Calling method ofint arg...");
		System.out.println("Number : "+number);
		mouse("Wireless");
	}
}


