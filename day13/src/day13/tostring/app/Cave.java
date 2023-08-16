package day13.tostring.app;

public class Cave {
	private String name;
	private String color;
	private String place;
	private int size;
	private int lenght;
	private String shape;
	private int noOfPeoples;
	
	
	public Cave() {
		super();
	}


	public Cave(String name, String color, String place, int size, int lenght, String shape, int noOfPeoples) {
		super();
		this.name = name;
		this.color = color;
		this.place = place;
		this.size = size;
		this.lenght = lenght;
		this.shape = shape;
		this.noOfPeoples = noOfPeoples;
	}


	@Override
	public String toString() {
		return "Cave [name=" + name + ", color=" + color + ", place=" + place + ", size=" + size + ", lenght=" + lenght
				+ ", shape=" + shape + ", noOfPeoples=" + noOfPeoples + "]";
	}
	
	
		
	

}
