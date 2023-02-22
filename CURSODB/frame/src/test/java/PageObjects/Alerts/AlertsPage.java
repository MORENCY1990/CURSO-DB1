package PageObjects.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.JavaScriptExecutor;
import Framework.Browser.Waits;

public class AlertsPage {
	private WebDriver driver;
	private Waits wait;
	private JavaScriptExecutor js = new JavaScriptExecutor();
	
	
	public AlertsPage(WebDriver driver) {
		this.driver = driver;
		wait = new Waits(this.driver);
	}
	
	public WebElement getAlertButton() {
		WebElement getAlertButton = wait.visibilityOfElement(By.xpath("//div[@id='content']/div[@class='example']//ul/li/button[@onclick='jsAlert()']"));
		js.highLight(driver, getAlertButton);
		return getAlertButton;
	}
	
	public WebElement getConfirmButton() {
		WebElement getConfirmButton = wait.visibilityOfElement(By.xpath("//div[@id='content']/div[@class='example']//ul/li/button[@onclick='jsConfirm()']"));
		js.highLight(driver, getConfirmButton);
		return getConfirmButton;
	}
	
	public WebElement getPromptButton() {
		WebElement getPromptButton = wait.visibilityOfElement(By.xpath("//div[@id='content']/div[@class='example']//ul/li/button[@onclick='jsPrompt()']"));
		js.highLight(driver, getPromptButton);
		return getPromptButton;
	}
	
	public WebElement getResultText() {
		WebElement getResultText = wait.visibilityOfElement(By.xpath("//div[@id='content']/div[@class='example']/p[@id='result']"));
		js.highLight(driver, getResultText);
		return getResultText;
	}
	
	public Alert getAlert() {
		return driver.switchTo().alert();
	}
}
