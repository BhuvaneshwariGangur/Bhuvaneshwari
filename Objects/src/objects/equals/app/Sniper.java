package objects.equals.app;

public class Sniper {
	private String name;
    private String place;
    private int age;
    private String affiliation;
    private double accuracy;
    private boolean professional;
	
    public Sniper() {
		super();
	}

	@Override
	public String toString() {
		return "Sniper [name=" + name + ", place=" + place + ", age=" + age + ", affiliation=" + affiliation
				+ ", accuracy=" + accuracy + ", professional=" + professional + "]";
	}

	public Sniper(String name, String place, int age, String affiliation, double accuracy, boolean professional) {
		super();
		this.name = name;
		this.place = place;
		this.age = age;
		this.affiliation = affiliation;
		this.accuracy = accuracy;
		this.professional = professional;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accuracy);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((affiliation == null) ? 0 : affiliation.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + (professional ? 1231 : 1237);
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
		Sniper other = (Sniper) obj;
		if (Double.doubleToLongBits(accuracy) != Double.doubleToLongBits(other.accuracy))
			return false;
		if (affiliation == null) {
			if (other.affiliation != null)
				return false;
		} else if (!affiliation.equals(other.affiliation))
			return false;
		if (age != other.age)
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
		if (professional != other.professional)
			return false;
		return true;
	}
    
    
    
    
}
