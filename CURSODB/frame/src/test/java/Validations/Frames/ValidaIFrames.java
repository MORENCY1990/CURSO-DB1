package Validations.Frames;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.Frames.HomePage;
import PageObjects.Frames.IFramePage;
import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;

public class ValidaIFrames {
	
	
	private WebDriver driver;
	
	private HomePage homePage;
	
	private IFramePage iFramePage;
	
	private Waits wait;
	
	public ValidaIFrames(WebDriver driver) {
		
		this.driver = driver;
		homePage = new HomePage(this.driver);
		iFramePage = new IFramePage(this.driver);
		wait = new Waits(this.driver);

	}
	
	public void validaIFramePage() {
		
		try {
			
			String title = iFramePage.getIFrameTitle().getText();
			Assertions.assertEquals("iFrames Example", title);
			Report.log(Status.PASS, "P�gina de IFrames Carrega com sucesso", Screenshot.captureBase64(driver));
			
		}catch (Exception e) {
		
			Report.log(Status.FAIL, "P�gina de IFrames n�o foi carregada com sucesso", Screenshot.captureBase64(driver));
		}
		
	}
	
	
	public void validaIFrameList() {
		
		try {
			
			String label = iFramePage.getIFrameList().getText();
			Assertions.assertEquals("iFrame List Item 2", label);
			Report.log(Status.PASS, "Iframe List verificado com sucesso", Screenshot.captureBase64(driver));
			
		}catch (Exception e) {
		
			Report.log(Status.FAIL, "N�o foi poss�vel acessar o IFrame", Screenshot.captureBase64(driver));
		}
		
	}
	
	public void validaIFrameText() {
		
		try {
			
			String label = iFramePage.getIFrameText().getText();
			Assertions.assertEquals("This page is used in an iFrame.", label);
			Report.log(Status.PASS, "Iframe Caixa de texto verificado com sucesso" + label, Screenshot.captureBase64(driver));
			
		}catch (Exception e) {
		
			Report.log(Status.FAIL, "N�o foi poss�vel acessar o IFrame Caixa de texto", Screenshot.captureBase64(driver));
		}
		
	}
	
	public void validaIFrameLink() {
		
		try {
			
			wait.loadElement(homePage.getLinkIFrame());
			Assertions.assertTrue(true, String.valueOf(homePage.getLinkIFrame().isEnabled()));
			Report.log(Status.PASS, "P�gina index carregada com sucesso", Screenshot.captureBase64(driver));
			
		}catch (Exception e) {
		
			Report.log(Status.FAIL, "N�o foi poss�vel carregar a p�gina index", Screenshot.captureBase64(driver));
		}
		
	}
	
	
	
	

}
