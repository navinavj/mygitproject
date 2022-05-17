package pom;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisneylandHotelPage{

	WebDriver driver;
	
	@FindBy(xpath = "//h1[@class='roomRatesTitle d1-d19 d-padin-20 m-hide t-hide']")
	public WebElement resortHeading;
	
	
	@FindBy(xpath = "//div[@class='card-price-type']")
	List<WebElement> availableRooms;
	
	public int RoomAvailability() {
		List<WebElement> i = driver.findElements(By.xpath("//button[@name='addToCart']"));
		return i.size();
	}
	
	public DisneylandHotelPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
}

