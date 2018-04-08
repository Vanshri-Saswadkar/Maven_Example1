package pages;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class IndexPage {
	WebDriver driver;
	String indexPageUrl="http://automationpractice.com/index.php";
	@FindBy(xpath="(//a[@class='sf-with-ul'])[4]")  
	WebElement dressesElementFromMenu;


	public IndexPage(WebDriver driver) {
		this.driver=driver;
		driver.get(indexPageUrl);
		PageFactory.initElements(driver, this);
	}

	public void clickOnDresses()
	{
		dressesElementFromMenu.click();		  
	}
	public boolean checkDressesStatus()
	{
		return dressesElementFromMenu.isEnabled();
	}

}
