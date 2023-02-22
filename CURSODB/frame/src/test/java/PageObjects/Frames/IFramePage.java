package PageObjects.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.JavaScriptExecutor;
import Framework.Browser.Waits;

public class IFramePage {
	private WebDriver driver;
	private Waits wait;
	private JavaScriptExecutor js = new JavaScriptExecutor();
	
	public IFramePage(WebDriver driver) {
		this.driver = driver;
		wait = new Waits(this.driver);
	}
	
	public WebElement getIFrameTitle() {
		WebElement getIFrameTitle = wait.visibilityOfElement(By.xpath("//body/div[@class='page-body']/h1"));
		js.highLight(driver, getIFrameTitle);
		return getIFrameTitle;
	}
	
	public WebElement getIFrameList() {
		driver.switchTo().frame("thedynamichtml");
		WebElement getIFrameList = wait.visibilityOfElement(By.id("iframe2"));
		js.highLight(driver, getIFrameList);
		return getIFrameList;
	}
	
	public WebElement getIFrameText() {
		driver.switchTo().frame("theheaderhtml");
		WebElement getIFrameText = wait.visibilityOfElement(By.xpath("//body/div[@class='page-body']/div[@class='explanation']/p"));
		js.highLight(driver, getIFrameText);
		return getIFrameText;
		
	}
	
	public WebElement getIFrameLink() {
		WebElement getIframeLink = wait.visibilityOfElement(By.xpath("//body/div[@class='page-body']/div[@class='page-navigation']/a"));
		js.highLight(driver, getIframeLink);
		return getIframeLink;
	}
}
