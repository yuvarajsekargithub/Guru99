package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	public static WebDriver driver ;
 @Before
 public static void openBrowser() {
	 System.out.println("before");
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\YUVARAJ\\Desktop\\Jars\\chromedriver.exe");
	driver = new ChromeDriver(); 
 }

 @After
 
 public static void close() {
	 //driver.close();
	 
	 System.out.println("after");
 }
}
