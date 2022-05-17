package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;

	@FindBy(xpath = "//button[contains(text(),'View Now')]")
	public WebElement viewNowButton;
	
	@FindBy(id = "checkOutDate_display")
	public WebElement checkOutSelector;
	
	@FindBy(id = "checkInDate_display")
	public WebElement checkInDateSelector;
	
	@FindBy(id = "5_24_2022")
	public WebElement checkInDate;
	
	@FindBy(id = "5_28_2022")
	public WebElement checkOutDate;
	
	@FindBy(id = "findPricesButton")
	public WebElement viewRates;
	
	@FindBy(xpath = "//h1[contains(text(),'Explore Resort Hotels')]")
	public WebElement ratesPage;
	
	@FindBy(xpath = "//*[@id='selectDestination']")
	public WebElement hotelDropdown;
	
	@FindBy(xpath = "(//span[@title='All Hotels'])[2]")
	public WebElement allHotelsOption;
	
	@FindBy(xpath = "//span[contains(@id,'Beach Club Resort')]")
	public WebElement beachClubResortOption;
	
	@FindBy(xpath = "//*[@id='Disneyland Hotel']")
	public WebElement disneylandOption;
	
	@FindBy(xpath = "//span[contains(@id,'Animal Kingdom Lodge')]")
	public WebElement animalKingdomOption;
	
	@FindBy(xpath = "//span[contains(@id,'Caribbean Beach Resort')]")
	public WebElement caribbeanbeachResortOption;
	
			
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	public void mouseClickByElement( WebElement ele ) {
	     Actions builder = new Actions(driver);
	     builder.moveToElement(ele).click(ele).perform();
	}
	
}
