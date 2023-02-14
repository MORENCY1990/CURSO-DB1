package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import FrameWork.Brownser.Waits;

public class CheckoutPage {
	
	private WebDriver driver;
	private Waits wait;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new Waits(this.driver);
	
	}
	
	public WebElement getFirstName() {
		return driver.findElement(By.id("first-name"));
	}
	
	public WebElement getLastName() {
		return driver.findElement(By.id("last-name"));
	}
	
	public WebElement getPostalCode() {
		return driver.findElement(By.id("postal-code"));
		
	}
	
	 public WebElement getContinueButton() {
		   
		   return driver.findElement(By.xpath("//input[@id='continue']"));
	   }
	
	public WebElement getTitle() {
		return wait.visibilityOfElement(By.xpath("//div[@id='root']//div[@class='header_secondary_container']/span[@class='title']"));
	}

}
