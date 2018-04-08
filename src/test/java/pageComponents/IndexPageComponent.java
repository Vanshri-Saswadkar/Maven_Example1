package pageComponents;

import org.openqa.selenium.WebDriver;

import pages.IndexPage;

public class IndexPageComponent {
	WebDriver driver;
	IndexPage indexPageObject;
	public IndexPageComponent(WebDriver driver) {
		this.driver=driver;
		indexPageObject = new IndexPage(this.driver);		
	}

	public void checkDressesStatusAndClick()
	{
		boolean status = indexPageObject.checkDressesStatus();

			System.out.println("Printing Status: "+status);
			indexPageObject.clickOnDresses();
		
	}


}
