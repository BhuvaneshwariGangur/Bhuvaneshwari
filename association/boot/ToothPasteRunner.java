package association.boot;

import association.app.Company;
import association.app.ToothPaste;

public class ToothPasteRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in toothpaste runner");
		 String name="dabur red";
		 String brand="red label";
		 String company="red label ayurvedic";
		 String[] ingredients= {"salt","cloves","pudina","garlic"};
		 
		 
		 String cname="Red Label";
		 String ceo="Mohit Malhotra";
		 String originCountry="India";
		 
		 
		ToothPaste toothpaste=new ToothPaste(name,brand,company,ingredients);
		toothpaste.printInfo();
		
		Company company1=new Company(cname,ceo,originCountry);
		company1.printInfo();

	}

}
