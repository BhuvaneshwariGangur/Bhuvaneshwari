package objects.equals.boot;

import objects.equals.app.Kalla;

public class KallaRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in ThiefEncounter");
        Kalla kalla = new Kalla("Jack", "mysore", 30, "Nightshade Gang", 50000.0, true);
        Kalla kalla1 = new Kalla("Jack", "mysore", 40, "Nightshade Gang", 50000.0, true);
        System.out.println(kalla);
        boolean same = kalla.equals(kalla1);
        System.out.println("Kalla and Kalla1 are same: " + same);

	}

}
