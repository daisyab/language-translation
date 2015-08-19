/**
 * This class tests the change password functionality for users of the MACC
 * 
 * @author Daisy Nkweteyim
 */
package home_page_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import common.DataProviderCommonCode;

public class ChangePassword extends DataProviderCommonCode {
	
	@Test(dataProvider = "changePass")
	public void changePassword(String oldPass, String newPass, String confPass) {
		driver.get(utilities.Constants.welcomeButton);
		
		WebElement changePass = driver.findElement(By.xpath("html/body/div[2]/center[2]/button[2]"));
		changePass.click();	
		WebElement oldPassword = driver.findElement(By.name("oldpass"));
		oldPassword.sendKeys(oldPass);
		WebElement newPassword = driver.findElement(By.name("pass"));
		newPassword.sendKeys(newPass);
		WebElement confirmPass = driver.findElement(By.xpath("html/body/center/font/div/form/div[3]/div/input"));
		confirmPass.sendKeys(confPass);
		WebElement submit = driver.findElement(By.xpath("html/body/center/font/div/form/div[4]/center/button"));
		submit.click();
	}

	@DataProvider(name = "changePass")
	public Object[][] addpostDataProvider() throws Exception {
		Object[][]connect = utilities.ExcelReader.connect(utilities.Constants.pathTestData,
				utilities.Constants.changePasswdSheetName);
		
		Object[][] cellData = utilities.ExcelReader.read(connect);
		return cellData;
		
	}
}
