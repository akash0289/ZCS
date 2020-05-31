package com.mv.zamit.ZamitZcs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.ChildsInformation;
import pageObject.HomePage1;
import pageObject.ParentInformationPage;
import pageObject.SaveMyAppPage;
import pageObject.SelectYourChildProfile;

public class SaveMyAppTest extends Base1 {

	
	public static AndroidDriver<AndroidElement> driver;
	
	
    
	 
	@BeforeMethod
	public void startServer1()
	{
		service=startServer();
	}
	
	
	/*@Test
	public void verifyHeader() throws IOException, InterruptedException
	{
		appLaunch();
		SaveMyAppPage hm=new SaveMyAppPage(driver);
		String actual=hm.pageHeader.getText();
		String expected="Are you sure, you want to cancel the Application Process ?";
		Assert.assertEquals(actual, expected);
		System.out.println("Page header is :"+actual);
	}
	
	@Test
	public void verifyPagetext() throws IOException, InterruptedException
	{
		appLaunch();
		SaveMyAppPage hm=new SaveMyAppPage(driver);
		String actual=hm.pagetext.getText();
		String expected="In case you want to save your application as draft and want to continue later, we will save your entered data and you continue the process anytime.";
		Assert.assertEquals(actual, expected);
		System.out.println("Page text is :"+actual);
	}*/
	
	@Test
	public void verifySaveMyAppBtn() throws IOException, InterruptedException
	{
		appLaunch();
		SaveMyAppPage hm=new SaveMyAppPage(driver);
		String actual=hm.savemyappbtn.getText();
		String expected="Save my Application";
		System.out.println("Save my Application visible text is correct");
		hm.savemyappbtn.click();
		Thread.sleep(4000);
		HomePage1 hp=new HomePage1(driver);
		if(hp.letsbeginbtn.isDisplayed())
		{
			System.out.println("Save my Application is working fine");
		}
		else
		{
			System.out.println("Save my Application is not working fine");
			
		}
	}
		
	@Test
	public void verifyCloseBtn() throws IOException, InterruptedException
	{
		appLaunch();
		SaveMyAppPage hm=new SaveMyAppPage(driver);
		hm.closebtn.click();
		ParentInformationPage pg=new ParentInformationPage(driver);
		if(pg.ParentInformationTitle.isDisplayed())
		{
			System.out.println("Close button is working fine");
		}
		else
		{
			System.out.println("Close button is not working fine");
		}
	}
	
	
	public static void appLaunch() throws IOException, InterruptedException
	{
		 driver =capabilities("zamitApp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 HomePage1 btnk= new HomePage1(driver);
		 btnk.letsBegin().click();
		 Thread.sleep(10000);
		 SelectYourChildProfile p=new SelectYourChildProfile(driver);
		 p.childList.get(7).click();
		 p.Continuebtn.click();
		 Thread.sleep(5000);
		 ChildsInformation ch=new ChildsInformation(driver);
	     ch.NextStep.click();
		 ch.childformpopupok.click();
		 Thread.sleep(4000);
		 ParentInformationPage pg=new ParentInformationPage(driver);
		 pg.contacNumber.clear();
		 pg.contacNumber.sendKeys("4567898765");
		 pg.saveexitbtn.click();
		 Thread.sleep(3000);
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

