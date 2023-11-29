package setup;

import java.time.Duration;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.utils;

public class setup {
	public static WebDriver driver;
	public static SoftAssert softAssert;
	public static JSONObject Makeappointment = utils.loadjsonFile("./src/test/resources/makeAppointment.json");
	
	@BeforeMethod
	public void Setup() {
		softAssert = new SoftAssert();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		}
	@AfterMethod
	public void Closedriver() {
		driver.close();
	}

}
