package es.dual.selen.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainChrome {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.get("http://www.google.com");

		driver.get("https://www.primefaces.org/ultima/");
		driver.findElement(By.id("menuform:um_components")).click();
		driver.findElement(By.id("menuform:um_messages")).click();
		driver.findElement(By.id("j_idt51:j_idt55")).click();
		driver.findElement(By.id("j_idt51:default")).sendKeys("A");
		driver.findElement(By.id("j_idt51:txt")).sendKeys("A");
		driver.findElement(By.id("j_idt51:icon")).sendKeys("A");
		driver.findElement(By.id("j_idt51:inline")).sendKeys("A");
		driver.findElement(By.id("j_idt51:mtext")).click();
		driver.findElement(By.id("j_idt51:mtext_1")).click();
		driver.findElement(By.id("j_idt51:micon")).sendKeys("A");
		driver.findElement(By.id("j_idt51:submitButton")).click();
	}
}
