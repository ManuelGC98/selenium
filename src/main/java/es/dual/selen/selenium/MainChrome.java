package es.dual.selen.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainChrome {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		// driver.get("http://www.google.com");

		driver.get("https://www.eltiempo.es/ecija.html");
		driver.findElement(By.id("inputSearch")).sendKeys("Écija");
		driver.findElement(
				By.xpath("//div[@id='page']/main/div[4]/div/section[4]/section/div/article/div/div[2]/div[4]/div[4]/i"))
				.click();
		System.out.println(driver
				.findElement(By.cssSelector(
						"div.table_tooltip.table_tooltip_city > div.table_tooltip_wrapper > p.table_tooltip_title"))
				.getText() + "\n" + driver.findElement(By.cssSelector("p.table_tooltip_forecast")).getText() + "\n"
				+ driver.findElement(By.cssSelector("p.table_tooltip_feels_like")).getText() + "\n"
				+ driver.findElement(By.cssSelector("p.table_tooltip_prob_rain")).getText() + "\n"
				+ driver.findElement(By.cssSelector("span.table_tooltip_temp_c")).getText() + "\n"
				+ driver.findElement(By.cssSelector("span.table_tooltip_wind_speed")).getText());
	}
}
