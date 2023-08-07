package chaining.supermethod.boot;

import chaining.supermethod.app.EdgeRouter;

public class RouterRunner {
	
public static void main(String[] args) {
		
		
		System.out.println("invoking main in Router");

		EdgeRouter edgerouter = new EdgeRouter();
		System.out.println(edgerouter.type);
		System.out.println(edgerouter.network);
		System.out.println(edgerouter.use);
		System.out.println(edgerouter.price);

		System.out.println("************************");

		EdgeRouter edgerouter1 = new EdgeRouter("wired","local","sends data",300000);
		System.out.println(edgerouter1.type);
		System.out.println(edgerouter1.network);
		System.out.println(edgerouter1.use);
		System.out.println(edgerouter1.price);


	}


}
