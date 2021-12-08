package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.ResortsPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FindRates {
	
	public WebDriver driver;
	
  @Test
  public void findRates() {
	  
	  @SuppressWarnings("deprecation")
	  	WebDriverWait wait = new WebDriverWait(driver,30);
		Homepage obj;
		obj = new Homepage(driver);
		ResortsPage rp;
		rp = new ResortsPage(driver);
		driver.get("https://disneyworld.disney.go.com/");		
		driver.manage().window().maximize();				
		System.out.println("--Opened Disney Homepage---");		
		wait.until(ExpectedConditions.visibilityOf(obj.hideButton));
		obj.hideButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(obj.checkInDateSelector));
		System.out.println("---Clicked on date selector---");
		obj.mouseClickByElement(obj.checkInDateSelector);
		System.out.println("---Cliking on checkout date---");
		obj.mouseClickByElement(obj.checkInDate);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.mouseClickByElement(obj.checkOutDate);
		System.out.println("---Selected trip dates---");
		obj.viewRates.click();
		System.out.println("---Clicked view rates button---");
		wait.until(ExpectedConditions.visibilityOf(rp.resortsHeading));
		System.out.println("Number of Resorts available :" +rp.Availability());

  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("---Opening Chrome---"); 
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
	  System.out.println("---Closing Chrome---");
  }

}