package association.app;

public class ToothPaste {
	public String name;
	public String brand;
	public String company;
	public String[] ingredients;
	
	public ToothPaste( String name, String brand, String company, String[] ingredients) 
	{
		this.name=name;
		this.brand=brand;
		this.company=company;
		this.ingredients=ingredients;
	}
	public void printInfo()
	{
		System.out.println("printing info of  toothpaste");
		System.out.println("The toothpaste brand:"+this.brand);
		System.out.println("The toothpaste company:"+this.company);
    
		for(int index=0; index<this.ingredients.length;index++) {
			String ref=this.ingredients[index];
			System.out.println("The ingredient is "+ref+" at the index" +index);
			
		}
	}

}
