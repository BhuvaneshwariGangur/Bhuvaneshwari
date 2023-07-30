package association.boot;

import association.app.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in HotelRunner");
		Hotel hotel = new Hotel();
		hotel.food();
		hotel.owner();

	}

}
