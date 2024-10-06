package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver=null;
	
	@FindBy (xpath="//*[@title='Search']")
	private WebElement  searchBox;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
		this.driver=driver;
	}
	
 
	public void fillSearchBox(String x)
	{
		searchBox.sendKeys(x);
	}
}
