class Mall{
	String name;
	int noOfShops;
	String location;
	int noOfFloors;
	int noOfParkings;
	String shopName;
	String type;
	
	Mall(){
		super();
		System.out.println("invoking no-arg constructor of mall");
	}
	
	Mall(String name){
		this();
		this.name=name;

		System.out.println("invoking String  constructor of mall");
	}
	
	Mall(String name,int noOfShops){
		this(name);
		this.noOfShops=noOfShops;
		System.out.println("invoking String ,int of  constructor of mall");
		
	}
	
	Mall(String name,int noOfShops,String location){
		this(name,noOfShops);
		this.location=location;
		System.out.println("invoking String ,int,String of  constructor of mall");
		
	}
	
	Mall(String name,int noOfShops,String location,int noOfFloors){
		this(name,noOfShops,location);
		this.noOfFloors=noOfFloors;
		System.out.println("invoking String ,int,String,int of  constructor of mall");
		
	}
	
		Mall(String name,int noOfShops,String location,int noOfFloors,int noOfParkings){
		this(name,noOfShops,location,noOfFloors);
		this.noOfParkings=noOfParkings;
		System.out.println("invoking String ,int,String,int,int of  constructor of mall");

	}
	
	Mall(String name,int noOfShops,String location,int noOfFloors,int noOfParkings,String shopName){
		this(name,noOfShops,location,noOfFloors,noOfParkings);
		this.shopName=shopName;
		System.out.println("invoking String ,int,String,int,int,String of constructor of mall");
		
	}
	
	Mall(String name,int noOfShops,String location,int noOfFloors,int noOfParkings,String shopName,String type){
		this(name,noOfShops,location,noOfFloors,noOfParkings,shopName);
		this.type=type;
		System.out.println("invoking String ,int,String,int,int,String,String of constructor of mall");
		
	}
}