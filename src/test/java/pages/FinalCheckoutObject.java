package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webHelpers.WaitsHelper;

public class FinalCheckoutObject {
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=order&step=1']")
WebElement finalcheckoutbutton;
WebDriver driver;



	public FinalCheckoutObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 
		
	}
public WebElement getfinalcheckbutton() {
	return finalcheckoutbutton;
}
}
