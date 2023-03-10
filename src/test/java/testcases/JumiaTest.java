package testcases;

import org.testng.annotations.Test;

import pagesObjects.BasePage;
import pagesObjects.HomePage;
import pagesObjects.ProductsPage;
import testRecording.MyScreenRecorder;

public class JumiaTest extends ConfigTest {
	
	BasePage basePage;
	HomePage homePage ;
	ProductsPage productPage;

	@Test
	public void FunctionalTestingJumia() throws Exception {
		
		MyScreenRecorder.startRecording("JumiaFunctionalTesting");
		
		homePage = new HomePage(myDriver);
		homePage.fillProductField("pc portable msi");
		homePage.clickOnsearchButton();
		basePage = new BasePage (myDriver) ;
		basePage.Scroll(myDriver);
		productPage = new ProductsPage(myDriver);
		productPage.expectedDisplayedProduct();
		productPage.addProductToPanel();
		
		Thread.sleep(5000);
		
	}

}
