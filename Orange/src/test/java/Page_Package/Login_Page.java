package Page_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page 
{
WebDriver driver;
WebDriverWait wait;

@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")WebElement username;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")WebElement password;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")WebElement loginbtn;

public Login_Page(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}

public void loginmethod(String user, String pwd)
{
	wait.until(ExpectedConditions.visibilityOf(username));

    username.sendKeys(user);

    wait.until(ExpectedConditions.visibilityOf(password));

    password.sendKeys(pwd);
}
	public void loginmethod()
	{
		loginbtn.click();
	}
	
	public String titlemethod()
	{
		String title=driver.getTitle();
		return title;
	}
}
