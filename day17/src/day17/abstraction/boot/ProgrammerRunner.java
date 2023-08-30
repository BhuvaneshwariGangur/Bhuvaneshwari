package day17.abstraction.boot;

import day17.abstraction.impl.OS;
import day17.abstraction.impl.Programmer;
import day17.abstraction.rules.Computer;

public class ProgrammerRunner {
	public static void main(String[] args) {
		Computer computer=new OS();

		Programmer programmer=new Programmer();
		programmer.setComputer(computer);
		programmer.operate();

	}

}
