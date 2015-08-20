/**
 * This class makes sure all the links in the home page are functional.
 * 
 * @author daisy
 */

package home_page_features;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import common.DataProviderCommonCode;

public class Home_Page_Malaria extends DataProviderCommonCode {
		
	//tests all the links in the homepage
	@Test
	public void DashboardTest() throws InterruptedException {
		
		List<WebElement> links = driver.findElements(By.tagName("a")); 
		 String[] all_links = new String [links.size()];
		for(int i = 0; i < links.size(); i++) {
			all_links[i] = links.get(i).getAttribute("href");
		}
		
		for(int i = 0; i < links.size(); i++){
			driver.navigate().to(all_links[i]);
			Thread.sleep(2000);
		}	
	}	
}