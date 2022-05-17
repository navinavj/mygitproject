package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.DisneylandHotelPage;
import pom.Homepage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import java.time.Duration;

public class FindRooms {
	
	public WebDriver driver;
	
  @Test
  public void findRooms() {
	  
	  @SuppressWarnings("deprecation")
	  	WebDriverWait wait = new WebDriverWait(driver, Duration.parse("30"));
		Homepage obj;
		obj = new Homepage(driver);
		DisneylandHotelPage dlp;
		dlp = new DisneylandHotelPage(driver);
		driver.get("https://disneyworld.disney.go.com/");		
		driver.manage().window().maximize();				
		System.out.println("---Opened Disney Homepage---");		
		wait.until(ExpectedConditions.elementToBeClickable(obj.checkInDateSelector));
		System.out.println("---Clicked on date selector---");
		obj.mouseClickByElement(obj.checkInDateSelector);
		System.out.println("---Cliking on checkout date---");
		obj.mouseClickByElement(obj.checkInDate);
		obj.mouseClickByElement(obj.checkOutDate);
		System.out.println("---Selected trip dates---");
		obj.hotelDropdown.click();
		System.out.println("---clicked on hotel Dropdown---");
		obj.animalKingdomOption.click();
		System.out.println("---clicked on DL hotel---");
		obj.viewRates.click();
		System.out.println("---Clicked view rates button---");
		wait.until(ExpectedConditions.visibilityOf(dlp.resortHeading));
		int avail = dlp.RoomAvailability();
		if(avail==0)
		{
			System.out.println("No rooms available");
		}
		else 
			System.out.println("Number of Rooms available :" +dlp.RoomAvailability());


  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  System.out.println("---Opening Chrome---"); 
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
	  System.out.println("---Closing Chrome---");
  }

}