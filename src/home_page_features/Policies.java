/**
 * This class tests the policies link at the footer of the MACC
 * 
 * @author Daisy Nkweteyim
 */

package home_page_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import common.DataProviderCommonCode;

public class Policies extends DataProviderCommonCode {

	@Test
	public void policiesTest() {
		
		//policies
		driver.findElement(By.cssSelector("a[href='/policies/']")).click();
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/policies/", actualURL);
	}
}

