package com.mv.zamit.ZamitZcs;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.ChildsInformation;
import pageObject.HomePage1;

public class SelectYourEthnicityTest extends Base1{

	
	AndroidDriver<AndroidElement> driver;
	
	@BeforeMethod
	public void startServer1()
	{
		service=startServer();
		
	}
	
	/*@Test
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
	
	@Test
	public void verifyText() throws IOException, InterruptedException
	{
		driver =capabilities("zamitApp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 HomePage1 btnk= new HomePage1(driver);
		 btnk.knowMorelink().click();
		String m= driver.findElementById("com.zcas:id/clZCAS").getText();
		// List<AndroidElement> dropList = driver.findElements(By.id("com.zcas:id/txt_value"));
		 System.out.println(m);
		// for(int i=0; i< dropList.size(); i++){
			 //  MobileElement listItem = (MobileElement) dropList.get(i);
			   System.out.println("success1");
		// }
		 
	}*/
	
	@Test
	public void verifyEthncity() throws IOException, InterruptedException
	{
		driver =capabilities("zamitApp");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    HomePage1 h =new HomePage1(driver);
	    h.letsbeginbtn.click();
	    ChildsInformation lg = new ChildsInformation(driver);
	    lg.createnewprofile.click();
	    Thread.sleep(4000);
	    lg.ethnicitydropdown.click();
	   driver.findElementsByClassName("android.widget.RadioButton").get(0).click();
	   driver.findElementByXPath("//android.widget.Button[@text='Select and Continue']").click();
	   Thread.sleep(4000);
	  String s= lg.ethnicitydropdown.getText();
	  System.out.println(s);
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
