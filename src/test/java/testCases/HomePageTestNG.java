package testCases;

import java.io.IOException;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import page.HomePage;
import util.TestUtil;
import util.XlUtil;

public class HomePageTestNG extends TestBase {
	HomePage homePage;
	TestUtil testUtil;
	XlUtil xlUtil;
	
	
	@BeforeTest
	public void setUp() {
		initialization();
		homePage = new HomePage();
	}
	
	@Test(priority = 1)
	public void validateAddCategory() throws IOException  {
		String path = "src/main/java/testData/TestData.xlsx";
		xlUtil = new XlUtil(path);
		String excelData = xlUtil.getData(0, 1, 0);
		homePage.enterTextForAddCategory(excelData);
		homePage.addCategory();
		
	}
	
	@Test
	public void verifyAddCategory() throws IOException  {
		String path = "src/main/java/testData/TestData.xlsx";
		xlUtil = new XlUtil(path);
		String excelData = xlUtil.getData(0, 1, 0);
		homePage.enterTextForAddCategory(excelData);
		homePage.addCategory();
		System.out.println(homePage.checkNewAddedCategory());
	}
	
	
	@Test(priority = 2)
	public void verifyDuplicateCategory() throws IOException {
		String path = "src/main/java/testData/TestData.xlsx";
		xlUtil = new XlUtil(path);
		String excelData = xlUtil.getData(0, 1, 0);
		String dup = homePage.checkDuplicateCategory(excelData);
		if(dup.equals("BikTest")) {
			System.out.println("The category you want to add already exists: <BikTest>");
		}
		
		else {
			System.out.println("This is new category, we can add this.");
		}
	}
	
	@Test(priority = 3)
	public void validateMonthDropDown() {
		homePage.dropDown();	
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
