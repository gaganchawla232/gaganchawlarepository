package assertions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserAssertions  {

	public WebDriver driver=null;
	public BrowserAssertions(WebDriver driver){
		this.driver=driver;
	}
	
public  void titleVerify(String expectedResult) {
	
}
public void verifyLinkURL(String expectedResult,String actual) {
	Assert.assertTrue(expectedResult.contains(actual),"Destination link URL is not correct");

}}