package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	driver.get("https://www.softwaretestingmaterial.com/");
	  System.out.println("opened site");

  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  System.out.println("opening edge");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  System.out.println("closing edge");

	  
  }

}