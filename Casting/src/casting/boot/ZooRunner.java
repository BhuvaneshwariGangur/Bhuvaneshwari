package casting.boot;

import casting.app.NationalZoo;
import casting.app.StateZoo;
import casting.app.Zoo;
import casting.app.ZooUtil;

public class ZooRunner {
	public static void main(String[] args) {
		ZooUtil util = new ZooUtil();

		Zoo zoo = new Zoo();
		System.out.println(zoo.zooTiming);
		util.zooUtilMethod(zoo);

		StateZoo stateZoo = new StateZoo();
		System.out.println(stateZoo.zooState);
		util.zooUtilMethod(stateZoo);

		NationalZoo nationalZoo = new NationalZoo();
		System.out.println(nationalZoo.nationalLocation);
		util.zooUtilMethod(nationalZoo);
	}

}
