package implementation.boot;

import implementation.app.TempleTempleRules;
import implentation.impl.TempleRules;

public class TempleRunner {

	public static void main(String[] args) {
		TempleRules rules = new TempleTempleRules();
		rules.openTimings(11);
		rules.NoMobile();
		rules.noSmoking();

	}

}
