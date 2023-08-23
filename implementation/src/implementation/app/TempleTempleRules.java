package implementation.app;

import implentation.impl.TempleRules;

public class TempleTempleRules implements TempleRules {
	public void NoMobile() {
		System.out.println("NoMobile method implemention in Class....");

	}

	
	public int openTimings(int time) {
		System.out.println("OpenTimings method implemention in Class....");
		System.out.println("Open Timings : " + time);
		return 1;
	}

	
	public void noSmoking() {
		System.out.println("NoSmoking method implemention in Class....");
	}

}
