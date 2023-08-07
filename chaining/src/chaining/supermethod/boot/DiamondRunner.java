package chaining.supermethod.boot;

import chaining.supermethod.app.NaturalDiamond;

public class DiamondRunner {
	
	public static void main(String[] args) {
		
		
		System.out.println("invoking main in DiamondRunner");

		NaturalDiamond naturaldiamond = new NaturalDiamond();
		System.out.println(naturaldiamond.name);
		System.out.println(naturaldiamond.types);
		System.out.println(naturaldiamond.shape);
		System.out.println(naturaldiamond.quality);

		System.out.println("*******");

		NaturalDiamond naturaldiamond1 = new NaturalDiamond("regular",10,"oval","very good");
		System.out.println(naturaldiamond1.name);
		System.out.println(naturaldiamond1.types);
		System.out.println(naturaldiamond1.shape);
		System.out.println(naturaldiamond1.quality);

	}

}
