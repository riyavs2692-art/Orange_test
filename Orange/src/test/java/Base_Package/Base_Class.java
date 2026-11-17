package Base_Package;

import Page_Package.Login_Page;

public class Base_Class 

{
 public static WebDriver driver;
 public Login_Page loginob;
 
 @BeforeTest
 {
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
	 }
 }
}
