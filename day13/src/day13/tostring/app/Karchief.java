package day13.tostring.app;

public class Karchief {
	private String name;
	private String companyName;
	private boolean quality;
	private String color;
	private int price;
	private String shape;
	private char size;
	
	
	public Karchief() {
		super();
	}


	public Karchief(String name, String companyName, boolean quality, String color, int price, String shape,
			char size) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.quality = quality;
		this.color = color;
		this.price = price;
		this.shape = shape;
		this.size = size;
	}


	@Override
	public String toString() {
		return "Karchief [name=" + name + ", companyName=" + companyName + ", quality=" + quality + ", color=" + color
				+ ", price=" + price + ", shape=" + shape + ", size=" + size + "]";
	}
	
	
	

}
