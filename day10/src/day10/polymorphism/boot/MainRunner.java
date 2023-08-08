package day10.polymorphism.boot;



import day10.polymorphism.app.*;

public class MainRunner {
	
	public static void main(String[] args) {
		Coal coal=new Charcoal();
		coal.burns();//Call Method of sub Class
		
		System.out.println("***************************");
		
		Amoeba amoeba=new BrainEatAmeoba();
		amoeba.movement();
		
		System.out.println("******************************");
		
		Bangle bangle=new MetalBangle();
		bangle.polish();
		
		System.out.println("**************************");
		
		MetalGate gate=new MetalGate();
		gate.open();
		
		System.out.println("*****************************");
		
		Dinosur dinosur=new Onithopods();
		dinosur.roar();
		
		System.out.println("*****************************");
		
		PoleFlex flex=new PoleFlex();
		flex.display();
		
		System.out.println("****************************");
		
		BassDrum drum=new BassDrum();
		drum.vibrate();
		
		System.out.println("********************************");
		
		PVRGold pvr=new PVRGold();
		pvr.show();
		
		System.out.println("**********************************");
		
		ReservationTicket ticket=new ReservationTicket();
		ticket.displayBill();
		
		System.out.println("*****************************");
		
		Mic mic=new Speaker();
		mic.sound();

}
}
