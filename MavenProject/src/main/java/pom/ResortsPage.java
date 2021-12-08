package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResortsPage {
	
	WebDriver driver;

	@FindBy(xpath = "//div[contains(@class,'bestValuePrice')]")
	List<WebElement> availableResorts;
	
	@FindBy(xpath = "//h1[contains(text(),'Explore Resort Hotels')]")
	public WebElement resortsHeading;
	
	public int Availability() {
		List<WebElement> i = driver.findElements(By.xpath("//*[@name='addToCart']"));
		return i.size();
	}
	
	public ResortsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
