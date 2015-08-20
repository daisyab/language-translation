/**
 * This class tests the delete post functionality.
 * 
 * @author daisy
 */

package post_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import common.DataProviderCommonCode;

public class DeletePost extends DataProviderCommonCode {
	
	private String expectedURL;
	@Test
	public void deletepost() {
			
		driver.get(utilities.Constants.list_of_posts );
		try {			
			WebElement deleteButton = driver.findElement(By.linkText("Delete"));
			deleteButton.click();
			driver.findElement(By.xpath("//button[contains(text(), 'Yes, delete this Post')]")).click();
			expectedURL = utilities.Constants.list_of_posts;
			Assert.assertEquals(expectedURL, driver.getCurrentUrl());
			}
			catch(NoSuchElementException e) {
				System.out.println("No such element: Delete");
			}
	}
}
