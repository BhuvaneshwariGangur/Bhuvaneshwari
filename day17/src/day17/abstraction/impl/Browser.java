package day17.abstraction.impl;

import day17.abstraction.rules.Internet;

public class Browser {
	
		private Internet internet;

		public void connect() {
			System.out.println("Calling connect method from Browser Class");
			this.internet.connect();
		}

		public void setInternet(Internet internet) {
			this.internet = internet;
		}
}


