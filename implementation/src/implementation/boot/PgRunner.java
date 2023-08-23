package implementation.boot;

import implementation.app.PgPGRules;

public class PgRunner {
	public static void main(String[] args) {
		PgPGRules pgRules=new PgPGRules();
		System.out.println("Note : "+pgRules.noBoysAllowed());
		System.out.println("HAS Washing Machine : "+pgRules.hasWashingMachine());
		System.out.println("RENT : "+pgRules.rent());

	}
	
		

}
