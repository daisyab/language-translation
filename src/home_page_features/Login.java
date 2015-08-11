/**
 * This class tests the login functionality.
 * 
 * @author daisy
 */

package home_page_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import common.CommonCode;

public class Login extends CommonCode {
				
	private String expectedTitle = "Dashboard";
	
	@Test(dataProvider = "Authentication")
	public void login(String username, String password) {
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys(username);
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys(password);			
		WebElement submit = driver.findElement(By.name(utilities.Constants.sumbitButton));
		submit.click();
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@DataProvider(name = "Authentication")
	public Object[][] loginDataProvider() throws Exception {
		
		Object[][] connect = utilities.ExcelReader.connect(utilities.Constants.pathTestData, 
	    		utilities.Constants.loginDataSheetName);
	    Object[][] cellData = utilities.ExcelReader.read(connect);
		return cellData;
	}
}