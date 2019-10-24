package POC.lumaLogin;

import com.lib.TestBase;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginMethods extends TestBase{
	SoftAssert softAssert = new SoftAssert();
	
	/** Navigates to home page*/
	public void homePage() throws Exception {
        logInfo("Enter into homePage method");
        driver.navigate().to(appUrl);      
        
	}
	
	
	
	public void loginWithValidCredentials() throws Exception {
        logInfo("Enter into loginWithValidCredentials method");
        clickOnObject("cssSelector", siginLnk);    
        Thread.sleep(3000);
        clearText("cssSelector", email);
        clearText("cssSelector", password); 
        enterText("cssSelector", email ,"urveshsingh@gmail.com");
        enterText("cssSelector", password ,"xelit@123");
        clickOnButton("cssSelector", signinBtn);
        
	}
	
	
	
	
	
	
	
	
	
	
	 
}
