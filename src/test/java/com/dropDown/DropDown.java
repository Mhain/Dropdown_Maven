package com.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		selectDropDownValue();
		selectDropDownIndex();
	}
	
	public static void selectDropDownValue() throws InterruptedException {
		
		WebElement DropDown=driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
		
		Select obj=new Select(DropDown);
		
		obj.selectByValue("2");
		Thread.sleep(5000);
		
		
	}
	public static void selectDropDownIndex() {
		
		WebElement DropDown=driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
		
		Select obj=new Select(DropDown);
		
		obj.selectByValue("1");
		
		
	}
}
