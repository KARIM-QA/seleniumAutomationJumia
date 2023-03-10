package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import testRecording.MyScreenRecorder;



public class ConfigTest {

	protected  WebDriver myDriver;
	
	

	@BeforeClass
	public void Setup() {

		WebDriverManager.chromedriver().setup();

		myDriver = new ChromeDriver();

		myDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		myDriver.manage().window().maximize();

		myDriver.get("https://www.jumia.com.tn/");

	}

	@AfterClass
	public void Sortir() throws Exception {

		myDriver.quit();

		MyScreenRecorder.stopRecording();
	}
}
