package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import FrameWork.Brownser.Waits;
import PageObjects.CheckoutPage;
import PageObjects.LoginPage;

public class CheckoutValidation {
	private WebDriver driver;
	private CheckoutPage checkoutPage;
	private Waits wait;
	
	public CheckoutValidation(WebDriver driver) {
		
		this.driver = driver;
		checkoutPage= new CheckoutPage(this.driver);
		wait = new Waits(this.driver);

	}
	
	public void validationCheckoutPage() {
		
		wait.loadElement(checkoutPage.getTitle());
		Assertions.assertTrue(checkoutPage.getTitle().isDisplayed());
		
		
	}
}
