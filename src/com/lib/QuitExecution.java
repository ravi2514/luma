package com.lib;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;


public class QuitExecution extends TestBase{
	
	
	@AfterClass
	public void quitAll() {
		driver.quit();
	}
	

}
