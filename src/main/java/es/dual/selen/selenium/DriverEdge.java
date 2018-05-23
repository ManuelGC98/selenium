package es.dual.selen.selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class DriverEdge extends DriverSelenium {

	public DriverEdge() {

		System.setProperty("webdriver.edge.driver", "C://MicrosoftWebDriver.exe");

		driver = new EdgeDriver();

		driver.manage().window().maximize();
	}
}
