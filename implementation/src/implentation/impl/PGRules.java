package implentation.impl;

import implementation.app.PgPGRules;

public interface PGRules {
	public static void main(String[] args) {
		PgPGRules pgRules=new PgPGRules();
		System.out.println("Note : "+pgRules.noBoysAllowed());
		System.out.println("HAS Washing Machine : "+pgRules.hasWashingMachine());
		System.out.println("RENT : "+pgRules.rent());

	}

}
