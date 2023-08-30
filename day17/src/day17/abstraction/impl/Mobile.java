package day17.abstraction.impl;

import day17.abstraction.rules.Bluetooth;

public class Mobile implements Bluetooth{
	public void wirelessConnect() {
		System.out.println("Calling method in Mobile Class (IMplementation)");
	}

}
