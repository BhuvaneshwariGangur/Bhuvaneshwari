package day16.association.app;

public class Bus {
	String type;
	private Passanger passenger;

	public Bus(String type) {
		this.type=type;
		System.out.println("Bus Name : "+this.type);
	}

	public void setPassenger(Passanger passenger) {
		this.passenger=passenger;
	}

	public void drive() {
		System.out.println("Calling drive method in Bus Class");
		System.out.println("totalPassenger Method From Passenger Class returns : "+this.passenger.totalPassesnger());
	}

}
