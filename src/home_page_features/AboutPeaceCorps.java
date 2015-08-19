/**
 * This class tests the "About Peace Corps" link found at the MACC's footer
 * 
 * @author Daisy Nkweteyim
 */

package home_page_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AboutPeaceCorps extends common.CommonCode {

	@Test
	public void PeaceCorpsTest() {
		
		//about peacecorps
		driver.findElement(By.xpath("html/body/div[3]/div/font/a[1]")).click();
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/aboutPC/", actualURL);
	}

}

