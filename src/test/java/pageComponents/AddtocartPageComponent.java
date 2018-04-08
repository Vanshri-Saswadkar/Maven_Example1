package pageComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.AddtocartPageObject;


public class AddtocartPageComponent {
WebDriver driver;
AddtocartPageObject addtocartpageobject;
	
	public AddtocartPageComponent(WebDriver driver) {
		this.driver=driver;
		addtocartpageobject= new AddtocartPageObject(this.driver);
		PageFactory.initElements(driver, this);
	}
	public void checkDressStatusAndAddtoCart() {
	 boolean status=addtocartpageobject.dressSelectStatus();
	 if(status==true)
	 {
		 addtocartpageobject.hoverDressAndClickAddtocart();

	 }
	// addtocartpageobject.hoverDressAndClickAddtocart();
	}
}
