import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG {
  WebDriver driver ;
  @Test
  public void f() {
	 String baseUrl = "https://www.toolsqa.com/";
      
      System.out.println("Launching Google Chrome browser");
      
      //System.setProperty("webdriver.chrome.driver","C:\\Roopa\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
      //WebDriver driver = new ChromeDriver();
      driver = new FirefoxDriver();
      System.out.println("here2"); 
      driver.get(baseUrl);
      
      
      String testTitle = "Free QA Automation Tools For Everyone";
      String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
  }
  
  @BeforeMethod
  public void beforeMethod() {
		  System.out.println("Starting Test On Chrome Browser");
  }

  @AfterMethod
  public void afterMethod() {
		  driver.close();
		  System.out.println("Finished Test On Chrome Browser");
	 
  }

}
