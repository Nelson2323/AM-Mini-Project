package myTest;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	
	
	

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nelson\\eclipse-workspace\\Miniproject\\Drivers\\chromedriver.exe");

		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}




	@AfterMethod  
	public void tearDown(){

		driver.quit();
	} 

	
	
	
	
}
