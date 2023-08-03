package casting.boot;

import casting.app.Browser;
import casting.app.BrowserUtil;
import casting.app.Chrome;
import casting.app.fireFox;

public class BrowserRunner {

	public static void main(String[] args) {
		
		Browser browser = new Browser();
		System.out.println(browser.browserUsedFor);

		Chrome chrome = new Chrome();
		System.out.println(chrome.chromeVersion);

		fireFox firefox = new fireFox();
		System.out.println(firefox.fireFoxVersion);

		BrowserUtil browserUtil = new BrowserUtil();
		browserUtil.browserUtil(browser);
		browserUtil.browserUtil(chrome);
		browserUtil.browserUtil(firefox);

	}

}
