package implementation.app;

import implentation.impl.MetroRules;

public class MetroMetroRules implements MetroRules {
	public String announcement(char gender) {
		System.out.println("Announcement method implemention in Class....");
		System.out.println("Gender : " + gender);
		return null;
	}

	public int timings(int time) {
		System.out.println("Timings method implemention in Class....");
		System.out.println("Time : " + time);
		return 0;
	}

	public double payment(double amount) {
		System.out.println("Payment method implemention in Class....");
		System.out.println("Amount : " + amount);
		return 0;
	}

}
