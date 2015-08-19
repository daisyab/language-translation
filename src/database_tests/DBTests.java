/**
 * This class provides tests of the CRUD operations of the database of the MACC.
 * 
 * @author daisy
 */

package database_tests;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DBTests extends CommonDBTests {

	@Test
	public void create_operations() throws SQLException {
		int result = statement.executeUpdate("create  table dummy(dummy_id INTEGER UNIQUE, "
				+ "dummy_name VARCHAR(50) NOT NULL, primary key(dummy_id));");
		Assert.assertTrue("table created", result == 0);
	}
	
	@Test
	public void read_operations() throws SQLException {
		ResultSet result = statement.executeQuery("select * from malaria_post;");
		while(result.next()) {
			String id = result.getString("id");
			String owner_id = result.getString("owner_id");
			String title_post = result.getString("title_post");
			String description_post = result.getString("description_post");
			String link_post = result.getString("link_post");     
			String created = result.getString("created");
			String updated = result.getString("updated");
			System.out.println("id  owner_id  title_post  description_post  link_post created  "
					+ "                      updated");
			System.out.print(id + "   " + owner_id + "         " + title_post + "       " 
			+ description_post + "   " + link_post + "              " + created + "  " + updated);	
		}
	}
	
	@Test	
	public void update_operations() throws SQLException {
		int result = statement.executeUpdate("update malaria_post set title_post = 'Title1' where id = 7;");
			Assert.assertTrue("value updated", result == 1);			
	}
	
	//@Test
	public void delete_operations() throws SQLException {
		int result = statement.executeUpdate("drop table dummy;");
		Assert.assertTrue("table created", result == 0);
	}
}