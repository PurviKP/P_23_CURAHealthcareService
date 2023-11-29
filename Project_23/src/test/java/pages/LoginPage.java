package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath = "//a[@id='btn-make-appointment']")WebElement MakeAppointment;
	@FindBy(id = "txt-username") WebElement username;
	@FindBy(name = "password") WebElement password;
	@FindBy(xpath = "//button[@id ='btn-login']") WebElement loginButton;
	@FindBy(tagName = "h2")WebElement dashboard;
	@FindBy (tagName = "p") WebElement InvalidCreds;
	@FindBy (xpath = "//a[@id=\"menu-toggle\"]") WebElement toggleMenu;
	@FindBy (xpath = "//a[text()='Logout']") WebElement logoutButton;
	
	public void doLogin(String user, String pwd) {
		MakeAppointment.click();
		username.sendKeys(user);
		password.sendKeys(pwd);
		loginButton.click();
	}
	
	public String doLogInWithInvalidCreds(String username, String password) {
		MakeAppointment.click();
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		loginButton.click();
		return InvalidCreds.getText();
	}
	
	public void doLogout(String user, String pwd) {
		MakeAppointment.click();
		username.sendKeys(user);
		password.sendKeys(pwd);
		loginButton.click();
		toggleMenu.click();
		logoutButton.click();
		
	}

}
