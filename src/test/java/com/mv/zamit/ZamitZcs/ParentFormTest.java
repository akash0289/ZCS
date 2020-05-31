package com.mv.zamit.ZamitZcs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.ChildsInformation;
import pageObject.HomePage1;
import pageObject.ParentInformationPage;
import pageObject.SaveMyAppPage;
import pageObject.SelectYourChildProfile;
import pageObject.SelectYourEthncityPage;

public class ParentFormTest extends Base1 {

	public static AndroidDriver<AndroidElement> driver;
	
	
    
	 
	@BeforeMethod
	public void startServer1()
	{
		service=startServer();
	}
	
	
	/*@Test
	public void verifyPageTitle() throws IOException, InterruptedException
	{
		appLaunch();
		ParentInformationPage pg=new ParentInformationPage(driver);
		String actual=pg.ParentInformationTitle.getText();
		if(actual.contains("Enter\nParent's Information!"))
		{
			System.out.println("Title is "+actual);
		}
		else
		{
			System.out.println("Title is not same");
		}
		
		
		}*/
	
	/*@Test
	public void verifyFirstName() throws InterruptedException, IOException
	{
		appLaunch();
		ParentInformationPage pg=new ParentInformationPage(driver);
		pg.PfirstName.clear();
		pg.PfirstName.click();
		 Thread.sleep(4000);
		 
		 String sd= pg.PfirstName.getText();
		 if(sd.contains("First Name")) {
			 System.out.println(sd +" placeholder is visible");
		 }
		 if (driver.isKeyboardShown() )
		 { 
			 System.out.println("keyboard is visible");
			 
		 }
		 
		 pg.PfirstName.sendKeys("Akash");
		 String d= pg.PfirstName.getText();
		 if(d.contains("Akash")) {
			 System.out.println("Akash is visible");
		 }
	}
	@Test
	public void verifyLastName() throws InterruptedException, IOException
	{
		appLaunch();
		ParentInformationPage pg=new ParentInformationPage(driver);
		pg.PlastName.clear();
		pg.PlastName.click();
		 Thread.sleep(4000);
		 
		 String sd= pg.PlastName.getText();
		 if(sd.contains("Last Name")) {
			 System.out.println(sd +" placeholder is visible");
		 }
		 if (driver.isKeyboardShown() )
		 { 
			 System.out.println("keyboard is visible");
			 
		 }
		 
		 pg.PlastName.sendKeys("TestFather");
		 String d= pg.PlastName.getText();
		 if(d.contains("TestFather")) {
			 System.out.println(d+" is visible");
		 }
	}
	@Test
	public void verifyEmailField() throws InterruptedException, IOException
	{
		appLaunch();
		ParentInformationPage pg=new ParentInformationPage(driver);
		pg.email.clear();
		pg.email.click();
		 Thread.sleep(4000);
		 
		 String sd= pg.email.getText();
		 if(sd.contains("Email")) {
			 System.out.println(sd +" placeholder is visible");
		 }
		 if (driver.isKeyboardShown() )
		 { 
			 System.out.println("keyboard is visible");
			 
		 }
		 
		 pg.email.sendKeys("akash.mv@gmail.com");
		 String d= pg.email.getText();
		 if(d.contains("akash.mv@gmail.com")) {
			 System.out.println(d+" is visible");
		 }
	}
	
	@Test
	public void verifyContactNumberField() throws InterruptedException, IOException
	{
		appLaunch();
		ParentInformationPage pg=new ParentInformationPage(driver);
		pg.contacNumber.clear();
		pg.contacNumber.click();
		 Thread.sleep(4000);
		 
		 String sd= pg.contacNumber.getText();
		 if(sd.contains("Contact Number")) {
			 System.out.println(sd +" placeholder is visible");
		 }
		 if (driver.isKeyboardShown() )
		 { 
			 System.out.println("keyboard is visible");
			 
		 }
		 
		 pg.contacNumber.sendKeys("8765432198");
		 String d= pg.contacNumber.getText();
		 if(d.contains("8765432198")) {
			 System.out.println(d+" is visible");
		 }
	}*/

