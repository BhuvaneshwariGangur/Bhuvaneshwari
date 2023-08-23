package implementation.boot;

import implementation.app.EngEngineeringRules;
import implentation.impl.EngineeringRules;

public class EngineeringRunner {

	public static void main(String[] args) {
		EngineeringRules engineeringRules=new EngEngineeringRules();
		System.out.println("Wear Id : "+engineeringRules.wearId());
		engineeringRules.attendence();
		System.out.println("FEE : "+engineeringRules.fee());

	}

	}


