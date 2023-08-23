package implementation.boot;

import implementation.app.MetroMetroRules;
import implentation.impl.MetroRules;

public class MetroRunner {
	public static void main(String[] args) {
		MetroRules metroRules = new MetroMetroRules();
		metroRules.announcement('F');
		metroRules.payment(14.25);
		metroRules.timings(12);

	}
}
