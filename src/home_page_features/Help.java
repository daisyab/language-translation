/**
 * This class tests the Help link found on the MACC's footer.
 * 
 * @author Daisy Nkweteyim
 */

package home_page_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Help extends common.CommonCode {

	@Test
	public void HelpTest() {
		
		//help
		driver.findElement(By.xpath("html/body/div[3]/div/font/a[4]")).click();
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/helpPC/", actualURL);
	}

}


