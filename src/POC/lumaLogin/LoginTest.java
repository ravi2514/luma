package POC.lumaLogin;

import org.testng.annotations.Test;

import com.lib.Priority;

@Priority(1)
public class LoginTest extends LoginMethods{

	
	@Test(priority=101)
	public void login() throws Exception {
		homePage();
		loginWithValidCredentials();		
		
	}
	
	
	@Test(priority=102)
	public void verifyTitle() throws Exception {
		titleValidate();	
		
	}
	
	
	
	
	
	@Test(priority=103)
	public void quit() throws Exception {
		 driver.quit();		
		
	}
	
}
