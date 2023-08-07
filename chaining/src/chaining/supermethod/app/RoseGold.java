package chaining.supermethod.app;

public class RoseGold extends Gold {
	public RoseGold() {
		super("24k", 10.0, 99.9, "AU1234");
		System.out.println("invoking no-arg Const. of RoseGold");
	}

	public RoseGold(String name, double weightInGrams, double purityPercentage, String hallmark) {
		super(name, weightInGrams, purityPercentage, hallmark);
		System.out.println("invoking String,double,double,String Cpnst. of RoseGold");
	}

}