	/*@Test
	public void verifyEmploymentDropdown() throws InterruptedException, IOException
	{
		appLaunch();
		ParentInformationPage pg=new ParentInformationPage(driver);
		pg.employment.click();
		 scrollTo1();
		 List <AndroidElement> list=driver.findElementsByClassName("android.widget.TextView");
			   
			   for(int i=0;i<list.size();i++)
			    { 
				   if (list.get(i).getText()!= null) {
			    }
			        String SeenText = list.get(i).getText();
    	          if (SeenText.matches("Employment|FICCI & ASSOCHAM|Government|Homemaker|Not Employed|Others|Owners|Partners & Directors of companies which are members of CII|Private|PSU"))
		        {
		           System.out.println(SeenText);
		        }
		        else
		        {
		        	System.out.println("This is not in list : "+SeenText);
		        }
    	  //Collection listTwo = new ArrayList(Arrays.asList("Employement","FICCI & ASSOCHAM","Government","Homemaker","Not Employed","Others","Owners","Partners & Directors of companies which are members of CII","Private","PSU"));
    	  
    	      }
              pg.employmentlist.get(9).click();
              pg.employment.click();
		      scrollTo();
		      List listactual2=driver.findElements(By.className("android.widget.TextView"));
             for(int i=0;i<listactual2.size();i++)
            {
   	  
   	         String SeenText = list.get(i).getText();
   	         if (SeenText.matches("Others|Owners|Partners & Directors of companies which are members of CII|Private|PSU|Retired Government Servant|Retired-Private Service|Self Employed|Statutory Body|Student"))
		        {
		           System.out.println(SeenText);
		        }
		        else
		        {
		        	System.out.println("This is not in list : "+SeenText);
		        }
	      // Collection listTwo = new ArrayList(Arrays.asList("Others","Owners","Partners & Directors of companies which are members of CII","Private","PSU","Retired Government Servant","Retired-Private Service","Self Employed","Statutory Body","Student"));
	       
	       }
     
      
	}
	
	@Test
	public void verifyProfessiondropdown() throws IOException, InterruptedException
	{
		appLaunch();
		ParentInformationPage pg=new ParentInformationPage(driver);
		pg.profession.click();
		Thread.sleep(4000);
		
		List <AndroidElement> list=driver.findElementsByClassName("android.widget.TextView");
		  
		// List <AndroidElement> list=b.knowMorePageText;
		   
		   for(int i=0;i<list.size();i++)
		    { 
			   
		        String SeenText = list.get(i).getText();
		        if (SeenText.matches("Profession|accountant|actor|architect|banker|carpenter"))
		        {
		           System.out.println(SeenText);
		        }
		        else
		        {
		        	System.out.println("This is not in list : "+SeenText);
		        }
		   
		       
		    }
	}
	@Test
	public void verifyPreferredContact() throws IOException, InterruptedException
	{
		appLaunch();
		ParentInformationPage pg=new ParentInformationPage(driver);
		String s=pg.preferredContactLabel.getText();
		if(s.contains("Preferred\nContact"))
		{
			System.out.println("Label is correct: "+s);
		}
		else
		{
			System.out.println("Label spelling is not same: "+s);
		}
		pg.preferredcontactNo.click();
		Thread.sleep(4000);
		List <AndroidElement> list=driver.findElementsByClassName("android.widget.TextView");
		for(int i=0;i<list.size();i++)
	    { 
		   
	        String SeenText = list.get(i).getText();
	        if (SeenText.matches("Yes|No"))
	        {
	           System.out.println(SeenText);
	        }
	        else
	        {
	        	System.out.println("This is not in list : "+SeenText);
	        }
	   }
		pg.preferredcontact.click();
		Thread.sleep(4000);
		if(pg.preferredcontacttextfield.isDisplayed())
		{
			System.out.println("Yes option is working");
		}
		else
		{
			System.out.println("Yes option is not working");
		}
		
		pg.preferredcontacttextfield.clear();
		pg.preferredcontacttextfield.sendKeys("9876544262");
		String s2=pg.preferredcontacttextfield.getText();
		if(s2.contains("9876544262")) 
		{
			System.out.println("Preferred contact text field is editable");
		}
		else
		{
			System.out.println("Preferred contact text field is non-editable");
		}
		pg.preferredcontact.click();
		Thread.sleep(3000);
		pg.preferredcontactNo.click();
		Thread.sleep(3000);
		String s1=pg.preferredcontactNo.getText();
		System.out.println(s1);
		if(s1.contains("No"))
		{
			System.out.println("No Option is selected");
		}
		else
		{
			System.out.println("No Option is not selected");
		}
		try {
		
		if(pg.preferredcontacttextfield.isDisplayed())
		{
			System.out.println("No option is working fine");
		}
		else
		{
			System.out.println("No option is not working fine");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		}
	
	@Test
	public void verifyNextStepButton() throws IOException, InterruptedException
	{
		appLaunch();
		ParentInformationPage pg=new ParentInformationPage(driver);
		String btn=pg.nextStepbtn.getText();
		if(btn.contains("Next Step"))
		{
			System.out.println("Button text is: "+btn);
		}
		else
		{
			System.out.println("Button text is not same: "+btn);
		}
		pg.contacNumber.clear();
		pg.contacNumber.sendKeys("9876453983");
		driver.hideKeyboard();
		pg.nextStepbtn.click();
		Thread.sleep(3000);
		String msg=pg.popupmsg.getText();
		if(msg.contains("Parent profile updated successfully."))
		{
			System.out.println("Next button is working fine");
		}
		else
		{
			System.out.println("Next button is not working fine and Message is: "+msg);
		}
		
		
	}
	@Test
	public void verifySaveBtn() throws IOException, InterruptedException
	{
		appLaunch();
		ParentInformationPage pg=new ParentInformationPage(driver);
		pg.contacNumber.clear();
		pg.contacNumber.sendKeys("4567898765");
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
	}*/
	
