package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	driver.get("https://www.softwaretestingmaterial.com/");
	  System.out.println("opened site");

  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("opening chrome");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  System.out.println("closing chrome");

	  
  }

}