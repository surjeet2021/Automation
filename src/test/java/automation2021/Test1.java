package automation2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	public static WebDriver driver;
	
	@Test
	
	public void BrowserTest() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get("https://surjeettest.azurewebsites.net/webtest/");
		String text =driver.findElement(By.cssSelector("h2")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("Surjeet Chaudhary"));
		System.out.println("Test case successfully passed");
		driver.close();
		
	}

}
