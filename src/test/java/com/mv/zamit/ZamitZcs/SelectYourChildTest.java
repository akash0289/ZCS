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
import pageObject.HomePage1;
import pageObject.KnowMoreLinkPage;
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
