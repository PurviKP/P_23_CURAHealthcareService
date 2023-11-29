package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.json.simple.JSONObject;

public class makeAppointmentpage {
	public makeAppointmentpage (WebDriver driver) {
		PageFactory.initElements(driver , this);
		
	}
	
	@FindBy(xpath = "//a[@id='btn-make-appointment']")WebElement MakeAppointment;
	@FindBy(id = "txt-username") WebElement username;
	@FindBy(name = "password") WebElement password;
	@FindBy(xpath = "//button[@id ='btn-login']") WebElement loginButton;
	@FindBy (xpath = "//select[@id=\"combo_facility\"]") 
	WebElement facility;
	@FindBy(xpath="//option[@value=\"Tokyo CURA Healthcare Center\"]") 
	WebElement TokyoCURAHealthcareCenter;
	@FindBy(xpath="//option[@value=\"Hongkong CURA Healthcare Center\"]") 
	WebElement HongkongCURAHealthcareCenter;
	@FindBy(xpath="//option[@value=\"Seoul CURA Healthcare Center\"]") 
	WebElement SeoulCURAHealthcareCenter;
	@FindBy(id = "chk_hospotal_readmission")
	WebElement Chkbox;
	@FindBy (xpath = "//input[@value='Medicare']")
	WebElement Medicarebutton;
	@FindBy (xpath = "//input[@value='Medicaid']")
	WebElement Medicaidbutton;
	@FindBy (xpath = "//input[@id='radio_program_none']")
	WebElement nonbutton;
	@FindBy (xpath = "//span[@class=\"glyphicon glyphicon-calendar\"]")
	WebElement dateSymbol;
	@FindBy (xpath = "//input[@placeholder=\"dd/mm/yyyy\"]")
	WebElement DateSelect;
	@FindBy (name = "comment")
	WebElement comment;
	@FindBy (xpath = "//button[@type=\"submit\"]")
	WebElement BookAppointment;
	@FindBy (tagName = "h2")WebElement AppointMentConformation;
	@FindBy (xpath = "//a//i[@class='fa fa-chevron-up fa-fw fa-1x']")
	WebElement scrollup;
	@FindBy (xpath = "//a[@id='menu-toggle']") 
	WebElement toggleMenu;
	@FindBy (xpath = "//a[text()='History']")
	WebElement HistoryBtn;
	@FindBy (tagName = "h2")
	WebElement HistorypageConformation;
	@FindBy (xpath = "//a[@class='btn btn-default']")
	WebElement GoToHomepage;
	
	public void checkymakeAppointmentpage(JSONObject Makeappointment) {
		MakeAppointment.click();
		username.sendKeys((String) Makeappointment.get("username"));
		password.sendKeys((String) Makeappointment.get("password"));
		loginButton.click();
		facility.click();
		TokyoCURAHealthcareCenter.click();
		Chkbox.click();
		Medicarebutton.click();
		DateSelect.sendKeys((String)Makeappointment.get("Visit Date (Required)"));
		comment.sendKeys((String) Makeappointment.get("Comment"));
		BookAppointment.click();
		AppointMentConformation.isDisplayed();
		}
	
	public void chkHongkongCHCdropDwon(JSONObject Makeappointment) {
		MakeAppointment.click();
		username.sendKeys((String) Makeappointment.get("username"));
		password.sendKeys((String) Makeappointment.get("password"));
		loginButton.click();
		facility.click();
		HongkongCURAHealthcareCenter.click();
		Chkbox.click();
		Medicaidbutton.click();
		DateSelect.sendKeys((String)Makeappointment.get("Visit Date (Required)"));
		comment.sendKeys((String) Makeappointment.get("Comment"));
		BookAppointment.click();
		AppointMentConformation.isDisplayed();
		}
	
	public void chkSeoulCHCdropDwon(JSONObject Makeappointment) {
		MakeAppointment.click();
		username.sendKeys((String) Makeappointment.get("username"));
		password.sendKeys((String) Makeappointment.get("password"));
		loginButton.click();
		facility.click();
		SeoulCURAHealthcareCenter.click();
		Chkbox.click();
		nonbutton.click();
		DateSelect.sendKeys((String)Makeappointment.get("Visit Date (Required)"));
		comment.sendKeys((String) Makeappointment.get("Comment"));
		BookAppointment.click();
		AppointMentConformation.isDisplayed();
		
		}
	
	public void ScrollupButton(JSONObject Makeappointment) {
		MakeAppointment.click();
		username.sendKeys((String) Makeappointment.get("username"));
		password.sendKeys((String) Makeappointment.get("password"));
		loginButton.click();
		scrollup.click(); 
	}
	
	public void HistoryButton(JSONObject Makeappointment) {
		MakeAppointment.click();
		username.sendKeys((String) Makeappointment.get("username"));
		password.sendKeys((String) Makeappointment.get("password"));
		loginButton.click();
		facility.click();
		TokyoCURAHealthcareCenter.click();
		Chkbox.click();
		Medicarebutton.click();
		DateSelect.sendKeys((String)Makeappointment.get("Visit Date (Required)"));
		comment.sendKeys((String) Makeappointment.get("Comment"));
		BookAppointment.click();
		AppointMentConformation.isDisplayed();
		toggleMenu.click();
		HistoryBtn.click();
		HistorypageConformation.isDisplayed();
		GoToHomepage.click();
		AppointMentConformation.isDisplayed();
		}
	

}
