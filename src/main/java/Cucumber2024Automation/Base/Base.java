package Cucumber2024Automation.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	
	public static void launchApplication(String browser) {
		
		if( browser.equals("Chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}else if (browser.equals("Edge")){
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}else if (browser.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			System.out.println("invalid browser");
	}
		
		driver.get("https://cucumber.io/");
		driver.manage().window().maximize();
	}
	
	
	public static void implicitTime(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	


}
