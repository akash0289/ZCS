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
import pageObject.GuidelinesUploadDocPage;
import pageObject.HomePage1;
import pageObject.ParentInformationPage;
import pageObject.SelectYourChildProfile;
import pageObject.UploadDocPage;

public class GuidelinesUploadDocTest extends Base1 {

	
	public static AndroidDriver<AndroidElement> driver;
	
	
    
	 
	@BeforeMethod
	public void startServer1()
	{
		service=startServer();
	}
	
	@Test
	public void verifyCloseBtn() throws IOException, InterruptedException
	{
		appLaunch();
		GuidelinesUploadDocPage gp=new GuidelinesUploadDocPage(driver);
		UploadDocPage up=new UploadDocPage(driver);
		up.guidelines.click();
		Thread.sleep(3000);
		gp.closebtn.click();
		String actual=up.pageHeader.getText();
		String expected="Please Upload\nRequired Documents!";
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void verifyPageTitle() throws IOException, InterruptedException
	{
		appLaunch();
		GuidelinesUploadDocPage gp=new GuidelinesUploadDocPage(driver);
		UploadDocPage up=new UploadDocPage(driver);
		up.guidelines.click();
		Thread.sleep(3000);
		String actual=gp.GuideLineTitle.getText();
		String expected="Guidelines for Uploading Documents.";
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void verifyPageDescription() throws IOException, InterruptedException
	{
		appLaunch();
		GuidelinesUploadDocPage gp=new GuidelinesUploadDocPage(driver);
		UploadDocPage up=new UploadDocPage(driver);
		up.guidelines.click();
		Thread.sleep(3000);
		String actual=gp.GuideLineDescription.getText();
		String expected="Photgraphs of Child and Parents\n- Must be in a good quality and clear.\n- Only Passport photograph is acceptable.\n\nBirth Certificate\n\n- XXXXXXXXXXXXXXXXXXXXXXXXXXXX\n- XXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\nImage Sizes and Acceptable File Formats\n\n- XXXXXXXXXXXXXXXXXXXXXXXXXXXX\n- XXXXXXXXXXXXXXXXXXXXXXXXXXXX\n- XXXXXXXXXXXXXXXXXXXXXXXXXXXX\n- XXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n";
		System.out.println(actual);
		if(actual.contains(expected))
		{
			System.out.println("Discription is same");
		}
		else
		{
			System.out.println("Discription is not same");
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
