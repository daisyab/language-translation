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
		
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div/h4/a[2]/font")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);		

		String actualTitle = driver.getTitle();
		Assert.assertEquals("Welcome !", actualTitle);		
	}		
}