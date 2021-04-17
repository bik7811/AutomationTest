package testCases;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import base.TestBase;
import page.HomePage;
import util.TestUtil;
import util.XlUtil;

public class HomePageJunitTest extends TestBase {
	HomePage homePage;
	TestUtil testUtil;
	XlUtil xlUtil;
	
	
	
	public HomePageJunitTest() {
		super();
	}
	
	@Before
	public void setUp() {
		initialization();
		homePage = new HomePage();
	}
	

	
//	@Test
	public void validateToggleAll()  {
		homePage.checkToggleAll();

	}
	
//	@Test
	public void verifyToglleAll() {
		
		System.out.println(homePage.verifyToggleAllSelected());
	}
	
	 @Test
	 public void validateRemovalOfSingleListItem()  {
		homePage.validateRemovalSingleItem();
	 }
	 
//	 @Test 
	 public void verifyRemovalOfSingleListItem()  {
		 System.out.println(homePage.verifyRemovalSingleItem());
	 }
		
//	 @Test
	public void validateRemoveAllListItem() throws IOException {
		TestUtil.takeScreenshot();
		homePage.removeAllItems();
		TestUtil.takeScreenshot();
	}
	


	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
