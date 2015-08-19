package home_page_features.testsuite;

import home_page_features.AboutPeaceCorps;
import home_page_features.Help;
import home_page_features.ImportantDetails;
import home_page_features.Policies;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({AboutPeaceCorps.class,
	Policies.class,
	ImportantDetails.class,
	Help.class})
public class FooterTestSuite {
	

}
