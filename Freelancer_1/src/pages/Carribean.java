package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Configuration1;

public class Carribean {
	
	public WebDriver driver=null;
public Carribean(WebDriver driver) {
	this.driver=driver;
	
}
	
	public void selectStartExploring() throws IOException {
		driver.findElement(By.linkText(Configuration1.elementConfig("carribean_sailing_link"))).click();
	}
}
