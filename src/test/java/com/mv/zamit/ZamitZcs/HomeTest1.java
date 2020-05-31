package com.mv.zamit.ZamitZcs;

import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;

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

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.ChildsInformation;
import pageObject.HomePage1;

/**
 * Akash Shrivastava
 */

public class HomeTest1 extends Base1
{
	
	public static AndroidDriver<AndroidElement> driver;
	 
	@BeforeMethod
	public void startServer1()
	{
		service=startServer();
	}
	
	  
	
	  /* @Test
	   public void verifyImageIcon() throws IOException, InterruptedException
	   {

         appLaunch();
		 HomePage1 h=new HomePage1(driver);
		 boolean s= h.imageIcon.isDisplayed();
		 if(s)
		 {
			 System.out.println("Image is Present "+s);
		 }
		 else
		 {
			 System.out.println("Image is not Present");
		 }
	
	   }
	
	   @Test
	   public void verifyToolbarText1() throws IOException, InterruptedException
	   {

         appLaunch();
		 HomePage1 h=new HomePage1(driver);
		 String actual=h.toolbartext1.getText();
		 System.out.println(actual);
         String expected="ZCAS";
         Assert.assertEquals(actual, expected);
		 
	   }
	 
	   @Test
	   public void verifyToolbarText2() throws IOException, InterruptedException
	   {

         appLaunch();
		 HomePage1 h=new HomePage1(driver);
		 String actual=h.toolbartext2.getText();
		 System.out.println(actual);
         String expected="Introduction";
         Assert.assertEquals(actual, expected);
		 
	   }
	   
	   @Test
	   public void verifyWelcomeText() throws IOException, InterruptedException
	   {

         appLaunch();
		 HomePage1 h=new HomePage1(driver);
		 String actual=h.welcometext.getText();
		 System.out.println(actual);
         String expected="Welcome to";
         Assert.assertEquals(actual, expected);
		 }
	   
	   @Test
	   public void verifyWelcomeText1() throws IOException, InterruptedException
	   {

         appLaunch();
		 HomePage1 h=new HomePage1(driver);
		 String actual=h.welcometext1.getText();
		 System.out.println(actual);
         String expected="Zamit Centralised Admissions Services.";
         Assert.assertEquals(actual, expected);
         //h.welcometext1.getCssValue("font-size");
         
         }
	   
	   @Test
	   public void verifyWelcomeText2() throws IOException, InterruptedException
	   {

         appLaunch();
		 HomePage1 h=new HomePage1(driver);
		 String actual=h.welcometext2.getText();
		 System.out.println(actual);
         String expected="You can apply in choice of your school in few simple steps.";
         Assert.assertEquals(actual, expected);
		 }
	   
	   
	 @Test
	   public void verifyHelloUsername() throws IOException, InterruptedException
	   {

         appLaunch();
		 HomePage1 h=new HomePage1(driver);
		 String s= h.hellousername.getAttribute("text");
		 if(!s.isEmpty())
		 {
			 System.out.println("Text is "+s);
		 }
	
	   }
	   
	   @Test
	   public void verifyHomeScreenText() throws IOException, InterruptedException
	   {
		   appLaunch();
		   Thread.sleep(4000);
		 List <AndroidElement> list=driver.findElementsByClassName("android.widget.TextView");
		  
		// List <AndroidElement> list=b.knowMorePageText;
		   
		   for(int i=0;i<list.size();i++)
		    { 
			   if (list.get(i).getText()!= null) {
		    }
		        String SeenText = list.get(i).getText();
		        //System.out.println(SeenText);
		        
		        Collection listOne = new ArrayList(Arrays.asList("ZCAS","Introduction","Hello, Akshay!","Welcome to","Zamit Centralised Admissions Services.","You can apply in choice of your school in few simple steps.","Know more about ZCAS"));
		        Collection listTwo = new ArrayList(Arrays.asList(SeenText));

		        listOne.retainAll( listTwo );
		        System.out.println( listOne );
		        System.out.println(listOne.size());
		        System.out.println( listTwo );
		        System.out.println(listTwo.size());
		        listOne.equals(listTwo);
		        System.out.println("both are equal");
		        listTwo.containsAll(listOne);
		        System.out.println("both are equal2");
		        }
		   }
	
     @Test
	 public void verifyLetsBeginButton() throws IOException, InterruptedException
	 {
		 appLaunch();
		 System.out.println("App is launch");
		 
		 HomePage1 b= new HomePage1(driver);
		 b.letsBegin().click();
		 Thread.sleep(6000);
		 boolean s=b.selectyourchild.isDisplayed();
		 if(s)
		 {
		 
		 System.out.println("let's begin button is working");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		
		 }
	@Test
	 public void verifyBackButton() throws InterruptedException, IOException
	 {  
		 appLaunch();
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
		 appLaunch();
		 HomePage1 b= new HomePage1(driver);
		 b.knowMorelink().click();
		 String actual=b.knowmorepage.getText();
		 String expected="You can start applying to choice of your schools in 4 simple steps.";
		 Assert.assertEquals(actual, expected);
		 System.out.println("Know more link working fine");
		 
	 }*/
	 @Test
	   public void verifyKnowMoreScreenText() throws IOException, InterruptedException
	   {
		   appLaunch();
		   HomePage1 b= new HomePage1(driver);
		   b.knowmorelink.click();
		   Thread.sleep(4000);
		 List <AndroidElement> list=driver.findElementsByClassName("android.widget.TextView");
		  
		// List <AndroidElement> list=b.knowMorePageText;
		   
		   for(int i=0;i<list.size();i++)
		    { 
			   if (list.get(i).getText()!= null) {
		    }
		        String SeenText = list.get(i).getText();
		        //System.out.println(SeenText);
		        
		        Collection listOne = new ArrayList(Arrays.asList("ZCAS","Know more about ZCAS","Welcome to zamit Centralised Admissions Services.","You can start applying to choice of your schools in 4 simple steps.","Step 1 - Create a profile","Add details of the child & parent and upload documents","Step 2 - Search & Shortlist","Find schools of your choice or add from your bookmark","Step 3 - Final selection","Make your final selection of Schools","Step 4 - Confirm & Applu","Confirm your Applications & make final Payment","Fees and Charges","- There is a fixed charge of Rs. 250 for Profile Creation and completion of each child by a parent/user.","- Other Fee Related information ca be shown here.","- Other Fee Related information ca be shown here.","- Other Fee Related information ca be shown here."));
		        Collection listTwo = new ArrayList(Arrays.asList(SeenText));

		        listOne.retainAll( listTwo );
		        System.out.println( listOne );
		        System.out.println(listOne.size());
		        System.out.println( listTwo );
		        System.out.println(listTwo.size());
		        System.out.println(listOne.equals(listTwo));
		        System.out.println("both are equal");
		        listTwo.containsAll(listOne);
		        System.out.println("both are equal2");
		        }
		   }
	 
	 
		
	 //close button of know more page
	@Test
	 public void verifyClosebutton() throws IOException, InterruptedException
	 {
		 appLaunch();
		 HomePage1 btnk= new HomePage1(driver);
		 btnk.knowMorelink().click();
		 btnk.closeButton().click();
		 
	 }
	   
	   
	   public static void appLaunch() throws IOException, InterruptedException
	   {
		   driver =capabilities("zamitApp");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
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
