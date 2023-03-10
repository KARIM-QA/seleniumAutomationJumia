package pagesObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
;

public class BasePage {

	protected WebDriver myDriver;

	public BasePage(WebDriver Base_page_Driver) {

		myDriver = Base_page_Driver;

	}

	public void Scroll(WebDriver myDriver) {

		JavascriptExecutor JSE = (JavascriptExecutor) myDriver;

		JSE.executeScript("scroll(0,250)");

	}

}
