package testrunner;

import org.testng.annotations.Test;

import pages.LoginPage;
import setup.setup;

public class LoginTestRunner extends setup {
	LoginPage loginpage;
	
	@Test(priority = 1, description = "user login with valid Credential")
	public void doLogin () {
		loginpage = new LoginPage(driver);
		String user = (String) Makeappointment.get("username");
		String pwd = (String) Makeappointment.get("password");
		loginpage.doLogin(user, pwd);
	}
	
	@Test(priority = 2,description = "User do Login with invalid credential")
	public void doLogInWithInvalidCreds() {
		loginpage = new LoginPage(driver);
		String message_actual = loginpage.doLogInWithInvalidCreds("abc","abc123");
		String message_expected = "Login failed! Please ensure the username and password are valid.";
		softAssert.assertTrue(message_actual.contains(message_expected));
	    }
	
	@Test(priority = 3,description = "User do Logout ")
	public void doLogout() {
		loginpage = new LoginPage(driver);
		String user = (String) Makeappointment.get("username");
		String pwd = (String) Makeappointment.get("password");
		loginpage.doLogout(user, pwd);
	}
	

}
