package day13.tostring.boot;

import day13.tostring.app.Flag;

public class FlagRunner {

	public static void main(String[] args) {
		
		Flag flag=new Flag();
		System.out.println("flag");
		
		Flag flag2=new Flag("tiranga", 350, 3);
		System.out.println(flag2);
		
		Flag flag3=new Flag("tiranga", 450, 3);
		System.out.println(flag3);

	}

}
