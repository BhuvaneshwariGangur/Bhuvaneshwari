package day12.encapsulation.boot;

import day12.encapsulation.app.IRCTC;

public class IRCTCRunner {

	public static void main(String[] args) {
		IRCTC myIRCTCAccount = new IRCTC();

		myIRCTCAccount.setUserName("Bhuvi");
		myIRCTCAccount.setFullName("Bhuvaneshwari Gangur");
		myIRCTCAccount.setEmail("bhuvi@gmail.com");
		myIRCTCAccount.setPhoneNumber("+1122334455");
		myIRCTCAccount.setAddress("163 Main St, City");
		myIRCTCAccount.setIdProofType("Aadhar Card");
		myIRCTCAccount.setIdProofNumber("111456787912");
		myIRCTCAccount.setTicketsBooked(10);
		myIRCTCAccount.setCancellationCount(2);
		myIRCTCAccount.setLoyaltyPoints(100);
		myIRCTCAccount.setRegistered(true);
		myIRCTCAccount.setVerified(true);
		myIRCTCAccount.setLastLogin("2023-08-10 15:40");
		myIRCTCAccount.setPreferredLanguage("English");

		System.out.println("User Name: " + myIRCTCAccount.getUserName());
		System.out.println("Full Name: " + myIRCTCAccount.getFullName());
		System.out.println("Email: " + myIRCTCAccount.getEmail());
		System.out.println("Phone Number: " + myIRCTCAccount.getPhoneNumber());
		System.out.println("Address: " + myIRCTCAccount.getAddress());
		System.out.println("ID Proof Type: " + myIRCTCAccount.getIdProofType());
		System.out.println("ID Proof Number: " + myIRCTCAccount.getIdProofNumber());
		System.out.println("Tickets Booked: " + myIRCTCAccount.getTicketsBooked());
		System.out.println("Cancellation Count: " + myIRCTCAccount.getCancellationCount());
		System.out.println("Loyalty Points: " + myIRCTCAccount.getLoyaltyPoints());
		System.out.println("Registered: " + myIRCTCAccount.isRegistered());
		System.out.println("Verified: " + myIRCTCAccount.isVerified());
		System.out.println("Last Login: " + myIRCTCAccount.getLastLogin());
		System.out.println("Preferred Language: " + myIRCTCAccount.getPreferredLanguage());
	}

	}


