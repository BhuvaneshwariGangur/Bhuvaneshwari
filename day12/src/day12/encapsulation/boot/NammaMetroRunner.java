package day12.encapsulation.boot;

import day12.encapsulation.app.NammaMetro;

public class NammaMetroRunner {

	public static void main(String[] args) {
		NammaMetro myMetroTicket = new NammaMetro();

		myMetroTicket.setUserName("divya");
		myMetroTicket.setFullName("K.divya");
		myMetroTicket.setEmail("kottur@gmail.com");
		myMetroTicket.setPhoneNumber("+7856453411");
		myMetroTicket.setSourceStation("RajajiNagar");
		myMetroTicket.setDestinationStation("majestic");
		myMetroTicket.setTravelDate("2023-08-15");
		myMetroTicket.setTicketNumber("NM123456");
		myMetroTicket.setNumberOfPassengers(1);
		myMetroTicket.setTotalFare(14.00);
		myMetroTicket.setTravelClass("Standard");
		myMetroTicket.setRoundTrip(false);
		myMetroTicket.setCancelled(false);

		System.out.println("User Name: " + myMetroTicket.getUserName());
		System.out.println("Full Name: " + myMetroTicket.getFullName());
		System.out.println("Email: " + myMetroTicket.getEmail());
		System.out.println("Phone Number: " + myMetroTicket.getPhoneNumber());
		System.out.println("Source Station: " + myMetroTicket.getSourceStation());
		System.out.println("Destination Station: " + myMetroTicket.getDestinationStation());
		System.out.println("Travel Date: " + myMetroTicket.getTravelDate());
		System.out.println("Ticket Number: " + myMetroTicket.getTicketNumber());
		System.out.println("Number of Passengers: " + myMetroTicket.getNumberOfPassengers());
		System.out.println("Total Fare: " + myMetroTicket.getTotalFare());
		System.out.println("Travel Class: " + myMetroTicket.getTravelClass());
		System.out.println("Round Trip: " + myMetroTicket.isRoundTrip());
		System.out.println("Cancelled: " + myMetroTicket.isCancelled());
	}

	}


