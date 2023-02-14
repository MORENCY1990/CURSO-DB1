package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.CheckoutPage;

import Validations.GenericValidation;
import Validations.CheckoutValidation;

public class CheckoutTask {
	private WebDriver driver;
	private CheckoutPage checkoutPage;
	private CheckoutValidation checkoutValidation;
	private GenericValidation genericValidation;
	
	public CheckoutTask(WebDriver driver) {
		
		this.driver = driver;
		checkoutPage = new CheckoutPage(this.driver);
		checkoutValidation = new CheckoutValidation(this.driver);
		genericValidation = new GenericValidation(this.driver);
		
	}
	
	
	public void efetuarCheckout() throws InterruptedException {
		genericValidation.validationPageCheckout();
		Thread.sleep(3000);		
		checkoutPage.getFirstName().sendKeys("Morency");
		Thread.sleep(3000);
		checkoutPage.getLastName().sendKeys("Castanheira Neto");
		Thread.sleep(3000);
		checkoutPage.getPostalCode().sendKeys("94045060");
		Thread.sleep(3000);
		checkoutPage.getContinueButton().click();
		Thread.sleep(3000);
		
		
		
	}
}
