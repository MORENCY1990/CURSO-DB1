package TesteCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import FrameWork.TesteBase;
import Tasks.LoginTask;

public class RealizarCompraComSucesso extends TesteBase{
	
	
	private WebDriver driver = this.getDriverManager();
	
	
	LoginTask loginTask = new LoginTask(driver);
	
	
	@Test
	public void realizarCompra() throws InterruptedException {
		
		loginTask.relizarLogin();
	}

}
