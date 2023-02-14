package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import FrameWork.Brownser.Waits;

public class CheckoutComplete {
	private WebDriver driver;
	private Waits wait;
	
	public CheckoutComplete(WebDriver driver) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public WebElement getBackHome() {
		return driver.findElement(By.xpath("//button[@name='finish']"));
	}
	public WebElement getTitulo1() {
		return wait.visibilityOfElement(By.xpath("//div[@id='root']//span[@class='title']"));
	}
}
