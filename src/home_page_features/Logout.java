/**
 * This class tests the logout functionality.
 * 
 * @author daisy
 */

package home_page_features;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import common.DataProviderCommonCode;

public class Logout extends DataProviderCommonCode {
	
	@Test
	public void logout() {
		
		driver.findElement(By.xpath("//font[contains(text(),'LogOut')]")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);		

		String actualTitle = driver.getTitle();
		Assert.assertEquals("Welcome !", actualTitle);		
	}		
}