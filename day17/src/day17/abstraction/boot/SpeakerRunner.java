package day17.abstraction.boot;

import day17.abstraction.impl.Mobile;
import day17.abstraction.impl.Speaker;
import day17.abstraction.rules.Bluetooth;

public class SpeakerRunner {
	public static void main(String[] args) {
		Bluetooth bluetooth=new Mobile();

		Speaker speaker=new Speaker();
		speaker.setBluetooth(bluetooth);
		speaker.wirelessConnect();


	}

}
