package pages;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstCheckoutObject {
@FindBy(xpath="//a[@title='Proceed to checkout']")
WebElement checkoutbutton;
@FindBy(xpath="(//h2)[1]")
WebElement labelSuccessAddtocart;

WebDriver driver;

	public FirstCheckoutObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckoutButton() {
		return checkoutbutton;
	}
	public WebElement getlabelSuccesstoAddcart() {
		return labelSuccessAddtocart;
	}
}
