package day13.tostring.boot;

import day13.tostring.app.Logo;

public class LogoRunner  {

	public static void main(String[] args) {
		
		Logo logo= new Logo();
		
		System.out.println("logo");
		
		Logo logo2=new Logo(null, "red", 650, true, null);
		System.out.println(logo2);
		
		Logo logo3=new Logo("xworkz", "orange", 950, false, "business");
		System.out.println(logo3);
		

	}

}
