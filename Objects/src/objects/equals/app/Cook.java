package objects.equals.app;

public class Cook {
	private String name;
    private String specialty;
    private int experienceYears;
    private String cuisine;
    private double salary;
    private boolean isMale;

    public Cook() {

    }

	@Override
	public String toString() {
		return "Cook [name=" + name + ", specialty=" + specialty + ", experienceYears=" + experienceYears + ", cuisine="
				+ cuisine + ", salary=" + salary + ", isMale=" + isMale + "]";
	}

	public Cook(String name, String specialty, int experienceYears, String cuisine, double salary, boolean isMale) {
		super();
		this.name = name;
		this.specialty = specialty;
		this.experienceYears = experienceYears;
		this.cuisine = cuisine;
		this.salary = salary;
		this.isMale = isMale;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cuisine == null) ? 0 : cuisine.hashCode());
		result = prime * result + experienceYears;
		result = prime * result + (isMale ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((specialty == null) ? 0 : specialty.hashCode());
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
		Cook other = (Cook) obj;
		if (cuisine == null) {
			if (other.cuisine != null)
				return false;
		} else if (!cuisine.equals(other.cuisine))
			return false;
		if (experienceYears != other.experienceYears)
			return false;
		if (isMale != other.isMale)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		if (specialty == null) {
			if (other.specialty != null)
				return false;
		} else if (!specialty.equals(other.specialty))
			return false;
		return true;
	}

    

}
