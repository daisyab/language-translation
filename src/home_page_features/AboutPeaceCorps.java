/**
 * This class tests the "About Peace Corps" link found at the MACC's footer
 * 
 * @author Daisy Nkweteyim
 */

package home_page_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import common.DataProviderCommonCode;

public class AboutPeaceCorps extends DataProviderCommonCode {

	@Test
	public void peaceCorpsTest() {
		
		//about peacecorps
		driver.findElement(By.cssSelector("a[href='/aboutPC']")).click();
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/aboutPC/", actualURL);
	}
}