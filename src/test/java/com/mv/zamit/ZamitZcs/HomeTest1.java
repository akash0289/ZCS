package com.mv.zamit.ZamitZcs;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import pageObject.ChildsInformation;
import pageObject.HomePage1;

/**
 * Akash Shrivastava
 */

public class HomeTest1 extends Base1
{
	
	public AndroidDriver<AndroidElement> driver;
	 
	@BeforeMethod
	public void startServer1()
	{
		service=startServer();
	}
	
	 @Test
	 public void verifyLetsBegin() throws IOException, InterruptedException
	 {
		 driver =capabilities("zamitApp");
		 System.out.println("App is launch");
		 
		 HomePage1 btnk= new HomePage1(driver);
		 btnk.letsBegin().click();
		 
			  }
	 @Test
	 public void verifyBackButton() throws InterruptedException, IOException
	 {  
		 driver =capabilities("zamitApp");
		 HomePage1 btnk= new HomePage1(driver);
		 btnk.letsBegin().click();
		 Thread.sleep(4000);
		 TouchAction t = new TouchAction(driver);
		 ChildsInformation cd=new ChildsInformation(driver);
		 t.tap(tapOptions().withElement(element(cd.backButton()))).perform();
		 //cd.backbtn.click();
	 }
	 
	 
	 @Test
	 public void verifyKnowMorelink() throws IOException, InterruptedException
	 {
		 driver =capabilities("zamitApp");
		 HomePage1 btnk= new HomePage1(driver);
		 btnk.knowMore().click();
	 }
	 
	 
		
	 //close button of know more page
	 @Test
	 public void verifyClosebutton() throws IOException, InterruptedException
	 {
		 driver =capabilities("zamitApp");
		 HomePage1 btnk= new HomePage1(driver);
		 btnk.knowMore().click();
		 btnk.closeButton().click();
		 
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
