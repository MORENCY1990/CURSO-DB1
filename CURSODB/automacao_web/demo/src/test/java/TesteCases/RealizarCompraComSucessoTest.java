package TesteCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import FrameWork.TestBase;
import PageObjects.CheckoutComplete;
import Tasks.LoginTask;
import Tasks.SelectProductTask;
import Tasks.CheckoutCompleteTask;
import Tasks.CheckoutOverviewTask;

import Tasks.CheckoutTask;
import Tasks.FinalPageTask;

public class RealizarCompraComSucessoTest extends TestBase {

	private WebDriver driver = this.getDriverManager();

	LoginTask homeTask = new LoginTask(driver);
	SelectProductTask selectProductTask = new SelectProductTask(driver);
	CheckoutTask checkoutTask = new CheckoutTask(driver);
	CheckoutOverviewTask checkoutOverviewTask = new CheckoutOverviewTask(driver);
	CheckoutCompleteTask checkoutCompleteTask = new CheckoutCompleteTask(driver);
	FinalPageTask finalPageTask = new FinalPageTask(driver);

	@Test
	public void realizarCompra() throws InterruptedException {

		homeTask.efetuarLogin();
		selectProductTask.selecionarProduto();
		checkoutTask.efetuarCheckout();
		checkoutCompleteTask.clickBackHome();
		finalPageTask.clickHome();

	}

}
