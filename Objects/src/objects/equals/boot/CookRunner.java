package objects.equals.boot;

import objects.equals.app.Cook;

public class CookRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in CookRunner");
		Cook cook1 = new Cook("kamat", "Italian Cuisine", 10, "Indian", 40000.0, false);
	    Cook cook2 = new Cook("kamat", "French Cuisine", 10, "Indian", 54000.0, true);

	    System.out.println(cook1);
	    boolean same = cook1.equals(cook2);
	    System.out.println("Cook1 and Cook2 are the same: " + same);

	}

}
