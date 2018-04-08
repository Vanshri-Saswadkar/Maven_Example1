package pages;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class DressesPageObject {
	@FindBy(xpath="(//a[text()='Casual Dresses'])[4]")
			WebElement casualdressbutton;
	
	
	WebDriver driver;
	
	public DressesPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

	public void clickOnCausalDresses() {
		
		casualdressbutton.click();
	}
	public boolean checkCasualDressStatus()
	{
		return casualdressbutton.isEnabled();
		
	}
}
