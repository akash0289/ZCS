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
import pageObject.GalleryCameraOptPage;
import pageObject.GuidelinesUploadDocPage;
import pageObject.HomePage1;
import pageObject.NotSurePage;
import pageObject.ParentInformationPage;
import pageObject.SaveMyAppPage;
import pageObject.SelectYourChildProfile;
import pageObject.UploadDocPage;

public class UploadDocTest extends Base1 {
	
	public static AndroidDriver<AndroidElement> driver;
	
	
    
	 
	@BeforeMethod
	public void startServer1()
	{
		service=startServer();
	}
	
	
	
	/*@Test
	public void verifyZcasToolBarText() throws IOException, InterruptedException
	{
		appLaunch();
		UploadDocPage pg=new UploadDocPage(driver);
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
		UploadDocPage pg=new UploadDocPage(driver);
		String actual=pg.toolbarsteptext.getText();
		String expected="Step 1 of 4";
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		System.out.println("Tool bar Step text is correct");
		
	}*/
	
	/*@Test
	public void verifyBackBtn() throws IOException, InterruptedException
	{
		appLaunch();
		UploadDocPage pg=new UploadDocPage(driver);
		pg.backBtn.click();
		ParentInformationPage ch=new ParentInformationPage(driver);
		if(ch.ParentInformationTitle.isDisplayed())
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
		UploadDocPage pg=new UploadDocPage(driver);
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
		UploadDocPage pg=new UploadDocPage(driver);
		String actual=pg.pageHeader.getText();
		System.out.println(actual);
		String expected="Please Upload\nRequired Documents!";
		Assert.assertEquals(actual, expected);
		System.out.println("Display String is :"+actual);
	}
	
	@Test
	public void verifyGuidelinesBtn() throws IOException, InterruptedException
	{
		appLaunch();
		UploadDocPage pg=new UploadDocPage(driver);
		pg.guidelines.click();
		Thread.sleep(3000);
		GuidelinesUploadDocPage gd=new GuidelinesUploadDocPage(driver);
		String actual=gd.GuideLineTitle.getText();
		System.out.println("Page title is: "+actual);
		String expected="Guidelines for Uploading Documents.";
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test
	public void verifyNextStepBtn() throws IOException, InterruptedException
	{
		appLaunch();
		UploadDocPage pg=new UploadDocPage(driver);
		pg.nextStepbtn.click();
		Thread.sleep(3000);
		NotSurePage np=new NotSurePage(driver);
		String actual=np.NotSureTitle.getText();
		if(actual.contains("Not sure where to apply?"))
		{
			System.out.println("Next Step button is working fine");
		}
		else
		{
			System.out.println("Next step button is not working fine and Page title is: "+actual);
		}
	}
	@Test
	public void verifyChildBirthCertificateText() throws IOException, InterruptedException
	{
		appLaunch();
		UploadDocPage pg=new UploadDocPage(driver);
		
		
		//Verify Name of certificates
		String actual=pg.birthcertificate.getText();
		System.out.println("Certificate name is: "+actual);
		String expected="Child's Birth Certificate";
		Assert.assertEquals(actual, expected);
		//Verify birth certificate click options
		
		
		}
	@Test
	public void verifyChildPhotographText() throws IOException, InterruptedException
	{
		appLaunch();
		UploadDocPage pg=new UploadDocPage(driver);
		
		
		//Verify Name of certificates
		String actual=pg.childPhotograph.getText();
		System.out.println("Certificate name is: "+actual);
		String expected="Child's Photograph";
		Assert.assertEquals(actual, expected);
		//Verify birth certificate click options
		
		
		}
	@Test
	public void verifyParentPhotographText() throws IOException, InterruptedException
	{
		appLaunch();
		UploadDocPage pg=new UploadDocPage(driver);
		
		
		//Verify Name of certificates
		String actual=pg.ParentPhotograph.getText();
		System.out.println("Certificate name is: "+actual);
		String expected="Parent's Photograph";
		Assert.assertEquals(actual, expected);
		//Verify birth certificate click options
		}
	*/
	@Test
	public void verifyResidanceDocText() throws IOException, InterruptedException
	{
		appLaunch();
		UploadDocPage pg=new UploadDocPage(driver);
		
		
		//Verify Name of certificates
		String actual=pg.residenceDocument.getText();
		System.out.println("Certificate name is: "+actual);
		String expected="Proof of Residence\nDocument";
		Assert.assertEquals(actual, expected);
		//Verify birth certificate click options
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
