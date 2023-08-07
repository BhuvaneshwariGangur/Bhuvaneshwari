package chaining.supermethod.boot;

import chaining.supermethod.app.BeechMushroom;

public class MushroomRunner {
public static void main(String[] args) {
		
		
		System.out.println("invoking main in Mushroom");

		BeechMushroom beechmushroom = new BeechMushroom();
		System.out.println(beechmushroom.name);
		System.out.println(beechmushroom.price);
		System.out.println(beechmushroom.place);
		System.out.println(beechmushroom.color);

		System.out.println("************************");

		BeechMushroom beechmushroom1 = new BeechMushroom("button mushroom",650,"sea","brown");
		System.out.println(beechmushroom1.name);
		System.out.println(beechmushroom1.price);
		System.out.println(beechmushroom1.place);
		System.out.println(beechmushroom1.color);


	}


}
