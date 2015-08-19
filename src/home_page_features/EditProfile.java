/**
 * This class tests the edit profile functionality.
 * 
 * @author Daisy Nkweteyim
 */

package home_page_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditProfile extends common.CommonCode {

	private String expectedTitle; 
	
	@Test
	public void DashboardTest() {
		expectedTitle = "Dashboard";

		driver.get(baseURL);
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		Assert.assertTrue("Expected value is not the same as the actual value.",
				expectedTitle.equals(actualTitle));
		//click on Welcome
		driver.findElement(By.xpath
				("html/body/div[1]/div/div/div/div[2]/div/h4/a[1]/font")).click();
		//click on EditProfile
		driver.findElement(By.xpath
				("html/body/div[2]/center[2]/button[1]")).click();
		
		//find generic method; add email number etc
		driver.findElement(By.xpath
				("html/body/div[2]/div/div[2]/form/table/tbody/tr[1]/td[2]/h4/input")).sendKeys
				("Daisy");
		driver.findElement(By.xpath("html/body/div[2]/div/div[2]/form/table/tbody/tr[2]/td[2]/h4/input")).sendKeys
		("Nkweteyim");
		driver.findElement(By.xpath("html/body/div[2]/center[2]/input")).click();
		
		String result = driver.findElement(By.xpath("html/body/center[1]/h4")).getText();
		System.out.println(result);
	}
}
