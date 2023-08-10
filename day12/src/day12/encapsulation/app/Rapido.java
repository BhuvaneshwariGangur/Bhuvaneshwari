package day12.encapsulation.app;

public class Rapido {
	private String userName;
	private String fullName;
	private String email;
	private String phoneNumber;
	private String pickupLocation;
	private String dropLocation;
	private String rideType;
	private String driverName;
	private double rideFare;
	private double distanceTraveled;
	private int rating;
	private boolean isRideCompleted;
	private boolean isPaymentDone;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDropLocation() {
		return dropLocation;
	}

	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	public String getRideType() {
		return rideType;
	}

	public void setRideType(String rideType) {
		this.rideType = rideType;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public double getRideFare() {
		return rideFare;
	}

	public void setRideFare(double rideFare) {
		this.rideFare = rideFare;
	}

	public double getDistanceTraveled() {
		return distanceTraveled;
	}

	public void setDistanceTraveled(double distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public boolean isRideCompleted() {
		return isRideCompleted;
	}

	public void setRideCompleted(boolean rideCompleted) {
		isRideCompleted = rideCompleted;
	}

	public boolean isPaymentDone() {
		return isPaymentDone;
	}

	public void setPaymentDone(boolean paymentDone) {
		isPaymentDone = paymentDone;
	}

}
