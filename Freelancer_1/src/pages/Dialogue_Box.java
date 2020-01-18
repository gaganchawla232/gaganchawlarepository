package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.Configuration1;

public class Dialogue_Box {
	
	WebDriver driver=null;
	public Dialogue_Box(WebDriver driver) {
		this.driver=driver;
	}

	public  void X()  {
		try {
			 driver.findElement(By.xpath(Configuration1.elementConfig("close_X_xpath"))).click();
			}
		catch(Exception e) {
           System.out.println("Element not found");
		}}}