package Test_Package;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Package.Base_Class;
import Page_Package.Login_Page;

public class Login_Test extends Base_Class
{
Login_Page ob;

@BeforeMethod
public void objectmethod()
{
	ob=new Login_Page(driver);
}

@Test
public void logintestmethod()
{
	ob.setvalues();
	ob.loginmethod();
}
@Test
public void titleverification()
{
	System.out.println(ob.titlemethod());
}
}
