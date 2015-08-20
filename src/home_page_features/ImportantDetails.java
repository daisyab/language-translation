/**
 * This class tests the Important Details link found on the MACC's footer.
 * 
 * @author Daisy Nkweteyim
 */

package home_page_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import common.DataProviderCommonCode;

public class ImportantDetails extends DataProviderCommonCode {

	@Test
	public void importantDetailsTest() {

		//important details
		driver.findElement(By.cssSelector("a[href='/details/']")).click();
		String actualURL= driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/details/", actualURL);
	}
}