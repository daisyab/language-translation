/**
 * This class tests the Help link found on the MACC's footer.
 * 
 * @author Daisy Nkweteyim
 */

package home_page_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import common.DataProviderCommonCode;

public class Help extends DataProviderCommonCode {

	@Test
	public void helpTest() {
		
		//help
		driver.findElement(By.cssSelector("a[href='/helpPC/']")).click();
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/helpPC/", actualURL);
	}
}