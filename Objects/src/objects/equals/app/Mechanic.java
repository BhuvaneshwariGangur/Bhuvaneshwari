package objects.equals.app;

public class Mechanic {
	private String name;
    private int experienceYears;
    private String specialization;
    private double hourlyRate;
    private String place;
    private String shopName;
	
    
    public Mechanic() {
		super();
	}


	@Override
	public String toString() {
		return "Mechanic [name=" + name + ", experienceYears=" + experienceYears + ", specialization=" + specialization
				+ ", hourlyRate=" + hourlyRate + ", place=" + place + ", shopName=" + shopName + "]";
	}


	public Mechanic(String name, int experienceYears, String specialization, double hourlyRate, String place,
			String shopName) {
		super();
		this.name = name;
		this.experienceYears = experienceYears;
		this.specialization = specialization;
		this.hourlyRate = hourlyRate;
		this.place = place;
		this.shopName = shopName;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + experienceYears;
		long temp;
		temp = Double.doubleToLongBits(hourlyRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + ((shopName == null) ? 0 : shopName.hashCode());
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mechanic other = (Mechanic) obj;
		if (experienceYears != other.experienceYears)
			return false;
		if (Double.doubleToLongBits(hourlyRate) != Double.doubleToLongBits(other.hourlyRate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (shopName == null) {
			if (other.shopName != null)
				return false;
		} else if (!shopName.equals(other.shopName))
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		return true;
	}
    
    
    

}
