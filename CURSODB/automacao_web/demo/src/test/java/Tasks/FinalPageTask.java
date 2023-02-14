package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.FinalPage;
import Validations.FinalPageValidation;
import Validations.GenericValidation;

public class FinalPageTask {
	private WebDriver driver;
	private FinalPage finalPage;
	private FinalPageValidation finalPageValidation;
	private GenericValidation genericValidation;
	
	public FinalPageTask(WebDriver driver) {
		this.driver = driver;
		finalPage = new FinalPage(this.driver);
		finalPageValidation = new FinalPageValidation(this.driver);
		genericValidation= new GenericValidation(this.driver);
	}
	
	public void clickHome() throws InterruptedException{
		finalPage.getBotaoHome().click();
		Thread.sleep(3000);
		genericValidation.validationFinalPage();
		
	}

}
