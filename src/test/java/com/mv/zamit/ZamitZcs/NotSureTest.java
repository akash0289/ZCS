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
import pageObject.NotSurePage;
import pageObject.ParentInformationPage;
import pageObject.SearchAndSelectPage;
import pageObject.SelectYourChildProfile;
import pageObject.UploadDocPage;
import pageObject.ZamitSchoolFinderPage;

public class NotSureTest extends Base1 {

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
		NotSurePage np=new NotSurePage(driver);
		np.closebtn.click();
		UploadDocPage pg=new UploadDocPage(driver);
		String actual=pg.pageHeader.getText();
		System.out.println(actual);
		String expected="Please Upload\nRequired Documents!";
		Assert.assertEquals(actual, expected);
		System.out.println("Expected title is same as: "+actual);
	}
	@Test
	public void verifyImageIcon() throws IOException, InterruptedException
	{
		appLaunch();
		NotSurePage np=new NotSurePage(driver);
		if(np.imageIcon.isDisplayed())
		{
		System.out.println("Image is displayed on screen");
		}
		else
		{
		System.out.println("Image is not displayed on screen");
		}
	}
	
	@Test
	public void verifyPageTitle() throws IOException, InterruptedException
	{
		appLaunch();
		NotSurePage np=new NotSurePage(driver);
        String actual=np.NotSureTitle.getText();
		System.out.println(actual);
		String expected="Not sure where to apply?";
		Assert.assertEquals(actual, expected);
		System.out.println("Expected title is same as: "+actual);
	}
	
	@Test
	public void verifyPageDescription() throws IOException, InterruptedException
	{
		appLaunch();
		NotSurePage np=new NotSurePage(driver);
        String actual=np.NotSureDescription.getText();
		System.out.println(actual);
		String expected="Use our School finder tool to find\nthe best school for your Child.";
		Assert.assertEquals(actual, expected);
		System.out.println("Expected title is same as: "+actual);
	}
	@Test
	public void verifyLetsFindBtn() throws IOException, InterruptedException
	{
		appLaunch();
		NotSurePage np=new NotSurePage(driver);
		np.letsFindBtn.click();
		Thread.sleep(3000);
		ZamitSchoolFinderPage zp=new ZamitSchoolFinderPage(driver);
        String actual=zp.locationlabeltext.getText();
		System.out.println(actual);
		String expected="Enter your City / Location";
		Assert.assertEquals(actual, expected);
		System.out.println("Expected title is same as: "+actual+"Let's Find button is working fine");
	}
	
	@Test
	public void verifyORtext() throws IOException, InterruptedException
	{
		appLaunch();
		NotSurePage np=new NotSurePage(driver);
        String actual=np.OrText.getText();
		System.out.println(actual);
		String expected="Or";
		Assert.assertEquals(actual, expected);
		System.out.println("Expected title is same as: "+actual);
	}
	
	@Test
	public void verifyFindItManuallyBtn() throws IOException, InterruptedException
	{
		appLaunch();
		NotSurePage np=new NotSurePage(driver);
		np.FindManuallyBtn.click();
		Thread.sleep(3000);
		SearchAndSelectPage sp=new SearchAndSelectPage(driver);
        String actual=sp.pageTitle.getText();
		System.out.println(actual);
		String expected="Search and Select\nSchools you want to apply!";
		Assert.assertEquals(actual, expected);
		System.out.println("Expected title is same as: "+actual+"Let's Find button is working fine");
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
		 UploadDocPage g=new UploadDocPage(driver);
		 g.nextStepbtn.click();
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
