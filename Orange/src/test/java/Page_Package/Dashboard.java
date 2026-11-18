package Page_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard 
{
	WebDriver driver;
	 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")WebElement admin;
	 
	 public Dashboard(WebDriver driver) 
	 {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	 public void dashboard_handle()
	 {
		 admin.click();
	 }
}

