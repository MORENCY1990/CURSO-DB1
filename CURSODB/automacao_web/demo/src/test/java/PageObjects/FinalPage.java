package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import FrameWork.Brownser.Waits;

public class FinalPage {
	private WebDriver driver;
	private Waits wait;

	public FinalPage(WebDriver driver) {
		this.driver = driver;
		this.wait = wait;
	}

	public WebElement getBotaoHome() {
		return driver.findElement(
				By.xpath("//div[@id='root']//div[@id='checkout_complete_container']/button[@id='back-to-products']"));
	}
	public WebElement getTitulo2() {
		return driver.findElement(By.xpath("//div[@class='header_secondary_container']/span[@class='title']"));
	}

}
