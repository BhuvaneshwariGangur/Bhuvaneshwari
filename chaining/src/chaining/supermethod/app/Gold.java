package chaining.supermethod.app;

public class Gold {
	public String name;
	public double weightInGrams;
	public double purityPercentage;
	public String hallmark;

	public Gold(String name, double weightInGrams, double purityPercentage, String hallmark) {
		System.out.println("invoking String,double,double,String Cpnst. of Gold");
		this.name = name;
		this.weightInGrams = weightInGrams;
		this.purityPercentage = purityPercentage;
		this.hallmark = hallmark;
	}

}
