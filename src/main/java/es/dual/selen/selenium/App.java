package es.dual.selen.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class App {

	public static void main(String[] args) throws IOException {

		DriverSeleniumFirefox driver = new DriverSeleniumFirefox();
		
		// driver.getDriver().get("https://www.google.es");
		// driver.getDriver().findElement(By.id("lst-ib")).sendKeys("Lista convocados seleccion española mundial 2018 rtve");
		// driver.getDriver().findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		// System.out.println(driver.getDriver().findElement(By.id("resultStats")).getText());
		// driver.getDriver().findElement(By.partialLinkText("Mundial 2018 | Selección española - RTVE")).sendKeys(Keys.ENTER);
		
		// driver.getDriver().get("https://www.google.es");
		// driver.getDriver().findElement(By.id("lst-ib")).sendKeys("primeface showcase");
		// driver.getDriver().findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		// driver.getDriver().findElement(By.linkText("PrimeFaces ShowCase")).click();
		
		// driver.getDriver().get("https://www.google.es");
		// driver.getDriver().findElement(By.id("lst-ib")).sendKeys("primefaces ultima");
		// driver.getDriver().findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		// driver.getDriver().findElement(By.linkText("PrimeFaces Ultima")).click();
		
		driver.getDriver().get("https://www.primefaces.org/ultima/");
		driver.getDriver().findElement(By.linkText("PrimeFaces Ultima")).click();
		driver.getDriver().findElement(By.id("menuform:um_components")).click();
		
		driver.cerrarProceso();
	}
}
