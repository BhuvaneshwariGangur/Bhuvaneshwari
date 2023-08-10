package day12.encapsulation.boot;

import day12.encapsulation.app.RedBus;

public class RedBusRunner {
	public static void main(String[] args) {
		RedBus myRedBusBooking = new RedBus();

		myRedBusBooking.setUserName("vinayak");
		myRedBusBooking.setFullName("vinayak Gangur");
		myRedBusBooking.setEmail("vinayak17@gmail.com");
		myRedBusBooking.setPhoneNumber("+4445678374");
		myRedBusBooking.setBoardingPoint("gadag");
		myRedBusBooking.setDestination("Bangalore");
		myRedBusBooking.setTravelDate("2023-08-15");
		myRedBusBooking.setBookingReference("RB123456");
		myRedBusBooking.setSeatsBooked(1);
		myRedBusBooking.setTotalFare(100.00);
		myRedBusBooking.setBusType("Sleeper");
		myRedBusBooking.setRoundTrip(false);
		myRedBusBooking.setCancelled(false);

		System.out.println("User Name: " + myRedBusBooking.getUserName());
		System.out.println("Full Name: " + myRedBusBooking.getFullName());
		System.out.println("Email: " + myRedBusBooking.getEmail());
		System.out.println("Phone Number: " + myRedBusBooking.getPhoneNumber());
		System.out.println("Boarding Point: " + myRedBusBooking.getBoardingPoint());
		System.out.println("Destination: " + myRedBusBooking.getDestination());
		System.out.println("Travel Date: " + myRedBusBooking.getTravelDate());
		System.out.println("Booking Reference: " + myRedBusBooking.getBookingReference());
		System.out.println("Seats Booked: " + myRedBusBooking.getSeatsBooked());
		System.out.println("Total Fare: " + myRedBusBooking.getTotalFare());
		System.out.println("Bus Type: " + myRedBusBooking.getBusType());
		System.out.println("Round Trip: " + myRedBusBooking.isRoundTrip());
		System.out.println("Cancelled: " + myRedBusBooking.isCancelled());
	}

}
