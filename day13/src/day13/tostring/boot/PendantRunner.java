package day13.tostring.boot;

import day13.tostring.app.Pendant;

public class PendantRunner {

	public static void main(String[] args) {
		
		
		Pendant pendant = new Pendant();
		System.out.println("pendant");
		
		Pendant pendant2=new Pendant("pendant", "good", "silver", 450, "festival","round", 60, 'L', "round", "unique");
        System.out.println(pendant2);
        
        Pendant pendant3=new Pendant("pendant", "good", "silver", 450, "festival","round", 69, 'L', "round", "unique");
        System.out.println(pendant3);
        
        Pendant pendant4=new Pendant("pendant", " very good", "silver", 550, "festival","round", 60, 'S', "round", "unique");
        System.out.println(pendant4);
        
        Pendant pendant5=new Pendant("pendant", "good", "good", 350, "festival","round", 45, 'L', "round", "special");
        System.out.println(pendant5);
        
        Pendant pendant6=new Pendant("pendant", "good", "aluminium", 450, "festival","round", 60, 'L', "round", "normal");
        System.out.println(pendant6);
        
        Pendant pendant7=new Pendant("pendant", "avearge", "silver", 450, "festival","round", 70, 'L', "round", "unique");
        System.out.println(pendant7);
        
        Pendant pendant8=new Pendant("pendant", "good", "gold", 750, "festival","round", 60, 'S', "round", "unique");
        System.out.println(pendant8);
        
        Pendant pendant9=new Pendant("pendant", "bad", "silver", 480, "festival","round", 60, 'L', "round", "unique");
        System.out.println(pendant9);
        
        Pendant pendant10=new Pendant("pendant", "good", "gold", 950, "function","square", 40, 'L', "round", "unique");
        System.out.println(pendant10);
        
        Pendant pendant11=new Pendant("pendant", "avearage", "silver", 450, "festival","round", 76, 'M', "round", "unique");
        System.out.println(pendant11);
        
        Pendant pendant12=new Pendant("pendant", "not bad", "silver", 490, "festival","round", 66, 'L', "round", "unique");
        System.out.println(pendant12);
        
        
        
	}
	
	
	

}