	@Test
	public void verifyBackBtn() throws IOException, InterruptedException
	{
		appLaunch();
		ParentInformationPage pg=new ParentInformationPage(driver);
		pg.backBtn.click();
		ChildsInformation ch=new ChildsInformation(driver);
		if(ch.formHeading.isDisplayed())
		{
			System.out.println("Back button is working fine");
		}
		else
		{
			System.out.println("Back button is not working fine");
		}
	}
	
	/*@Test
	public void verifyZcasToolBarText() throws IOException, InterruptedException
	{
		appLaunch();
		ParentInformationPage pg=new ParentInformationPage(driver);
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
		ParentInformationPage pg=new ParentInformationPage(driver);
		String actual=pg.toolbarsteptext.getText();
		String expected="Step 1 of 4";
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		System.out.println("Tool bar Step text is :"+actual);
		
	}
	
	@Test
	public void verifyPopupOkBtn() throws IOException, InterruptedException
	{
		appLaunch();
		ParentInformationPage pg=new ParentInformationPage(driver);
		pg.contacNumber.clear();
		pg.contacNumber.sendKeys("98765478276");
		pg.nextStepbtn.click();
		Thread.sleep(3000);
		pg.popupOkbtn.click();
		Thread.sleep(3000);
		String up=pg.uploaddocpagetitle.getText();
		if(up.contains("Please Upload\nRequired Documents!"))
		{
			System.out.println("Ok button is working fine");
		}
		else
		{
			System.out.println("Ok button is not working fine and page title: "+up);
		}
	}*/
	
	
	
	public static void scrollTo1() throws InterruptedException
	{
		MobileElement el = (MobileElement) driver
			    .findElementByAndroidUIAutomator("new UiScrollable("
			        + "new UiSelector().scrollable(true)).scrollIntoView("                      
			        + "new UiSelector().textContains(\"Employement\"));");
			//elementToClick.click();
		}
	public static void scrollTo() throws InterruptedException
	{
		MobileElement el = (MobileElement) driver
			    .findElementByAndroidUIAutomator("new UiScrollable("
			        + "new UiSelector().scrollable(true)).scrollIntoView("                      
			        + "new UiSelector().textContains(\"Student\"));");
			//elementToClick.click();
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
