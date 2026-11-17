package Page_Package;



public class Login_Page 
{
WebDriver driver;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")WebElement username;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")WebElement password;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")WebElement loginbtn;

public Login_Page(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}

public void setvalues()
{
	username.sendKeys("Admin")
	password.sendKeys(admin123);
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
