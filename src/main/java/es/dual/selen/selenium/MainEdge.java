package es.dual.selen.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MainEdge {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.es");
		driver.findElement(By.id("lst-ib")).sendKeys("Lista convocados seleccion española mundial 2018 rtve");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.id("resultStats")).getText());
		driver.findElement(By.partialLinkText("Mundial 2018 | Selección española - RTVE")).sendKeys(Keys.ENTER);
	}
}
