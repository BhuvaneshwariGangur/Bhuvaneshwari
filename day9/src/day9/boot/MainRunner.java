package day9.boot;

import day9.app.Elevator;
import day9.app.Gadget;
import day9.app.Hotel;
import day9.app.IronBox;
import day9.app.Ladder;
import day9.app.Mouse;
import day9.app.Plier;
import day9.app.Specs;
import day9.app.Stapler;
import day9.app.Umbrella;

public class MainRunner {

	public static void main(String[] args) {
		
		System.out.println("Calling Main...........");

		Hotel hotel = new Hotel();
		hotel.management();

		System.out.println("------------------------------------");

		IronBox box=new IronBox();
		box.smoothsCloth(89);

		System.out.println("------------------------------------");

		Specs specs=new Specs();
		specs.protects(3);

		System.out.println("------------------------------------");

		Umbrella umbrella=new Umbrella();
		umbrella.protects("Sun", "WineRed");

		System.out.println("------------------------------------");

		Stapler stapler=new Stapler();
		stapler.steples();

		System.out.println("------------------------------------");

		Ladder ladder=new Ladder();
		ladder.ladderTypes();

		System.out.println("------------------------------------");

		Gadget gadget=new Gadget();
		gadget.run("CAR");

		System.out.println("------------------------------------");

		Plier plier=new Plier();
		plier.cuts();

		System.out.println("------------------------------------");

		Mouse mouse=new Mouse();
		mouse.mouse();

		System.out.println("------------------------------------");

		Elevator elevator=new Elevator();
		elevator.movement(10);
	}

	}


