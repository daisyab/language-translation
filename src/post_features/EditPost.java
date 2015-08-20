/**
 * This class tests the edit post functionality.
 * 
 * @author daisy
 */

package post_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import common.DataProviderCommonCode;

public class EditPost extends DataProviderCommonCode {
	
	private String expectedURL; 

	@Test(dataProvider = "editPost")
	public void editpost(String title, String description) {
		
		driver.get(utilities.Constants.list_of_posts);
		try {			
			WebElement editButton = driver.findElement(By.linkText("Edit"));
			editButton.click();
			WebElement titre = driver.findElement(By.name("title_post"));
			titre.clear();
			titre.sendKeys(title);
			WebElement description_post = driver.findElement(By.name("description_post"));
			description_post.clear();
			description_post.sendKeys(description);
			WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(), 'Submit')]"));
			submitButton.click();
			WebElement list = driver.findElement(By.linkText("Back to Post List"));
			list.click();
			expectedURL = utilities.Constants.list_of_posts; 
			Assert.assertEquals(expectedURL, driver.getCurrentUrl());
			}
			catch(NoSuchElementException e) {
				System.out.println("No such element: Edit");
			}
	}
	
	@DataProvider(name = "editPost")
	public Object[][] editpostDataProvider() throws Exception {
		Object[][]connect = utilities.ExcelReader.connect(utilities.Constants.pathTestData,
				utilities.Constants.postDataSheetName);
		
		Object[][] cellData = utilities.ExcelReader.read(connect);
		return cellData;	
	}
}