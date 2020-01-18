package base;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.security.auth.login.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import assertions.BrowserAssertions;
import assertions.ElementVerificationAssertion;
import pages.Carribean;
import pages.Destination_1;
import pages.Dialogue_Box;
import pages.Home;
import utilities.Configuration1;

public class DriverInitials {

public WebDriver driver;
public Dialogue_Box d=new Dialogue_Box(driver);
public ElementVerificationAssertion assertElement=new ElementVerificationAssertion(driver);
public Home home=new Home(driver);
public BrowserAssertions browserAssertions=new BrowserAssertions(driver);
public Destination_1 destination=new Destination_1(driver);
public Carribean carribean=new Carribean(driver);
public Actions action=null;

	@BeforeMethod
public void initials() throws IOException {
		
			if(Configuration1.applicationConfig("browser").equalsIgnoreCase("chrome")) 
	{
			System.setProperty("webdriver.chrome.driver","./DriverExecutable/chromedriver.exe");
			driver=new ChromeDriver();
		}
	else if(Configuration1.applicationConfig("browser").equalsIgnoreCase("IE")) 
	{
			System.setProperty("webdriver.ie.driver","./DriverExecutable/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	
	else if(Configuration1.applicationConfig("browser").equalsIgnoreCase("firefox")) 
	{
			System.setProperty("webdriver.gecko.driver","./DriverExecutable/geckodriver.exe");
			driver=new FirefoxDriver();
		}
			
			action=new Actions(driver);
	driver.get(Configuration1.applicationConfig("application_url"));
	driver.manage().window().maximize();	
	driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);

	}

/*@AfterMethod
public void closeBrowser() {
	driver.quit();
}*/
}