package day17.abstraction.impl;

import day17.abstraction.rules.Messanger;

public class Receiver {
	private Messanger messenger;

	public void send() {
		System.out.println("invoking method in receiver class");
		this.messenger.sendMsg();
	}

	public void setMessenger(Messanger messenger) {
		this.messenger = messenger;
	}
	

}
