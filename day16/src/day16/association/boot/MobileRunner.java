package day16.association.boot;

import day16.association.app.Charger;
import day16.association.app.Mobile;

public class MobileRunner {
	public static void main(String[] args) {
		String shape = "Rectangle";

		Charger charger=new Charger();

		Mobile mobile=new Mobile(shape);

		mobile.setCharger(charger);

		mobile.brandName();
		mobile.brandName(777);
		mobile.brandName(20);
		mobile.brandName("Realme");

	}

}
