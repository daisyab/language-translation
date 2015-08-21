/**
 * This class provides common functionalities for other classes which do not require login credentials.
 * 
 * @author daisy
 */

package common;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonCode {
	
	private String expectedTitle; 
	protected static String baseURL; 
	protected static WebDriver driver;		

	@BeforeMethod
	public void start() {
		baseURL = utilities.Constants.baseURL;			
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		expectedTitle = "Welcome !";
		driver.get(baseURL);
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);		
	}
	
	@AfterMethod
	public void destroy() {
		driver.close();
	}
}