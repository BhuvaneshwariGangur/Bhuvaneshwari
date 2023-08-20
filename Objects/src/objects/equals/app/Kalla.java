package objects.equals.app;

public class Kalla {
	private String name;
    private String place;
    
	private int age;
    private String gang;
    private double bounty;
    private boolean isMale;
    
    
    public Kalla() {
		super();
	}


	@Override
	public String toString() {
		return "Kalla [name=" + name + ", place=" + place + ", age=" + age + ", gang=" + gang + ", bounty=" + bounty
				+ ", isMale=" + isMale + "]";
	}


	public Kalla(String name, String place, int age, String gang, double bounty, boolean isMale) {
		super();
		this.name = name;
		this.place = place;
		this.age = age;
		this.gang = gang;
		this.bounty = bounty;
		this.isMale = isMale;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(bounty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((gang == null) ? 0 : gang.hashCode());
		result = prime * result + (isMale ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
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
		Kalla other = (Kalla) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(bounty) != Double.doubleToLongBits(other.bounty))
			return false;
		if (gang == null) {
			if (other.gang != null)
				return false;
		} else if (!gang.equals(other.gang))
			return false;
		if (isMale != other.isMale)
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
		return true;
	}
    
    

}
