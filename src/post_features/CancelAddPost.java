/**
 * This class tests the cancel add post functionality. 
 * 
 * @author daisy
 */

package post_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import common.DataProviderCommonCode;

public class CancelAddPost extends DataProviderCommonCode {
	
	private String expectedURL; 

	@Test
	public void canceladdpost() {
		
		driver.get(utilities.Constants.list_of_posts);
		WebElement addPost = driver.findElement(By.linkText(
				utilities.Constants.addNewPost));
		addPost.click();	
		WebElement cancel = driver.findElement(By.linkText("Cancel"));
		cancel.click();
		expectedURL = utilities.Constants.list_of_posts;
		Assert.assertEquals(expectedURL, driver.getCurrentUrl());
	}		
}