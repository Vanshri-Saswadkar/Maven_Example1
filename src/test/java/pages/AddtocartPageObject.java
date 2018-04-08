package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPageObject {
@FindBy(xpath="//a[@title='Printed Dress']")
WebElement dressSelect;
@FindBy(xpath="//span[text()='Add to cart']")
WebElement addtocart;
WebDriver driver;
Actions act;

public AddtocartPageObject(WebDriver driver) {
	this.driver=driver;
	act=new Actions(this.driver);
	PageFactory.initElements(driver, this);
}

public boolean dressSelectStatus()
{
return dressSelect.isEnabled();	
}
public void hoverDressAndClickAddtocart()
{
	act.moveToElement(dressSelect).moveToElement(addtocart).click().build().perform();
}

}
