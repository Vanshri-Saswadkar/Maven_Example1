package pageComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.FirstCheckoutObject;
import webHelpers.WaitsHelper;

public class FirstCheckoutComponent {
WebDriver driver;
WaitsHelper waitsHelperObject;
WebElement elementTowaitFor;

FirstCheckoutObject firstcheckoutobject;
	public FirstCheckoutComponent(WebDriver driver) {
		this.driver=driver;
		 firstcheckoutobject=new FirstCheckoutObject(this.driver);
		 waitsHelperObject=new WaitsHelper(this.driver); 
	}

	public void checkFirstCheckoutButton() {
		 elementTowaitFor=waitsHelperObject.waitForVisibility(firstcheckoutobject.getlabelSuccesstoAddcart());
			String success_msg=elementTowaitFor.getText();
			elementTowaitFor=waitsHelperObject.waitForVisibility(firstcheckoutobject.getCheckoutButton());
		firstcheckoutobject.getCheckoutButton().click();
	}

}
