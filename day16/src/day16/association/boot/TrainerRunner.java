package day16.association.boot;

import day16.association.app.Laptop;
import day16.association.app.Trainer;

public class TrainerRunner {
	public static void main(String[] args) {
		String trainerName = "Omkar";

		Laptop laptop = new Laptop();

		Trainer trainer = new Trainer(trainerName);
		trainer.setLaptop(laptop);
		trainer.teach();

	}

}
