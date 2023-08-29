package day16.association.boot;

import day16.association.app.Bus;
import day16.association.app.Passanger;

public class BusRunner {

	public static void main(String[] args) {
		String type = "VRL";

		Passanger passenger = new Passanger();

		Bus bus = new Bus(type);
		bus.setPassenger(passenger);
		bus.drive();

	}

}
