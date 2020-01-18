package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Configuration1;

public class Destination_1 {

	public WebDriver driver=null;
	public Destination_1(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement mouseOverCarribean() throws IOException {
	return	driver.findElement(By.xpath(Configuration1.elementConfig("destination_carribean_xpath")));
	}
	public WebElement selectStartExploring() throws IOException {
		return	driver.findElement(By.xpath(Configuration1.elementConfig("destination_carribean_startExploring_xpath")));
		}
}
