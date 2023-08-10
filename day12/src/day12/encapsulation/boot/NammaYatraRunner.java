package day12.encapsulation.boot;

import day12.encapsulation.app.NammaYatri;

public class NammaYatraRunner {

	public static void main(String[] args) {
		NammaYatri myBooking = new NammaYatri();

		myBooking.setUserName("vanita");
		myBooking.setFullName("vanita Badarali");
		myBooking.setEmail("vanita@gmail.com");
		myBooking.setPhoneNumber("+89243657889");
		myBooking.setSourceCity("gadag");
		myBooking.setDestinationCity("vijayapura");
		myBooking.setTravelDate("2023-08-15");
		myBooking.setBookingReference("NY123456");
		myBooking.setNumberOfPassengers(2);
		myBooking.setTotalFare(200.00);
		myBooking.setTravelClass("AC");
		myBooking.setRoundTrip(false);
		myBooking.setCancelled(false);

		System.out.println("User Name: " + myBooking.getUserName());
		System.out.println("Full Name: " + myBooking.getFullName());
		System.out.println("Email: " + myBooking.getEmail());
		System.out.println("Phone Number: " + myBooking.getPhoneNumber());
		System.out.println("Source City: " + myBooking.getSourceCity());
		System.out.println("Destination City: " + myBooking.getDestinationCity());
		System.out.println("Travel Date: " + myBooking.getTravelDate());
		System.out.println("Booking Reference: " + myBooking.getBookingReference());
		System.out.println("Number of Passengers: " + myBooking.getNumberOfPassengers());
		System.out.println("Total Fare: " + myBooking.getTotalFare());
		System.out.println("Travel Class: " + myBooking.getTravelClass());
		System.out.println("Round Trip: " + myBooking.isRoundTrip());
		System.out.println("Cancelled: " + myBooking.isCancelled());

	}

}
