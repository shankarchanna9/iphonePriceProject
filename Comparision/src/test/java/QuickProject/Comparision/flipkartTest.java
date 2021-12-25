package QuickProject.Comparision;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.iphonePage;
import pageobjects.productPage;

public class flipkartTest extends base {

	public WebDriver driver;
	@BeforeTest
	public void dInit() throws IOException {
		
		driver = driverInit();
		
	}
	
	
	@Test
	public void webSite() {
		
		getWebsite("flipkart");

		HomePage hp = new HomePage(driver);
		
		if(hp.closePopup().isDisplayed()) {
			
			hp.closePopup().click();
			
		}
		
		hp.getSearch().sendKeys("iphone");
		iphonePage ip = hp.getSearchButton();
		
		productPage pp = ip.getIphone();
		Assert.assertEquals("APPLE iPhone 13 (Starlight, 128 GB)", pp.getProductName());
		
		String costF = pp.getProductPrice();
		System.out.println(costF);
		String [] split1= costF.split("?");
		System.out.println(split1[0]);
		System.out.println(split1[1]);
		
		
	}
	@AfterTest
	public void close() {
		
		driver.quit();
	}

	

}
