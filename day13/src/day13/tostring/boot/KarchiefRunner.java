package day13.tostring.boot;

import day13.tostring.app.Karchief;

public class KarchiefRunner {

	public static void main(String[] args) {
		
		Karchief karchief=new Karchief();
		System.out.println("karchief");
		
		Karchief karchief2=new Karchief("khadi", "khadi bandara", true, "gray", 25, "square", 'L');
System.out.println(karchief2);

      Karchief karchief3=new Karchief("cotton", null, false, null, 550, null, 'M');
      System.out.println(karchief3);
      
      Karchief karchief4=new Karchief(null, null, true, null, 550, null, 'S');
      System.out.println(karchief4);
      
      Karchief karchief5=new Karchief(null, "ajio", false, null, 560, null, 'X');
      System.out.println(karchief5);
      
      Karchief karchief6=new Karchief(null, null, true, null, 450, null, 'M');
      System.out.println(karchief6);
      
      Karchief karchief7=new Karchief(null, "myntra", false, null, 850, null, 'M');
      System.out.println(karchief7);
	}

}
