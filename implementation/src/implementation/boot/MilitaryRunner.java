package implementation.boot;

import implementation.app.MilitaryMilitaryRules;
import implentation.impl.MilitaryRules;

public class MilitaryRunner {

	public static void main(String[] args) {
		MilitaryMilitaryRules militaryRules=new MilitaryMilitaryRules();
		System.out.println("Wear Uniform : "+militaryRules.wearUniform());
		System.out.println("UNIT NUMBER : "+militaryRules.unitNumber());
		System.out.println("Service : "+militaryRules.service());
		}

	}


