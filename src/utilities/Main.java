/**
 *The function of this class is to run all the test cases.
 *
 *@author daisy
*/

package utilities;

import java.util.List;
import org.testng.TestNG;
import org.testng.collections.Lists;

public class Main {

	public static void main(String[] args) {

		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add("src/utilities/testng.xml");
		testng.setTestSuites(suites);
		testng.run();
	}
}