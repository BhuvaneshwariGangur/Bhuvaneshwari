package day16.association.boot;

import day16.association.app.LaptopProcessor;
import day16.association.app.Processor;

public class LaptopRunner {
	public static void main(String[] args) {
		String brand="Lenovo";
		Processor processor=new Processor();

		LaptopProcessor laptopProcessor=new LaptopProcessor(brand);

		laptopProcessor.setProcessor(processor);

		laptopProcessor.proceesorType("Intel5");
		laptopProcessor.generation("4G");
		laptopProcessor.ram(16);
		laptopProcessor.compute();
	}

}
