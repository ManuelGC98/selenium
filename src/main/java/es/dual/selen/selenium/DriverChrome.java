package es.dual.selen.selenium;

public class DriverChrome extends DriverSelenium {

	public DriverChrome() {

		// Indicamos la ruta del driver que levantara chrome
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	}
}
