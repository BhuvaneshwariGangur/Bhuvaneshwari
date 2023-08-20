package objects.equals.boot;

import objects.equals.app.CEO;

public class CEORunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in CeoKiller");

        CEO ceo1 = new CEO("Mark", "facebook", 60, 1000000.0, true, "Technology");
        CEO ceo2 = new CEO("Mark", "facebook", 56, 2000000.0, false, "Finance");

        System.out.println(ceo1);
        boolean same = ceo1.equals(ceo2);
        System.out.println("Ceo1 and Ceo2 are the same: " + same);

	}

}
