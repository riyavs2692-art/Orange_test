package Test_Package;

import org.testng.annotations.Test;

import Base_Package.Base_Class;

public class Login_Test extends Base_Class
{
  @Test
  public void loginmethod()
  {
	  loginob.loginmethod("Admin","admin123");

      //loginob.loginclick_mthd();
  }
}
