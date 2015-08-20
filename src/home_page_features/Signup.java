/**
 * This class tests the signup functionality.
 *  
 * @author daisy
 */

package home_page_features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import common.CommonCode;

public class Signup extends CommonCode{
	
	private String expectedTitle;
		
	@Test(dataProvider = "create")
	public void signup(String gender, String username, String email, String firstname,
			String lastname, String password, String confirm_password, String phone,
			String location) {
		
		driver.findElement(By.cssSelector("a[href='/signup_page/']")).click();
		//checks whether data provided is "male" or "female"
		switch (gender) {
		case "Male": 	WebElement gendervar = driver.findElement(By.cssSelector("input[value='male']"));
						gendervar.click();
						break;
		
		case "Female": 	WebElement gendervariable = driver.findElement(By.cssSelector("input[value='female']"));
						gendervariable.click();
						break;
		default:		System.out.println("Not applicable");
		}
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys(username);
		WebElement mail = driver.findElement(By.name("email"));
		mail.sendKeys(email);
		WebElement firstName = driver.findElement(By.name("first_name"));
		firstName.sendKeys(firstname);
		WebElement lastName = driver.findElement(By.name("last_name"));
		lastName.sendKeys(lastname);
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys(password);
		WebElement confirmPassword = driver.findElement(By.name("confirmpassword"));
		confirmPassword.sendKeys(confirm_password);
		WebElement phoneNum = driver.findElement(By.name("phone"));
		phoneNum.sendKeys(phone);
		WebElement place = driver.findElement(By.name("location"));
		place.sendKeys(location);		
		WebElement submit = driver.findElement(By.name(utilities.Constants.sumbitButton));
		submit.click();
		
		expectedTitle = "Notice";	
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle); //verify?
	}
	
	@DataProvider(name = "create")
	public Object[][] signupDataProvider() throws Exception {
		Object[][]connect = utilities.ExcelReader.connect(utilities.Constants.pathTestData,
				utilities.Constants.accountDataSheetName);
		
		Object[][] cellData = utilities.ExcelReader.read(connect);
		return cellData;	
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
}