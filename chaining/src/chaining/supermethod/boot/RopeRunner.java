package chaining.supermethod.boot;

import chaining.supermethod.app.NylonRope;

public class RopeRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking main in ropeRunner");

		NylonRope nylonrope = new NylonRope();
		System.out.println(nylonrope.strenght);
		System.out.println(nylonrope.use);
		System.out.println(nylonrope.price);
		System.out.println(nylonrope.color);

		System.out.println("*********");

		NylonRope nylonrope1 = new NylonRope("good","dragging",600,"black");
		System.out.println(nylonrope1.strenght);
		System.out.println(nylonrope1.use);
		System.out.println(nylonrope1.price);
		System.out.println(nylonrope1.color);

	}

}
