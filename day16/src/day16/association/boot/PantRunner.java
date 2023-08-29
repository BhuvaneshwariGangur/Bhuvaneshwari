package day16.association.boot;

import day16.association.app.Pant;
import day16.association.app.Zip;

public class PantRunner {
	public static void main(String[] args) {
		String style="Cargos";

		Zip zip=new Zip();

		Pant pant=new Pant(style);
		pant.setZip(zip);
		pant.wash();

	}
}
