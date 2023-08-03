package casting.app;

public class BrowserUtil extends Browser {
	public void browserUtil(Browser browser) {
		
		Browser browser2 = new Browser();
		browser2.browser();

		if(browser instanceof Chrome) {
			Browser browser3 = new Chrome();
//			browser3.browser();

			Chrome chrome = (Chrome)browser3;
			chrome.chrome();
		}

		if(browser instanceof fireFox) {
			Browser browser4 = new fireFox();
			fireFox firefox = (fireFox)browser4;
			firefox.fireFox();
		}
	}

}
