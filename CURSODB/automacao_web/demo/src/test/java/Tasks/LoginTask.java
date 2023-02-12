package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;

public class LoginTask {
	
	private WebDriver driver;
	private LoginPage loginPage;
	
	
	public LoginTask(WebDriver driver) {
		this.driver = driver;
		this.loginPage = new LoginPage(this.driver);
	}
	
	public void relizarLogin() throws InterruptedException {
		
		loginPage.getUserNameInput().sendKeys("standard_user");
		Thread.sleep(3000);
		loginPage.getPasswordInput().sendKeys("secret_sauce");
		Thread.sleep(3000);
		loginPage.getLoginButton().click();
		Thread.sleep(3000);
	}

}
