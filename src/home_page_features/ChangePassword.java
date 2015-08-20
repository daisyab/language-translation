/**
 * This class tests the change password functionality for users of the MACC
 * 
 * @author Daisy Nkweteyim
 */
package home_page_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import common.DataProviderCommonCode;
import org.junit.Assert;

public class ChangePassword extends DataProviderCommonCode {
	
	protected WebDriver driver;
	protected static String baseURL; 
	
	@Test(dataProvider = "changePass")
	public void changePassword(String oldPass, String newPass, String confPass) {
		WebElement welcomeButton = driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div/h4/a[1]/font"));
		welcomeButton.click();
		WebElement changePass = driver.findElement(By.xpath("html/body/div[2]/center[2]/button[2]"));
		changePass.click();	
		WebElement oldPassword = driver.findElement(By.name("oldpass"));
		oldPassword.sendKeys(oldPass);
		WebElement newPassword = driver.findElement(By.name("pass"));
		newPassword.sendKeys(newPass);
		WebElement confirmPass = driver.findElement(By.xpath("html/body/center/font/div/form/div[3]/div/input"));
		confirmPass.sendKeys(confPass);
		WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
		submit.click();
		Assert.assertEquals(newPass, confPass);
	}

	@DataProvider(name = "changePass")
	public Object[][] addpostDataProvider() throws Exception {
		Object[][]connect = utilities.ExcelReader.connect(utilities.Constants.pathTestData,
				utilities.Constants.changePasswdSheetName);
		
		Object[][] cellData = utilities.ExcelReader.read(connect);
		return cellData;
		
	}
}