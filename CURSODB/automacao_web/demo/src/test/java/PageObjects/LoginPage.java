package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getUserNameInput() {
		
		/*WebElement username = driver.findElement(By.id("user-name"));
		return username;*/      //ESTA É UMA FORMA DE FAZER
	
		return driver.findElement(By.id("user-name"));    //OUTRA FORMA DE FAZER
		
	}
	
	
	public WebElement getPasswordInput() {
		
		return driver.findElement(By.id("password"));
		
	}
	
	
	public WebElement getLoginButton() {
		
		return driver.findElement(By.id("login-button"));
	}
	
	
	public WebElement getTitle() {
		
		return driver.findElement(By.xpath("//div[@id='root']/div/div[@class='login_logo']"));
		
	}
	
	
}
