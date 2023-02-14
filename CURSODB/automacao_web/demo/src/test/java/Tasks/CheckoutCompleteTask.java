package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.CheckoutComplete;

import Validations.CheckoutCompleteValidation;

import Validations.GenericValidation;

public class CheckoutCompleteTask {
	private WebDriver driver;
	private CheckoutComplete checkoutComplete;
	private CheckoutCompleteValidation checkoutCompleteValidation;
	private GenericValidation genericValidation;
	
	public CheckoutCompleteTask(WebDriver driver) {
		this.driver = driver;
		checkoutComplete = new CheckoutComplete(this.driver);
		checkoutCompleteValidation = new CheckoutCompleteValidation(this.driver);
		genericValidation = new GenericValidation(this.driver);
	}
	
	public void clickBackHome() throws InterruptedException {
		genericValidation.validationPageOverview();
		Thread.sleep(3000);
		checkoutComplete.getBackHome().click();
		Thread.sleep(3000);
		
	}
}
