package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver myDriver) {

		super(myDriver);

	}

	By popup = By.xpath("//button[@aria-label='newsletter_popup_close-cta']//*[name()='svg']");
	By searchProductField = By.xpath("//input[@id='fi-q']");
	By SearchProductBtn = By.xpath("//button[normalize-space()='Rechercher']");

	public void fillProductField(String product) {
		try {
			myDriver.findElement(popup).click();
			myDriver.findElement(searchProductField).sendKeys(product);

		} catch (Exception e) {
			System.out.println("Exceptions caught" + e.getMessage());
		}

	}

	public void clickOnsearchButton() {
		try {
			myDriver.findElement(SearchProductBtn).click();
		} catch (Exception e) {
			System.out.println("Exceptions caught" + e.getMessage());
		}

	}

}
