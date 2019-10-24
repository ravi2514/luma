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
	
}
