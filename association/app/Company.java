package association.app;

public class Company {
	public String name;
	public String ceo;
	public String originCountry;
	
	public Company(String name,String ceo,String originCountry)
	{
		this.name=name;
		this.ceo=ceo;
		this.originCountry=originCountry;
		 
	}
	public void printInfo() {
		System.out.println("printing info of company");
		System.out.println("the company name:"+this.name);
		System.out.println("the company ceo:"+this.ceo);
		System.out.println("the company originCountry:"+this.originCountry);
		
	
	}
	

}
