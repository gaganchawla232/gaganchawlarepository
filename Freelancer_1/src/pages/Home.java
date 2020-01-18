package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Configuration1;

public class Home {

	WebDriver driver=null;
	public Home(WebDriver driver) {
		this.driver=driver;
	}
	
	public  WebElement selectExplore() throws IOException {
		return driver.findElement(By.xpath(Configuration1.elementConfig("home_Explore_xpath")));
	}
	public void selectDestination() throws IOException {
		driver.findElement(By.xpath(Configuration1.elementConfig("home_Destination_xpath"))).click();
	}	
}