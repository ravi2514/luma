package com.lib;

public class Locators {
	
	// Drivers details	
				public  String projectPath = System.getProperty("user.dir");
				public  String filepath = projectPath+"/Downloads/";
				public  String uploadPath = projectPath+"/testdata/files/";
				//public  String gecko_driver = projectPath + "\\browserDrivers\\geckodriver.exe";
				//public  String chrome_driver = projectPath + "\\browserDrivers\\chromedriver.exe";
				public  String ie_driver= projectPath + "/browserDrivers/IEDriverServer";
				public  String safari_driver= projectPath + "/browserDrivers/SafariDriver";
				public  String screenShotsPath = projectPath+"/screenShots";
				public  int DEFAULT_WAIT_TIME = 180;
				public  String chrome_driver = projectPath +"/browserDrivers/chromedriver_mac";
				public  String gecko_driver = projectPath + "/browserDrivers/geckodriver_mac";
				public String excelFilePath = projectPath + "/attributeData/productDetails.xls";

				public  String appUrl = "http://ec2-18-223-118-61.us-east-2.compute.amazonaws.com/magento4/magento2/";                //"https://mcprod.zagg.com/";  //"https://staging.zagg.com/";   //"http://www.zagg.local/";	
				
				
				
				/******Login        **/
				public String siginLnk = "ul.header:nth-child(2) > li:nth-child(2) > a:nth-child(1)";
				public String email = "input#email";
				public String password= "input#pass";
				public String signinBtn = "button#send2 > span";
			

}
