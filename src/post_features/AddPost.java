/**
 * This class tests the Add Post functionality.
 * 
 * @author daisy
 */

package post_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import common.DataProviderCommonCode;

public class AddPost extends DataProviderCommonCode {
		
	private String expectedURL;
	
	@Test(dataProvider = "post")
	public void addpostTest(String title, String description) {
		
		driver.get(utilities.Constants.list_of_posts);
		
		//add a new post
		WebElement addpostButton = driver.findElement(By.linkText(utilities.Constants.addNewPost));
		addpostButton.click();
		WebElement titre = driver.findElement(By.name("title_post"));
		titre.sendKeys(title);
		WebElement description_post = driver.findElement(By.name("description_post"));
		description_post.sendKeys(description);
		WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(), 'Submit')]"));
		submitButton.click();
		expectedURL = utilities.Constants.list_of_posts; 
		Assert.assertEquals(expectedURL, driver.getCurrentUrl());
	}
	
	@DataProvider(name = "post")
	public Object[][] addpostDataProvider() throws Exception {
		Object[][]connect = utilities.ExcelReader.connect(utilities.Constants.pathTestData,
				utilities.Constants.postDataSheetName);
		
		Object[][] cellData = utilities.ExcelReader.read(connect);
		return cellData;	
	}
}