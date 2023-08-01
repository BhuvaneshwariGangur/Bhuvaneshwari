package association.app;

public class Ingredients {
   public String name;
   public int quantity;
   public float cost;
   
   public Ingredients(String name,int quantity,float cost) {
	   this.name=name;
	   this.quantity=quantity;
	   this.cost=cost;
   }
   public void  printInfo()
   {
	   System.out.println("printing info of ingredients");
		System.out.println("the ingredient name:"+this.name);
		System.out.println("the ingredient quantity:"+this.quantity);
		System.out.println("the ingredient cost:"+this.cost);
		  
   }
}
