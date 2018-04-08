package pageComponents;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageComponents.FirstCheckoutComponent;
import pages.AuthenticationObject;

public class AuthenticationComponent {
WebDriver driver;
AuthenticationObject authenticationObject;
	public AuthenticationComponent(WebDriver driver) {
		this.driver=driver;
		authenticationObject=new AuthenticationObject(this.driver);
	}
public void checkAuthenticationLabel() {
	Assert.assertEquals(authenticationObject.getAuthenticationLabel().getText(),"AUTHENTICATION");
//Assert.assertEquals(success_msg,"Product successfully added to your shopping cart");
}
}
