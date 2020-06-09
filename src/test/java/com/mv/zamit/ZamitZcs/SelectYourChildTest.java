package com.mv.zamit.ZamitZcs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableList;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.ChildsInformation;
import pageObject.HomePage1;
import pageObject.KnowMoreLinkPage;
import pageObject.SaveMyAppPage;
import pageObject.SelectYourChildProfile;

public class SelectYourChildTest extends Base1 {
	
	public static AndroidDriver<AndroidElement> driver;
	 
	   @BeforeMethod
	   public void startServer1()
	  {
		 service=startServer();
	   }
	
	 /*  @Test
	   public void verifySelectYourChildText() throws IOException, InterruptedException
	   {
		   appLaunch();
		   Thread.sleep(4000);
		
		   
     List <AndroidElement> list=driver.findElementsByClassName("android.widget.TextView");
		   
		   for(int i=0;i<list.size();i++)
		    { 
			   if (list.get(i).getText()!= null) {
		    }
		        String SeenText = list.get(i).getText();
		        System.out.println(SeenText);
		        //System.out.println(SeenText.codePointCount(0, i));
		        System.out.println(SeenText.length());
		       
		  
		        }
		   
		     }*/
	   @Test
		public void verifyZcasToolBarText() throws IOException, InterruptedException
		{
			appLaunch();
			SelectYourChildProfile pg=new SelectYourChildProfile(driver);
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
			SelectYourChildProfile pg=new SelectYourChildProfile(driver);
			String actual=pg.toolbarsteptext.getText();
			String expected="Step 1 of 4";
			System.out.println(actual);
			Assert.assertEquals(actual, expected);
			System.out.println("Tool bar Step text is correct");
			
		}
		
		@Test
		public void verifyBackBtn() throws IOException, InterruptedException
		{
			appLaunch();
			SelectYourChildProfile pg=new SelectYourChildProfile(driver);
			pg.backBtn.click();
			HomePage1 ch=new HomePage1(driver);
			if(ch.letsbeginbtn.isDisplayed())
			{
				System.out.println("Back button is working fine");
			}
			else
			{
				System.out.println("Back button is not working fine");
			}
		}
		
		
		
		@Test
		public void verifyPageTitle() throws IOException, InterruptedException
		{
			appLaunch();
			SelectYourChildProfile pg=new SelectYourChildProfile(driver);
			String actual=pg.pageTitle.getText();
			System.out.println(actual);
			String expected="Select your Child's Profile";
			Assert.assertEquals(actual, expected);
			System.out.println("Display String is :"+actual);
		}
		@Test
		public void verifyPagedescription() throws IOException, InterruptedException
		{
			appLaunch();
			SelectYourChildProfile pg=new SelectYourChildProfile(driver);
			String actual=pg.pagedescription.getText();
			System.out.println(actual);
			String expected="You can select your child's profile to view his/her ZCAS application status or create a new profile and start a new ZCAS application.";
			Assert.assertEquals(actual, expected);
			System.out.println("Display String is :"+actual);
		}
	   
	   
	   @Test
	   public void verifyCreateProfileBtn() throws IOException, InterruptedException
	   {
		   appLaunch();
		   Thread.sleep(4000);
		   SelectYourChildProfile u=new SelectYourChildProfile(driver);
		  String actual= u.createProfileBtn().getAttribute("text");
		  System.out.println(actual);
		  String expected="Create New Profile";
		  Assert.assertEquals(actual, expected);
		  u.createProfileBtn().click();
		  String t=u.selectyourchildtext.getText();
		  System.out.println(t);
		  if(t.contains("Enter your\nChild's Information!"))
		  {
			  System.out.println(expected + " button is working fine");
		  }
		  else
		  {
			  System.out.println(expected + " button is not working fine");
		  }
		   
		   
		  }
	   
	   @Test
	   public void verifyContinueBtn() throws IOException, InterruptedException
	   {
		   appLaunch();
		   Thread.sleep(4000);
		   SelectYourChildProfile u=new SelectYourChildProfile(driver);
		   u.childList.get(7).click();
		   u.Continuebtn.click();
		   ChildsInformation k=new ChildsInformation(driver);
		   String t=k.formHeadingText().getText();
			  System.out.println(t);
			  if(t.contains("Enter AkaTesttt`s Information"))
			  {
				  System.out.println("Continue button is working fine: "+t);
			  }
			  else
			  {
				  System.out.println("Continue button is not working fine: "+t);
			  }
	   }

	
	 public static void appLaunch() throws IOException, InterruptedException
	   {
		   driver =capabilities("zamitApp");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   HomePage1 h=new HomePage1(driver);
		   h.letsbeginbtn.click();
		   
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
