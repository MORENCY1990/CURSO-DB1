package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import FrameWork.Brownser.Waits;
import PageObjects.CheckoutComplete;
import PageObjects.CheckoutOverview;

public class CheckoutCompleteValidation {
	private WebDriver driver;
	private CheckoutComplete checkoutComplete;
	private Waits wait;
	
	public CheckoutCompleteValidation(WebDriver driver) {
		this.driver = driver;
		checkoutComplete = new CheckoutComplete(this.driver);
		wait = new Waits(this.driver);
	}
	public void validationCheckoutComplete() {
		wait.loadElement(checkoutComplete.getTitulo1());
		Assertions.assertTrue(checkoutComplete.getTitulo1().isDisplayed());
	}
}
