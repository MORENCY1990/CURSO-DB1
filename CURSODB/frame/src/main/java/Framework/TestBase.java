package Framework;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

import Framework.Browser.DriverManager;
import Framework.Browser.TypeBrowser;
import Framework.Report.Report;
import Framework.Utils.FilesOperation;





public class TestBase extends DriverManager {
	
	
	private static WebDriver driver;
	
	private static FilesOperation filesOperation = new FilesOperation(); 
		
	public static WebDriver getDriver() {
		
		driver = getDriver(TypeBrowser.CHROME);
		return driver;
		
	}
	
	
	@AfterEach
	public void finish() {
		
		
	    Report.close();
		quitDriver();
	}
	

	
	
	
}
