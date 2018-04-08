package webHelpers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsHelper {

	WebDriver driver;
	WebDriverWait wait;
	ExpectedCondition<Boolean> expectation; 

	public WaitsHelper(WebDriver driver)
	{
		this.driver = driver;
	}


	public void waitForPageLoaded()
	{
		ExpectedCondition<Boolean> expectation = new
		ExpectedCondition<Boolean>()
		{
			public Boolean apply(WebDriver driver)
			{
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
			}
		};
		try 
		{
			Thread.sleep(1000);
			wait = new WebDriverWait(driver, 40);
			wait.until(expectation);
		} catch (Throwable error)
		{
			System.out.println("Timeout waiting for Page Load Request to complete.");
		}
	}


	public WebElement waitForVisibility(WebElement elementToWait)
	{
		wait=new WebDriverWait(driver, 100);	    
		return wait.until(ExpectedConditions.visibilityOf(elementToWait));		
	}






}