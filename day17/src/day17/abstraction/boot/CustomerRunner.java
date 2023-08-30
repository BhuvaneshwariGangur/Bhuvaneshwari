package day17.abstraction.boot;

import day17.abstraction.impl.Customer;
import day17.abstraction.impl.PassportVerificationImpl;
import day17.abstraction.rules.PassportVerification;

public class CustomerRunner {
	public static void main(String[] args) {
		PassportVerification passportVerification = new PassportVerificationImpl();

		Customer customer = new Customer();
		customer.setVerification(passportVerification);
		customer.verifyCitizen();
	}
}


