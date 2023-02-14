package Validations;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import FrameWork.Brownser.Waits;
import PageObjects.LoginPage;

public class LoginValidation {
	
	private WebDriver driver;
	private LoginPage homePage;
	private Waits wait;
	
	public LoginValidation(WebDriver driver) {
		
		this.driver = driver;
		homePage= new LoginPage(this.driver);
		wait = new Waits(this.driver);

	}
	
	public void validationLoginPage() {
		
		wait.loadElement(homePage.getTitle());
		Assertions.assertTrue(homePage.getTitle().isDisplayed());
		
		
	}
	

}