package myTest;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends BaseClass {
	@Test
	public void verifyTitle() {
		String actualTest= driver.getTitle();
		String expectedTitle="Amazon.in: Online Shopping India - Buy mobiles, laptops, cameras, books, watches, apparel, shoes and e-Gift Cards. Free Shipping & Cash on Delivery Available."; 
		Assert.assertEquals(actualTest,expectedTitle);
	} 
    @Test
	public void verifyLogo(){

		boolean flag = driver.findElement(By.xpath("//*[@id='nav-logo-sprites']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
}
