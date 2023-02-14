package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import FrameWork.Brownser.Waits;

public class CheckoutOverview {
	private WebDriver driver;
	private Waits wait;
	
	public CheckoutOverview(WebDriver driver) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public WebElement getBotaoCancelar() {
		return driver.findElement(By.id("cancel"));
	}
	
	public WebElement getBotaoFinish() {
		return driver.findElement(By.xpath("//div[@id='root']//button[@id='finish']"));
	}
	
	public WebElement getTitulo() {
		return wait.visibilityOfElement(By.xpath("//div[@id='root']//span[@class='title']"));
	}

}
