package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationObject {
@FindBy(xpath="//h1[text()='Authentication']")
WebElement authenticationlabel;

WebDriver driver;

public AuthenticationObject(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getAuthenticationLabel() {
	return getAuthenticationLabel();
}
}
