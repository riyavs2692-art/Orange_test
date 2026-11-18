package Base_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Page_Package.Dashboard;
import Page_Package.Login_Page;

public class Base_Class 

{
 public static WebDriver driver;
 public Login_Page loginob;
 public Dashboard dashob;
 
 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
	 }
 
 @BeforeMethod
 public void objectmethod()
 {
 	loginob = new Login_Page(driver);
 	dashob  =  new Dashboard(driver);
 }
}

