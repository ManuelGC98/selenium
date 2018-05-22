package es.dual.selen.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class App {

	public static void main(String[] args) throws IOException {

		DriverSeleniumFirefox driver = new DriverSeleniumFirefox();
		driver.getDriver().get("https://www.google.es");

		driver.getDriver().findElement(By.id("lst-ib")).sendKeys("Lista convocados seleccion española mundial 2018");
		driver.getDriver().findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		System.out.println(driver.getDriver().findElement(By.id("resultStats")).getText());
		driver.getDriver().findElement(By.className("RTVE")).click();
		
		driver.cerrarProceso();
	}
}
