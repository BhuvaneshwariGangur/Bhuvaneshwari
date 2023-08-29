package day16.association.boot;

import day16.association.app.Paper;
import day16.association.app.Wood;

public class PaperRunner {
	public static void main(String[] args) {

		String type="Color Paper";
		 Wood wood=new Wood();

		 Paper paper=new Paper(type);
		 paper.setWood(wood);
		 paper.write();

	}

}
