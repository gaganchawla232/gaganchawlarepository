package testcases;
import java.io.IOException;
import javax.security.auth.login.Configuration;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import assertions.BrowserAssertions;
import base.DriverInitials;
import pages.Dialogue_Box;
import utilities.Configuration1;

public class TestCase1 extends DriverInitials {
	@Test
	public void testCase1() throws IOException {
		
		browserAssertions.titleVerify("Cruises");

		d.X();
		assertElement.isEnabled("home_Explore_xpath");
		 
		action.moveToElement(home.selectExplore()).perform();
		assertElement.isEnabled("//p[contains(text(),'Destinations')]");
		home.selectDestination();
		browserAssertions.verifyLinkURL(driver.getCurrentUrl(),"cruise-to.aspx");
		action.moveToElement(destination.mouseOverCarribean());
		destination.mouseOverCarribean().click();
		destination.selectStartExploring();
		assertElement.isEnabled("destination_carribean_startExploring_link");
		assertElement.isVisible("destination_carribean_startExploring_link");
		browserAssertions.verifyLinkURL(driver.getCurrentUrl(),"caribbean-cruises.aspx");
		browserAssertions.verifyLinkURL(driver.getCurrentUrl(),"cruise-search");
			}}