package com.lib;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BrowserStack extends ExtentReportNG{
	
	public WebDriver driver;
	
	 private String userName= "ravikumar198";
	 private String accessKey= "GFpGya4yeJy6mzqKVEx4";
	
	 @BeforeClass
	  @Parameters(value={"browser","version","platform", "appUrl"})
	  public WebDriver browserSetup(String browser, String version, String platform, String appUrl) throws Exception {
	    DesiredCapabilities capability = new DesiredCapabilities();
	    capability.setCapability("platform",platform);
	    //capability.setCapability("os_version", os_version);
	    capability.setCapability("browserName", browser);
	    capability.setCapability("browserVersion", version);
	    capability.setCapability("browserstack.local", false);
	    capability.setCapability("browserstack.debug", "true");
	    capability.setCapability("browserstack.console", "warnings");
	    capability.setCapability("browserstack.networkLogs", "true");
	    

	    capability.setCapability("project", "ZAGG");
	    capability.setCapability("name", "Zagg-Automation in "+platform);	    	
	    capability.setCapability("build", "9.26.4");
	    driver = new RemoteWebDriver(
	      new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"),capability);	      
	      driver.get(appUrl);
	      driver.manage().window().maximize();

	    
	    return driver;
	  }

}
