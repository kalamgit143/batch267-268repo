package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class HomePage {

	private WebDriver driver=null;
	private FluentWait<WebDriver> wait=null;
	
	@FindBy (xpath="//*[@title='Search']")
	private WebElement  searchBox;
	
	public HomePage(WebDriver driver,FluentWait<WebDriver> wait)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		this.wait=wait;
		
	}
	
 
	public void fillSearchBox(String x)
	{
		wait.until(ExpectedConditions.visibilityOf(searchBox)).sendKeys(x,Keys.ENTER);		
	}
}
