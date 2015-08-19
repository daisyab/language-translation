/**
 * This class provides common functionality for other classes concerning database testing.
 * 
 * @author daisy
 */

package database_tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.junit.After;
import org.junit.Before;

public class CommonDBTests {
	
	protected Connection connect = null;
	protected Statement statement = null;
	
	@Before
	public void beforeMethod() {

		String user = utilities.Constants.dbUser;
		String password = utilities.Constants.defaultPassword;
		
		//url = jdbc:postgresql://ip address of vm:port#/db_name
		String url = "jdbc:postgresql://192.168.33.10:5432/webapp";
		try {		
			Class.forName("org.postgresql.Driver");
			connect = DriverManager.getConnection(url, user, password);
			statement = connect.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	@After
	public void afterMethod() throws Exception {
		connect.close();
	}
}