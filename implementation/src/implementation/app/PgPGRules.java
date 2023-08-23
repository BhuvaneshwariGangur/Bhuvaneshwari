package implementation.app;

import implentation.impl.PGRules;

public class PgPGRules implements PGRules {

	public String noBoysAllowed() {

		return "BOYS NOT ALLOWED";
	}

	public boolean hasWashingMachine() {

		return true;
	}

	public double rent() {

		return 5000;
	}
}