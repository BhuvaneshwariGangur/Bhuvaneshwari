package objects.equals.boot;

import objects.equals.app.Minister;

public class MinisterRunner {

	public static void main(String[] args) {
		
		System.out.println("Invoking main  in Minister");
		   Minister minister=new Minister("divya", "Finance", 98, "Democratic Party", 1000, "dvg");
		   Minister minister1=new Minister("bhuvi", "Health", 78, "Bjp Party", 2000, "gadag");
		   System.out.println(minister);
		   System.out.println(minister1);

		   boolean same=minister.equals(minister1);
		   System.out.println("Minister and Minister1 are same"+same);

	}

}
