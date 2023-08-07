package chaining.supermethod.app;

public class Diamond {
	public String name;
	public int types;
	public String shape;
	public String quality;

	public Diamond(String name, int types, String shape, String quality) {
		System.out.println("invoking String,double,double,String Cpnst. of Diamond");
		this.name = name;
		this.types = types;
		this.shape = shape;
		this.quality = quality;
	}

}
