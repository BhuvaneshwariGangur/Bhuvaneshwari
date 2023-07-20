class Park{
	String name;
	int noOfPeoples;
	String area;
	String place;
	int items;
	int size;
	double price;
	String timing;
	String type;
	
	Park()
	{
		super();
		System.out.println("invoking no-arg in park");
	}
	
	Park(String name){
		this();
		this.name=name;
		System.out.println("invoking String in park");
	}
	
	Park(String name,int noOfPeoples){
		this(name);
		this.noOfPeoples=noOfPeoples;
		System.out.println("invoking String, int in park");
	}
	
	
	Park(String name,int noOfPeoples,String area){
     this(name,noOfPeoples);
	 this.area=area;
	 System.out.println("invoking String ,int, String in park");
	}
	Park(String name,int noOfPeoples,String area,String place){
     this(name,noOfPeoples,area);
	 this.place=place;
	 System.out.println("invoking String, int ,String, int, String in park");
	 }
	Park(String name,int noOfPeoples,String area,String place,int items){
     this(name,noOfPeoples,area,place);
	 this.items=items;
	 System.out.println("invoking String ,int, String ,int, String, int , in park");
	 }
	 
	 Park(String name,int noOfPeoples,String area,String place,int items,int size){
     this(name,noOfPeoples,area,place,items);
	 this.size=size;
	 System.out.println("invoking String, int, String, int, String, int, int, park");
	 }
	 Park(String name,int noOfPeoples,String area,String place,int items,int size,double price){
     this(name,noOfPeoples,area,place,items,size);
	 this.price=price;
	 System.out.println("invoking String, int, String, int, String, int, int, double in park");
	 }
	 
	 Park(String name,int noOfPeoples,String area,String place,int items,int size,double price,String timing){
     this(name,noOfPeoples,area,place,items,size,price);
	 this.timing=timing;
	 System.out.println("invoking String ,int, String, int ,String, int, int, double  ,String in park");
	 }
	Park(String name,int noOfPeoples,String area,String place,int items,int size,double price,String timing,String type){
     this(name,noOfPeoples,area,place,items,size,price,timing);
	 this.type=type;
	 System.out.println("invoking String ,int, String ,int, String, int ,int ,double,String ,String in park ");
	 }
}
	 