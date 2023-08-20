package objects.equals.boot;

import objects.equals.app.Sniper;

public class SniperRunner {

	public static void main(String[] args) {
	
	        System.out.println("Invoking main in Sniper");
	        Sniper sniper1 = new Sniper("Chaii", "shivamoga", 32, "US Marine Corps", 95.5, true);
	        Sniper sniper2 = new Sniper("varsha", "bijapur", 28, "US Marine Corps", 98.2, true);
	        System.out.println(sniper1);
	        boolean same = sniper1.equals(sniper2);
	        System.out.println("Sniper1 and Sniper2 are the same: " + same);

	}

}
