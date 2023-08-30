package day17.abstraction.boot;

import day17.abstraction.impl.Receiver;
import day17.abstraction.impl.Sender;
import day17.abstraction.rules.Messanger;

public class ReceiverRunner {
	public static void main(String[] args) {
		Messanger messenger=new Sender();

		Receiver reciever=new Receiver();
		reciever.setMessenger(messenger);
		reciever.send();

	}

}
