package Validations.Alerts;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.Alerts.HomePage;
import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;

public class ValidaPaginaAlerts {
	
	private WebDriver driver;
	
	private HomePage homePage;
	
	private Waits wait;
	
	public ValidaPaginaAlerts(WebDriver driver) {
		
		this.driver = driver;
		homePage = new HomePage(this.driver);
		wait = new Waits(this.driver);
	}
	
	public void validaHomeAlerts() {
		
		try {
			
			String label = homePage.getPageTextLabel().getText();
			Assertions.assertEquals("JavaScript Alerts", label);
			Report.log(Status.PASS, "Pagina JavaScript Carregada", Screenshot.captureBase64(driver));
			
		}catch (Exception e) {
			
			Report.log(Status.FAIL, "Pagina JavaScript Não Carregou" + e.getMessage(), Screenshot.captureBase64(driver));
		}
		
		
		
	}
	

}
