/**
 * This class provides common functionalities for other classes.
 */

package common;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DataProviderCommonCode {
	
	protected WebDriver driver;
	protected static String baseURL; 

	@BeforeMethod
	public void beforeMethod() {		  	  
		baseURL = utilities.Constants.baseURL;			
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(utilities.Constants.defaultUsername);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(utilities.Constants.defaultPassword);
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
}