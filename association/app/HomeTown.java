package association.app;

public class HomeTown {
	public String name;
	public int pinCode;
	public Area[] area;
	
	public HomeTown(String name,int pinCode,Area[] area) {
		this.name=name;
		this.pinCode=pinCode;
		this.area=area;
	}
	public void printInfo() {
		System.out.println("invoking info hometown");
		System.out.println("building name is:"+this.name);
		System.out.println("pincode:"+this.pinCode);
		System.out.println("areas are:");
		
	
		for(int home=0;home<area.length; home++) {
			Area ref=area[home];
			ref.printInfo();
			
		}
	}

}
