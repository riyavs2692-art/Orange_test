package Test_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base_Package.Base_Class;

public class Dashboard_Test extends Base_Class
{
	@Test
	  public void dashmthd()
	  {
		  dashob.dashboard_handle();
	  }
}
