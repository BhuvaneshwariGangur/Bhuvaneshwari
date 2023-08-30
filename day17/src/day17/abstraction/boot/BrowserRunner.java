package day17.abstraction.boot;

import day17.abstraction.impl.Browser;
import day17.abstraction.impl.InternetImpl;
import day17.abstraction.rules.Internet;

public class BrowserRunner {

	public static void main(String[] args) {
		Internet internet = new InternetImpl();

		Browser browser = new Browser();
		browser.setInternet(internet);
		browser.connect();
	}

}
