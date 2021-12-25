package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	
	private By searchBox = By.cssSelector("input[title*= 'Search for']");
	private By searchButton = By.xpath("//button[@type='submit']");
	private By closePop = By.cssSelector("button[class ='_2KpZ6l _2doB4z']");
	
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	public WebElement getSearch() {
		
		return(driver.findElement(searchBox));
	}
	public iphonePage getSearchButton() {
		driver.findElement(searchButton).click();
		return new iphonePage(driver);
	}
	
	public WebElement closePopup() {
		return driver.findElement(closePop);
		
	}
}
