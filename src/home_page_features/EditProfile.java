/**
 * This class tests the edit profile functionality.
 * 
 * @author Daisy Nkweteyim
 */

package home_page_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import common.DataProviderCommonCode;

public class EditProfile extends DataProviderCommonCode {

	private String expectedTitle; 
	
	@Test(dataProvider = "editProfile")
	public void editProfile(String firstName, String lastName, String phone, 
			String email, String gender, String location) {
		expectedTitle = "Dashboard";

		String actualTitle = driver.getTitle();
		Assert.assertTrue("Expected value is not the same as the actual value.",
				expectedTitle.equals(actualTitle));
		//click on Welcome
		driver.findElement(By.xpath
				("html/body/div[1]/div/div/div/div[2]/div/h4/a[1]/font")).click();
		          
		//click on EditProfile
		driver.findElement(By.xpath
				("html/body/div[2]/center[2]/button[1]")).click();
		
		WebElement first_name = driver.findElement(By.name("first_name"));
		first_name.clear();
		first_name.sendKeys(firstName);
		WebElement last_name = driver.findElement(By.name("last_name"));
		last_name.clear();
		last_name.sendKeys(lastName);
		WebElement phone_num = driver.findElement(By.name("phone"));
		phone_num.clear();
		phone_num.sendKeys(phone);
		WebElement Email = driver.findElement(By.name("email"));
		Email.clear();
		Email.sendKeys(email);
		WebElement Gender = driver.findElement(By.name("gender"));
		Gender.clear();
		Gender.sendKeys(gender);
		WebElement locations = driver.findElement(By.name("location"));
		locations.clear();
		locations.sendKeys(location);
		WebElement updateButton = driver.findElement(By.cssSelector("input[value='Update']"));
		updateButton.click();
		
		String result = driver.findElement(By.xpath("html/body/center[1]/h4")).getText();
		System.out.println(result);
	}
	
	@DataProvider(name = "editProfile")
	public Object[][] editProfileDataProvider() throws Exception {

		Object[][] connect = utilities.ExcelReader.connect(utilities.Constants.pathTestData, 
	    		utilities.Constants.editProfileSheetName);
	    Object[][] cellData = utilities.ExcelReader.read(connect);
		return cellData;
	}
}
