package es.dual.selen.selenium;

import java.io.IOException;

import org.openqa.selenium.By;

public class MainFirefox {

	public static void main(String[] args) throws IOException {

		DriverSeleniumFirefox driver = new DriverSeleniumFirefox();

		// driver.getDriver().get("https://www.google.es");
		// driver.getDriver().findElement(By.id("lst-ib")).sendKeys("Lista convocados
		// seleccion española mundial 2018 rtve");
		// driver.getDriver().findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		// System.out.println(driver.getDriver().findElement(By.id("resultStats")).getText());
		// driver.getDriver().findElement(By.partialLinkText("Mundial 2018 | Selección
		// española - RTVE")).sendKeys(Keys.ENTER);

		// driver.getDriver().get("https://www.google.es");
		// driver.getDriver().findElement(By.id("lst-ib")).sendKeys("primeface
		// showcase");
		// driver.getDriver().findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		// driver.getDriver().findElement(By.linkText("PrimeFaces ShowCase")).click();

		// driver.getDriver().get("https://www.google.es");
		// driver.getDriver().findElement(By.id("lst-ib")).sendKeys("primefaces
		// ultima");
		// driver.getDriver().findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		// driver.getDriver().findElement(By.linkText("PrimeFaces Ultima")).click();

		// driver.getDriver().get("https://www.primefaces.org/ultima/");
		// driver.getDriver().findElement(By.id("menuform:um_components")).click();
		// driver.getDriver().findElement(By.id("menuform:um_messages")).click();
		// driver.getDriver().findElement(By.id("j_idt51:j_idt55")).click();
		// driver.getDriver().findElement(By.id("j_idt51:default")).sendKeys("A");
		// driver.getDriver().findElement(By.id("j_idt51:txt")).sendKeys("A");
		// driver.getDriver().findElement(By.id("j_idt51:icon")).sendKeys("A");
		// driver.getDriver().findElement(By.id("j_idt51:inline")).sendKeys("A");
		// driver.getDriver().findElement(By.id("j_idt51:mtext")).click();
		// driver.getDriver().findElement(By.id("j_idt51:mtext_1")).click();
		// driver.getDriver().findElement(By.id("j_idt51:micon")).sendKeys("A");
		// driver.getDriver().findElement(By.id("j_idt51:submitButton")).click();

		driver.getDriver().get("https://www.eltiempo.es/ecija.html");
		driver.getDriver().findElement(By.id("inputSearch")).sendKeys("Écija");
		driver.getDriver()
				.findElement(By.xpath(
						"//div[@id='page']/main/div[4]/div/section[3]/section/div/article/div/div[2]/div[3]/div[4]/i"))
				.click();
		System.out.println(driver.getDriver()
				.findElement(By.cssSelector(
						"div.table_tooltip.table_tooltip_city > div.table_tooltip_wrapper > p.table_tooltip_title"))
				.getText() + "\n" + driver.getDriver().findElement(By.cssSelector("p.table_tooltip_forecast")).getText()
				+ "\n" + driver.getDriver().findElement(By.cssSelector("p.table_tooltip_feels_like")).getText() + "\n"
				+ driver.getDriver().findElement(By.cssSelector("p.table_tooltip_prob_rain")).getText() + "\n"
				+ driver.getDriver().findElement(By.cssSelector("span.table_tooltip_temp_c")).getText() + "\n"
				+ driver.getDriver().findElement(By.cssSelector("span.table_tooltip_wind_speed")).getText());

		driver.cerrarProceso();
	}
}
