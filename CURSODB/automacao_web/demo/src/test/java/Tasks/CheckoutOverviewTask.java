package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.CheckoutOverview;
import Validations.CheckoutOverviewValidation;
import Validations.GenericValidation;

public class CheckoutOverviewTask {
	private WebDriver driver;
	private CheckoutOverview checkoutOverview;
	private CheckoutOverviewValidation checkoutOverviewValidation;
	private GenericValidation genericValidation;
	
	public CheckoutOverviewTask(WebDriver driver) {
		this.driver = driver;
		checkoutOverview = new CheckoutOverview(this.driver);
		checkoutOverviewValidation = new CheckoutOverviewValidation(this.driver);
		genericValidation = new GenericValidation(this.driver);
	}
	
	public void clickFinish() throws InterruptedException {
		checkoutOverview.getBotaoFinish().click();
		Thread.sleep(3000);
		genericValidation.validationPageCheckout();
		Thread.sleep(3000);
	}
}
