package casting.boot;

import casting.app.CaramelChacolate;
import casting.app.Chacolate;
import casting.app.ChacolateUtil;
import casting.app.DarkChacolate;

public class ChacolateRunner { 
	public static void main(String[] args) {
		ChacolateUtil chacolateUtil = new ChacolateUtil();

		Chacolate chacolate = new Chacolate();
		System.out.println(chacolate.chacolateName);
		chacolateUtil.chacolateUtilMethod(chacolate);

		DarkChacolate darkChacolate = new DarkChacolate();
		System.out.println(darkChacolate.darkChacolateMinerals);
		chacolateUtil.chacolateUtilMethod(darkChacolate);

		CaramelChacolate caramelChacolate = new CaramelChacolate();
		System.out.println(caramelChacolate.mixedWith);
		chacolateUtil.chacolateUtilMethod(caramelChacolate);

	}


}
