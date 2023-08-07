package chaining.supermethod.app;

public class NaturalDiamond extends Diamond{
	
	public NaturalDiamond() {
		super("lab grown", 3,"round","good");
		System.out.println("invoking no-arg Const. of Diamond");
	}
	
	public NaturalDiamond(String name, int type, String shape, String quality) {
		super(name, type, shape,quality);
		System.out.println("invoking String,int,String,String Cpnst. of Diamond");
	}

}
