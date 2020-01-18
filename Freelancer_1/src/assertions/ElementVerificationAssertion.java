package assertions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utilities.Configuration1;

public class ElementVerificationAssertion {
	
	WebDriver driver=null;
	public ElementVerificationAssertion(WebDriver driver) {
		this.driver=driver;
	}

	public void isEnabled(String expectedResult) throws IOException {
try {		
	Assert.assertTrue(driver.findElement(By.xpath(Configuration1.elementConfig(expectedResult))).isEnabled(),"Element is not Enabled");	
}
catch(Exception e) {
	Assert.assertTrue(false,"Element not found");
}
}

	public void isVisible(String expectedResult) throws IOException {
try {		
	Assert.assertTrue(driver.findElement(By.xpath(Configuration1.elementConfig(expectedResult))).isEnabled(),"Element is not visible");	
}
catch(Exception e) {
	Assert.assertTrue(false,"Element not found");
}
}

	
}
