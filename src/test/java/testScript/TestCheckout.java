package testScript;
import org.testng.annotations.Test;
import pageComponents.AddtocartPageComponent;
import pageComponents.AuthenticationComponent;
import pageComponents.DressesPageComponent;
import pageComponents.FinalCheckoutComponent;
import pageComponents.FirstCheckoutComponent;
import pageComponents.IndexPageComponent;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestCheckout {
	IndexPageComponent indexpagecomponent;
	WebDriver driver;
	DressesPageComponent dressesPageComponent;
	AddtocartPageComponent addtocartpagecomponent;
	FirstCheckoutComponent firstcheckoutcomponent;
	FinalCheckoutComponent finalcheckoutcomponent;
	AuthenticationComponent authenticationcomponent;
	
	@Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	System.setProperty("webdriver.chrome.driver", "D:\\TECHBODHI_SELENIUM\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	indexpagecomponent= new IndexPageComponent(driver);	  
	dressesPageComponent = new DressesPageComponent(driver);
	addtocartpagecomponent= new AddtocartPageComponent(driver);
	firstcheckoutcomponent=new FirstCheckoutComponent(driver);
	finalcheckoutcomponent=new FinalCheckoutComponent(driver);
	authenticationcomponent= new AuthenticationComponent(driver);
  }

  
  @Test
  public void testSimpleFlow()
  {
	  System.out.println("Running Simple flow");
	  indexpagecomponent.checkDressesStatusAndClick();
	  dressesPageComponent.checkCasualDressesStatusAndClick();
	  addtocartpagecomponent.checkDressStatusAndAddtoCart();
	  firstcheckoutcomponent.checkFirstCheckoutButton();
	  finalcheckoutcomponent.checkFinalCheckoutButton();
  }
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
