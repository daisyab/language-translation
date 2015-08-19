/**
 * This class tests the policies link at the footer of the MACC
 * 
 * @author Daisy Nkweteyim
 */

package home_page_features;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Policies extends common.CommonCode {

	@Test
	public void PoliciesTest() {
		
		//policies
		driver.findElement(By.xpath("html/body/div[3]/div/font/a[2]")).click();
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/policies/", actualURL);
	}
}

