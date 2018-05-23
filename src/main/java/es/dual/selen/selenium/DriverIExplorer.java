package es.dual.selen.selenium;

public class DriverIExplorer extends DriverSelenium {

	public DriverIExplorer() {

		System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");

		driver.manage().window().maximize();
	}
}
