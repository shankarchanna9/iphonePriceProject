package QuickProject.Comparision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
 public WebDriver driverInit() throws IOException {
	Properties prop = new Properties(); 
	String path = "C:\\Users\\System 1\\Documents\\Selenium_Traning\\Comparision\\src\\main\\java\\QuickProject\\Comparision\\data.properties";
	FileInputStream fs= new FileInputStream(path);
	
	prop.load(fs);
	String brName = prop.getProperty("Browser");
	
	if(brName.equals("chrome")) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\System 1\\Documents\\Selenium_Traning\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	return driver;
	
}
 
 
 public void getWebsite(String website) {
		
	 String website1 = "https://www."+website+".com/";
		driver.get(website1);
			
	
		
	}
 
 
}


