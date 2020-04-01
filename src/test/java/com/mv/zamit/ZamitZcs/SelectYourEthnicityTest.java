package com.mv.zamit.ZamitZcs;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.HomePage1;

public class SelectYourEthnicityTest extends Base1{

	
	AndroidDriver<AndroidElement> driver;
	
	@BeforeMethod
	public void startServer1()
	{
		service=startServer();
		
	}
	
	@Test
	public void verifySearchBox() throws IOException, InterruptedException
	{
		driver =capabilities("zamitApp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 HomePage1 btnk= new HomePage1(driver);
		 btnk.letsBegin().click();

		 driver.findElement(By.id("com.zcas:id/sp_citizenship")).click();
		  //Locate all drop down list elements 
		  List<AndroidElement> dropList = driver.findElements(By.id("com.zcas:id/txt_value"));
		  System.out.println("success0");
		  //Extract text from each element of drop down list one by one.  
		  for(int i=0; i< dropList.size(); i++){
		   MobileElement listItem = (MobileElement) dropList.get(i);
		   System.out.println("success1");
		   
		   System.out.println(listItem.getText());
		   
		   System.out.println("success3");
		  }  
	}
	
	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
		//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(4000);
		
	}
	@AfterMethod
	public void stopServer()
	{
		service.stop();
	}
}
