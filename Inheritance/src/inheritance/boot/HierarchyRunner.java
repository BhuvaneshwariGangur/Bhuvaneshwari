package inheritance.boot;

import inheritance.app.EightLevel;
import inheritance.app.FifthLevel;
import inheritance.app.FourthLevel;
import inheritance.app.Hierarchy;
import inheritance.app.SeventhLevel;
import inheritance.app.SingleLevel;
import inheritance.app.SixthLevel;
import inheritance.app.ThirdLevel;
import inheritance.app.TwoLevel;

public class HierarchyRunner {

	public static void main(String[] args) {
		
		System.out.println("invoke main in the HierarchyRunner");
		Hierarchy hierarchy=new Hierarchy();
		hierarchy.Tree("mango");
		Hierarchy hierarchy1=new SingleLevel();
		hierarchy1.Seed("duration");
		Hierarchy hierarchy2=new TwoLevel();
		hierarchy2.Root("Plant base");
		Hierarchy hierarchy3=new ThirdLevel();
		hierarchy3.Stem("Main part of plant");
		Hierarchy hierarchy4=new FourthLevel();
		hierarchy4.Leaf("green leaf");
		Hierarchy hierarchy5=new FifthLevel();
		hierarchy5.Flower("stage of fruit");
		Hierarchy hierarchy6=new SixthLevel();
		hierarchy6.Fruit("Mango fruit");
		Hierarchy hierarchy7=new SeventhLevel();
		hierarchy7.Soil("help for plant growing");
		Hierarchy hierarchy8=new EightLevel();
		hierarchy8.Juice("mango juice");

	}

}
