package day17.abstraction.impl;

import day17.abstraction.rules.PassportVerification;

public class Customer {
	private PassportVerification verification;

	public void verifyCitizen() {
		System.out.println("Verify Citizen method in Customer Class");
		this.verification.verify();
	}

	public void setVerification(PassportVerification verification) {
		this.verification = verification;
	}

}
