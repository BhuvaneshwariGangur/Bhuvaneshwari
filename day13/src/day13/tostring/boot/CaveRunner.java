package day13.tostring.boot;

import day13.tostring.app.Cave;

public class CaveRunner {

	public static void main(String[] args) {
		
		
		Cave cave = new Cave();
		System.out.println("cave");
		
		Cave cave2=new Cave(null, "meroon", "mysore", 4, 50, null, 7);
		System.out.println(cave2);

		
		Cave cave3=new Cave(null, "meroon", "mysore", 6, 54, null, 7);
		System.out.println(cave3);
		
		Cave cave4=new Cave(null, "white", "manipura", 7, 50, null, 7);
		System.out.println(cave4);
		
		Cave cave5=new Cave(null, "light white", "africa", 10, 67, null, 7);
		System.out.println(cave5);
		
		Cave cave6=new Cave(null, "cement color", "bandipura", 11, 50, null, 7);
		System.out.println(cave6);
		
		Cave cave7=new Cave(null, "meroon", "mysore", 12, 60, null, 7);
		System.out.println(cave7);
		
		
	}

}
