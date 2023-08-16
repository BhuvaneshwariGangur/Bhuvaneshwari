package day13.tostring.app;

public class Pendant {
	
	private String name;
	private String quality;
	private String color;
	private int price;
	private String type;
	private String shape;
	private int size;
	private char lenght;
	private String pendentShape;
	private String design;
	
	
	public Pendant() {
		super();
	}


	public Pendant(String name, String quality, String color, int price, String type, String shape, int size,
			char lenght, String pendentShape, String design) {
		super();
		this.name = name;
		this.quality = quality;
		this.color = color;
		this.price = price;
		this.type = type;
		this.shape = shape;
		this.size = size;
		this.lenght = lenght;
		this.pendentShape = pendentShape;
		this.design = design;
	}


	@Override
	public String toString() {
		return "Pendant [name=" + name + ", quality=" + quality + ", color=" + color + ", price=" + price + ", type="
				+ type + ", shape=" + shape + ", size=" + size + ", lenght=" + lenght + ", pendentShape=" + pendentShape
				+ ", design=" + design + "]";
	}
	
	

}
