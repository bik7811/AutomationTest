package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;
import util.TestUtil;


public class skyBlueBackgroundSteps extends TestBase {
	WebDriver driver;
	HomePage homePage;
	TestUtil testUtil;
	
	public skyBlueBackgroundSteps() {
		super();
	}
	
	@Given("user is on auto1exam page")
	public void user_is_on_auto1exam_page() {
	    initialization();
	}

	@When("user clicks the set sky blue background")
	public void user_clicks_the_set_sky_blue_background() {
	    homePage = new HomePage();
	    homePage.setSkyBlueBackGround();
	}

	@Then("page changes to  sky blue background")
	public void page_changes_to_sky_blue_background() throws IOException {
	   TestUtil.takeScreenshot();
	   
	}

}
