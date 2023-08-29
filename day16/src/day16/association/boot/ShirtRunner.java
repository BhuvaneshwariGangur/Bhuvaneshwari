package day16.association.boot;

import day16.association.app.Button;
import day16.association.app.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {

		Button button = new Button();

		Shirt shirt = new Shirt("Denim");
		shirt.setButton(button);
		System.out.println("stich method returns : " + shirt.stich());

	}

	
}
