package chaining.supermethod.boot;

import chaining.supermethod.app.RoseGold;

public class GoldRunner {

	public static void main(String[] args) {
		
		
			System.out.println("invoking main in GoldRunner");

			RoseGold roseGold = new RoseGold();
			System.out.println(roseGold.name);
			System.out.println(roseGold.purityPercentage);
			System.out.println(roseGold.weightInGrams);
			System.out.println(roseGold.hallmark);

			System.out.println("*******");

			RoseGold roseGold1 = new RoseGold("18k",5.6,75.0,"GOLD456");
			System.out.println(roseGold1.name);
			System.out.println(roseGold1.purityPercentage);
			System.out.println(roseGold1.weightInGrams);
			System.out.println(roseGold1.hallmark);

		}

	}


