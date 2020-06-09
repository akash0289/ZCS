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
import pageObject.SearchAndSelectPage;
import pageObject.SelectYourChildProfile;
import pageObject.UploadDocPage;

public class SearchAndSelectTest extends Base1 {
	
	public static AndroidDriver<AndroidElement> driver;
	
	
    
	 
	@BeforeMethod
	public void startServer1()
	{
		service=startServer();
	}

	
	
	
	@Test
	public void verifyZcasToolBarText() throws IOException, InterruptedException
	{
		appLaunch();
		SearchAndSelectPage pg=new SearchAndSelectPage(driver);
		String actual=pg.zcastoolbartext.getText();
		String expected="ZCAS";
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		System.out.println("Zcas tool bar text is correct");
		
	}
	@Test
	public void verifyToolBarStepText() throws IOException, InterruptedException
	{
		appLaunch();
		SearchAndSelectPage pg=new SearchAndSelectPage(driver);
		String actual=pg.toolbarsteptext.getText();
		String expected="Step 2 of 4";
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		System.out.println("Tool bar Step text is correct");
		
	}
	
	@Test
	public void verifyBackBtn() throws IOException, InterruptedException
	{
		appLaunch();
		SearchAndSelectPage pg=new SearchAndSelectPage(driver);
		pg.backBtn.click();
		UploadDocPage ch=new UploadDocPage(driver);
		if(ch.pageHeader.isDisplayed())
		{
			System.out.println("Back button is working fine");
		}
		else
		{
			System.out.println("Back button is not working fine");
		}
	}
	
	@Test
	public void verifySaveBtn() throws IOException, InterruptedException
	{
		appLaunch();
		SearchAndSelectPage pg=new SearchAndSelectPage(driver);
		pg.saveexitbtn.click();
		SaveMyAppPage hm=new SaveMyAppPage(driver);
		if(hm.pageHeader.isDisplayed())
		{
			System.out.println("Save button is working fine");
		}
		else
		{
			System.out.println("Save button is not working fine");
		}
	}
	
	@Test
	public void verifyPageTitle() throws IOException, InterruptedException
	{
		appLaunch();
		SearchAndSelectPage pg=new SearchAndSelectPage(driver);
		String actual=pg.pageTitle.getText();
		System.out.println(actual);
		String expected="Search and Select\nSchools you want to apply!";
		Assert.assertEquals(actual, expected);
		System.out.println("Display String is :"+actual);
	}
	
	@Test
	public void verifySearchBox() throws IOException, InterruptedException
	{
		appLaunch();
		SearchAndSelectPage pg=new SearchAndSelectPage(driver);
		//Verify Placeholder text
		String actual=pg.schoolsearchbox.getText();
		if(actual.contains("Search Schools"))
		{
			System.out.println("Place holder text is same as: "+actual);
		}
		else
		{
			System.out.println("Place holder text is different from expected: "+actual);
		}
		//Verify edit option
		pg.schoolsearchbox.clear();
		pg.schoolsearchbox.sendKeys("Delhi Public School");
		String s=pg.schoolsearchbox.getText();
		if(s.contains("Delhi Public School"))
		{
			System.out.println("Enter text is same as: "+actual);
		}
		else
		{
			System.out.println("Enter text is different from expected: "+actual);
		}
		
		//Verify keyboard is visible or not
		if(driver.isKeyboardShown())
		{
			System.out.println("Keyboard is visible");
		}
		else
		{
			System.out.println("Keyboard is not visible");
			
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
		 pg.contacNumber.sendKeys("9876453983");
		 driver.hideKeyboard();
		 pg.nextStepbtn.click();
		 Thread.sleep(3000);
		 pg.popupOkbtn.click();
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
