package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {

	public ProductsPage(WebDriver myDriver) {
		super(myDriver);

	}

	By productDescription = By.xpath("//h3[contains(text(),'Msi PC Portable Gamer GF63 Thin - i5 11400H 8G 512')]");
	By panel = By.xpath("//article[2]//footer[1]//form[1]");

	public void expectedDisplayedProduct() {

		WebElement p = myDriver.findElement(productDescription);
		assert p.isDisplayed();
		System.out.println("Product Description Successfully displayed !!!");

	}

	public void addProductToPanel() {

		myDriver.findElement(panel).click();
	}

}
