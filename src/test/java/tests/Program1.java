package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program1
{
	@Test
	public void method()
	{
		//Sort the given list of strings using java streams
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		if(driver.getTitle().equals("Google"))
		{
			Reporter.log("Test case passed");
		}
		else
		{
			Reporter.log("Test case failed");
		}
		driver.quit();
		
	}
}
