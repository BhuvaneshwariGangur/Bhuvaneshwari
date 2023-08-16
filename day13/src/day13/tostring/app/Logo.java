package day13.tostring.app;

public class Logo {
	private String name;
	private String color;
	private int price;
	private boolean quality;
	private String type;


	

	public Logo(String name, String color, int price, boolean quality, String type) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.quality = quality;
		this.type = type;
	}




	public Logo() {
		super();
	}




	@Override
	public String toString() {
		return "Logo [name=" + name + ", color=" + color + ", price=" + price + ", quality=" + quality + ", type="
				+ type + "]";
	}




	




	
	

}
