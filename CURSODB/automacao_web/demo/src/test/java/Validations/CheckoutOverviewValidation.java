package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import FrameWork.Brownser.Waits;
import PageObjects.CheckoutOverview;

public class CheckoutOverviewValidation {
	private WebDriver driver;
	private CheckoutOverview checkoutOverview;
	private Waits wait;
	
	public CheckoutOverviewValidation(WebDriver driver) {
		this.driver = driver;
		checkoutOverview = new CheckoutOverview(this.driver);
		wait = new Waits(this.driver);
	}
	
	public void validationCheckoutOverview() {
		wait.loadElement(checkoutOverview.getTitulo());
		Assertions.assertTrue(checkoutOverview.getTitulo().isDisplayed());
	}
}
