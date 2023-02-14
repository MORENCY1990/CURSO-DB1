package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import FrameWork.Brownser.Waits;
import PageObjects.FinalPage;

public class FinalPageValidation {
	private WebDriver driver;
	private FinalPage finalPage;
	private Waits wait;
	
	public FinalPageValidation(WebDriver driver) {
		this.driver = driver;
		finalPage = new FinalPage(this.driver);
		wait = new Waits(this.driver);
	}
	
	public void validationFinalPage() {
		wait.loadElement(finalPage.getTitulo2());
		Assertions.assertTrue(finalPage.getTitulo2().isDisplayed());
	}
}
