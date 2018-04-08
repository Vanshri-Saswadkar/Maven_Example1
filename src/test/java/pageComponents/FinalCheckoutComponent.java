package pageComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.FinalCheckoutObject;
import webHelpers.WaitsHelper;

public class FinalCheckoutComponent {
WebDriver driver;
WaitsHelper waitsHelper;
WebElement elementTowait;
FinalCheckoutObject finalcheckoutobject;
	public FinalCheckoutComponent(WebDriver driver) {
		this.driver=driver;
		finalcheckoutobject=new FinalCheckoutObject(this.driver);
		   waitsHelper=new WaitsHelper(this.driver);
	}

	public void checkFinalCheckoutButton() {
		
		elementTowait=waitsHelper.waitForVisibility(finalcheckoutobject.getfinalcheckbutton());
		finalcheckoutobject.getfinalcheckbutton().click();
	}
}
