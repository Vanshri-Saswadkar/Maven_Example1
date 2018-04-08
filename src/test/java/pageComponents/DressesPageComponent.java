package pageComponents;

import org.openqa.selenium.WebDriver;

import pages.DressesPageObject;

public class DressesPageComponent {

	DressesPageObject dressesPage;
	WebDriver driver;
	
	public DressesPageComponent(WebDriver driver)
	{
		this.driver = driver;
		dressesPage = new DressesPageObject(this.driver);
	}
 public void checkCasualDressesStatusAndClick() {
	 boolean status=dressesPage.checkCasualDressStatus();
	 if(status==true)
	 {
		 dressesPage.clickOnCausalDresses();
	 }
	 
 }	
}
