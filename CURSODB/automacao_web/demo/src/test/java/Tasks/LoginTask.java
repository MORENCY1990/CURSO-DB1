package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
import Validations.GenericValidation;
import Validations.LoginValidation;

public class LoginTask {

	private WebDriver driver;
	private LoginPage homePage;
	private LoginValidation loginValidation;
	private GenericValidation genericValidation;
	
	public LoginTask(WebDriver driver) {
		
		this.driver = driver;
		homePage = new LoginPage(this.driver);
		loginValidation = new LoginValidation(this.driver);
		genericValidation = new GenericValidation(this.driver);
		
	}
	
	
	public void efetuarLogin() throws InterruptedException {
		
		loginValidation.validationLoginPage();
		homePage.getUserNameInput().sendKeys("standard_user");
		Thread.sleep(3000);
		homePage.getPasswordInput().sendKeys("secret_sauce");
		Thread.sleep(3000);
		homePage.getLoginButton().click();
		Thread.sleep(3000);
		genericValidation.validationPageProducts();
		
		
	}
	
	
}