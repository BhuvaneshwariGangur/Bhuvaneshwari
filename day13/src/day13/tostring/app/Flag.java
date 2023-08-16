package day13.tostring.app;

public class Flag {
	private String name;
	private int price;
	private int colors;
	
	public Flag() {
		super();
	}

	public Flag(String name, int price, int colors) {
		super();
		this.name = name;
		this.price = price;
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "Flag [name=" + name + ", price=" + price + ", colors=" + colors + "]";
	}
	
	

}
