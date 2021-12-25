package pageobjects;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iphonePage {

private By iphone13 = By.xpath("//div[contains(text(),'APPLE iPhone 13 (Starlight, 128 GB)')]");

public WebDriver driver;

public iphonePage(WebDriver driver){
	this.driver = driver;
	
}



public productPage getIphone() {
	
	driver.findElement(iphone13).click();
	
	Set<String> hand = driver.getWindowHandles();
	java.util.Iterator<String> it = hand.iterator();
	String parent = it.next();
	String child = it.next();
	driver.switchTo().window(child);
	System.out.println(parent);
	return new productPage(driver);
}
	
	
}
