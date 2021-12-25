package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage {

	public WebDriver driver;

	public productPage(WebDriver driver) {

		this.driver = driver;

	}

	private By prodName = By.xpath("//span[@class='B_NuCI']");
	private By prodPrice = By.cssSelector("div[class = '_30jeq3 _16Jk6d']");

	public String getProductName() {

		return driver.findElement(prodName).getText();

	}

	public String getProductPrice() {

		return driver.findElement(prodPrice).getText();

	}

}
