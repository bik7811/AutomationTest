package util;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class TestUtil extends TestBase {
	
	public static long implicitWait = 10;
	
	public static void takeScreenshot() throws IOException {
		
		Date currentDate = new Date();
		String ScreenShotDateFile = currentDate.toString().replace(" ", "-").replace(":","-");
		
		// 1. Take screenshot and store it as a file format.
		
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//2. Copy the Screenshot to desired location using copyFile method
	
		FileUtils.copyFile(screenShotFile, new File(".//Screenshot//" + ScreenShotDateFile + ".png"));
	}
	
	
	

}
