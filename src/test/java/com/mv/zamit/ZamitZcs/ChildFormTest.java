package com.mv.zamit.ZamitZcs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
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


public class ChildFormTest extends Base1 {

	
	public static AndroidDriver<AndroidElement> driver;
	
	
	        
	 
	@BeforeMethod
	public void startServer1()
	{
		service=startServer();
	}
	
	
	/*@Test
	public void verifyFormHeading() throws IOException, InterruptedException
	{
		 appLaunch();
		 ChildsInformation lg = new ChildsInformation(driver);

		String actualText=lg.formHeadingText().getText();
		System.out.println(lg);
		String expectedText="Enter your Child's Information!";
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Heading is same");
		
	}
		
	@Test
	public void verifySaveButtonText() throws IOException, InterruptedException
	{
		 appLaunch();
		 ChildsInformation lg = new ChildsInformation(driver);

		String actualText=lg.saveExitButton().getText();
		String expectedText="Save & Exit";
		Assert.assertEquals(actualText, expectedText);
		System.out.println(actualText);
	
	}
	
	@Test
	public void verifyFirstName() throws InterruptedException, IOException
	{
		 appLaunch();
		 ChildsInformation lg = new ChildsInformation(driver);
		 lg.fname.click();
		 Thread.sleep(4000);
		 
		 String sd= lg.fname.getText();
		 if(sd.contains("First Name")) {
			 System.out.println("First Name is visible");
		 }
		 if (driver.isKeyboardShown() )
		 { 
			 System.out.println("keyboard is visible");
			 
		 }
		 
		 lg.fname.sendKeys("Akash");
		 String d= lg.fname.getText();
		 if(d.contains("Akash")) {
			 System.out.println("Akash is visible");
		 }
	}
		 
		 @Test
			public void verifyLastName() throws InterruptedException, IOException
			{
				 appLaunch();
				 ChildsInformation lg = new ChildsInformation(driver);
				 lg.lastname.click();
				 Thread.sleep(4000);
				 
				 String sd= lg.lastname.getText();
				 if(sd.contains("Last Name")) {
					 System.out.println("Last Name is visible");
				 }
				 if (driver.isKeyboardShown() )
				 { 
					 System.out.println("keyboard is visible");
					 
				 }
				 
				 lg.lastname.sendKeys("Shrivastava");
				 String d= lg.lastname.getText();
				 if(d.contains("Shrivastava")) {
					 System.out.println("Shrivastava is visible");
				 }
		 
	}
	
	     @Test
	     public void verifyDateOfBirthMM() throws IOException, InterruptedException
	     {
	    	 appLaunch();
			 ChildsInformation lg = new ChildsInformation(driver);
			 lg.birth_mm.click();
			 Thread.sleep(4000);
			 
			 String ds= lg.birth_mm.getText();
			 if(ds.contains("MM")) {
				 System.out.println("MM is visible");
			 }
			 if (driver.isKeyboardShown() )
			 { 
				 System.out.println("keyboard is visible");
				 
			 }
			 
			 lg.birth_mm.sendKeys("10");
			 String d= lg.birth_mm.getText();
			 if(d.contains("10")) {
				 System.out.println("10 is visible");
			 }
	     }
	     @Test
	     public void verifyDateOfBirthDD() throws IOException, InterruptedException
	     {
	    	 appLaunch();
			 ChildsInformation lg = new ChildsInformation(driver);
			 lg.birth_dd.click();
			 Thread.sleep(4000);
			 
			 String ds= lg.birth_dd.getText();
			 if(ds.contains("DD")) {
				 System.out.println("DD is visible");
			 }
			 if (driver.isKeyboardShown() )
			 { 
				 System.out.println("keyboard is visible");
				 
			 }
			 
			 lg.birth_dd.sendKeys("31");
			 String d= lg.birth_dd.getText();
			 if(d.contains("31")) {
				 System.out.println("31 is visible");
			 }
	     }
	     
	     @Test
	     public void verifyDateOfBirthYY() throws IOException, InterruptedException
	     {
	    	 appLaunch();
			 ChildsInformation lg = new ChildsInformation(driver);
			 lg.birth_yy.click();
			 Thread.sleep(4000);
			 
			 String ds= lg.birth_yy.getText();
			 if(ds.contains("YYYY")) {
				 System.out.println("YYYY is visible");
			 }
			 if (driver.isKeyboardShown() )
			 { 
				 System.out.println("keyboard is visible");
				 
			 }
			 
			 lg.birth_yy.sendKeys("2019");
			 String d= lg.birth_dd.getText();
			 if(d.contains("2019")) {
				 System.out.println("2019 is visible");
			 }
	     }
	     
		 @Test
			public void verifyGenderButton() throws InterruptedException, IOException
			{
				 appLaunch();
				 ChildsInformation lg = new ChildsInformation(driver);
				String m= lg.genderDropDown().getText();
				if(m.contains("Male"))
				{
					System.out.println("Male option is selected");
					lg.genderDropDown().click();
					lg.femaleSelect().click();
					
				}
				String f=lg.femaleSelect().getText();
				 if(f.contains("Female"))
				 {
					 System.out.println("Female option is selected");
				 }
				 } 
				
				 
				 @Test
			public void verifyCitizenshipButton() throws InterruptedException, IOException
			{
				 appLaunch();
				 ChildsInformation lg = new ChildsInformation(driver);
				String m= lg.citizenshipDropDown().getText();
				if(m.contains("Citizenship"))
				{
					System.out.println("Citizenship option is selected");
					lg.citizenshipDropDown().click();
					lg.citizenshipvalue1.click();
					
				}
				String f=lg.citizenshipvalue1.getText();
				 if(f.contains("India"))
				 {
					 System.out.println("India option is selected");
					 lg.citizenshipvalue1.click();
					 Thread.sleep(3000);
						lg.citizenshipvalue2.click();
				 }
				 String f1=lg.citizenshipvalue2.getText();
				 if(f1.contains("Others"))
				 {
					 System.out.println("Others option is selected");
					 lg.citizenshipvalue2.click();
					 Thread.sleep(3000);
						lg.citizenshipvalue3.click();
				 }
				 String f2=lg.citizenshipvalue3.getText();
				 if(f2.contains("UK"))
				 {
					 System.out.println("UK option is selected");
				 }
				 }
	
	
	   @Test
	   public void verifyEthnicitydropdown() throws IOException, InterruptedException
	   {
		    appLaunch();
			ChildsInformation lg = new ChildsInformation(driver);
			String m= lg.ethnicityDropDown().getText();
			if(m.contains("Ethnicity"))
			{
				System.out.println("Ethnicity option is selected");
				lg.ethnicityDropDown().click();
				lg.ethnicitydropdown1.click();
				
			}
			String f=lg.ethnicitydropdown1.getText();
			 if(f.contains("India"))
			 {
				 System.out.println("India option is selected");
				 lg.ethnicitydropdown1.click();
				 Thread.sleep(3000);
					lg.ethnicitydropdown2.click();
			 }
			 String f1=lg.ethnicitydropdown2.getText();
			 if(f1.contains("Others"))
			 {
				 System.out.println("Others option is selected");
				 lg.ethnicitydropdown2.click();
				 Thread.sleep(3000);
					lg.ethnicitydropdown3.click();
			 }
			 String f2=lg.ethnicitydropdown3.getText();
			 if(f2.contains("UK"))
			 {
				 System.out.println("UK option is selected");
			 }
	   }
	
	    @Test
	    public void verifyChildLiveWithDropDown() throws IOException, InterruptedException
	    {
	    	 appLaunch();
			 ChildsInformation lg = new ChildsInformation(driver);
			String m= lg.childLiveWithDropDown().getText();
			if(m.contains("Mother"))
			{
				System.out.println("Mother option is selected");
				lg.childLiveWithDropDown().click();
				lg.childlivewith1.click();
				
			}
			String f=lg.childlivewith1.getText();
			 if(f.contains("Father"))
			 {
				 System.out.println("Father option is selected");
				 lg.childlivewith1.click();
				 Thread.sleep(3000);
					lg.childlivewith2.click();
			 }
			 String f1=lg.childlivewith2.getText();
			 if(f1.contains("Both Parents"))
			 {
				 System.out.println("Both Parents option is selected");
				 
			 }
	    }
	    
	
	   @Test
	   public void verifyAttendedPlaySchoolDropDown() throws IOException, InterruptedException
	   {
		    appLaunch();
			ChildsInformation lg = new ChildsInformation(driver);
			String m= lg.attendedplayschoolDropDown().getText();
			if(m.contains("Yes"))
			{
				System.out.println("Yes option is selected");
			}
			String d=lg.playschoolnameTextBox().getText();
			if(d.contains("Play School Name"))
			{
				System.out.println("Play School Name is visible");
					
			}
				
			MobileElement el = (MobileElement) driver
				    .findElementByAndroidUIAutomator("new UiScrollable("
				        + "new UiSelector().scrollable(true)).scrollIntoView("                      
				        + "new UiSelector().textContains(\"Play School Address\"));");
				
						
			String d1=lg.playschooladdressTextBox().getText();
			if(d1.contains("Play School Address"))
			{
				System.out.println("Play School Address is visible");
			}
				
			String d2=lg.playschoolcityTextBox().getText();
			if(d2.contains("City of Play School"))
			{
				System.out.println("City of Play School is visible");
			}
				
			String d3=lg.playschoolcountryTextBox().getText();
			if(d3.contains("Country of Play School"))
			{
				System.out.println("City of Play School is visible");
			}
				
			String d5=lg.fromDateTagName().getText();
			if(d5.contains("From Date"))
			{
				System.out.println("From Date tag name is visible");
				String d6=lg.fromdateBox().getText();
					
					
					if(d6.contains("DD"))
					{
						System.out.println("DD is visible");
					}
					
					String d7=lg.frommonthBox().getText();
					if(d7.contains("MM"))
					{
						System.out.println("MM is visible");
					}
					
					String d8=lg.fromyearBox().getText();
					if(d8.contains("YYYY"))
					{
						System.out.println("YYYY is visible");
					}
					
					System.out.println("From Date all fields are visible");
					
				}
				
			String d8=lg.ToDateTagName().getText();
			if(d8.contains("To Date"))
				{
					System.out.println("To Date tag name is visible");
					String d9=lg.TodateBox().getText();
					if(d9.contains("DD"))
					{
						System.out.println("DD is visible");
					}
					
					String d6=lg.TomonthBox().getText();
					if(d6.contains("MM"))
					{
						System.out.println("MM is visible");
					}
					
					String d7=lg.ToyearBox().getText();
					if(d7.contains("YYYY"))
					{
						System.out.println("YYYY is visible");
					}
					
					System.out.println("To Date all fields are visible");
					
				}
				
			
			
			lg.attendedplayschoolDropDown().click();
			lg.attendedplayschool1.click();
			String f=lg.attendedplayschool1.getText();
			 if(f.contains("No"))
			 {
				 System.out.println("No option is selected");
			 }
	  
	   
	
	   }
	   
	
	@Test
	public void verifyPlaySchoolNameField() throws IOException, InterruptedException
	{
		     appLaunch();
		      ChildsInformation lg = new ChildsInformation(driver);
			 String d=lg.playschoolnameTextBox().getText();
			 System.out.println(d);
			 if(d.contains("Play School Name"))
			 {
				 System.out.println("Play School Name field is visible");
			 }
			 if (driver.isKeyboardShown() )
			 { 
				 System.out.println("keyboard is visible");
				 
			 }
			 
			 lg.playschoolnameTextBox().sendKeys("Mash Virtual");
			 String d1= lg.playschoolnameTextBox().getText();
			 if(d.contains("Mash Virtual")) {
				 System.out.println("Mash Virtual is visible");
			 }
	}
	
	@Test
	public void verifyPlaySchoolAddressField() throws IOException, InterruptedException
	{
		     
		     appLaunch();
		     scrollTo();
             

			 ChildsInformation lg = new ChildsInformation(driver);
			 String d=lg.playschooladdressTextBox().getText();
			 System.out.println(d);
			 if(d.contains("Play School Address"))
			 {
				 System.out.println("Play School Address field is visible");
			 }
			 if (driver.isKeyboardShown() )
			 { 
				 System.out.println("keyboard is visible");
				 
			 }
			 
			 lg.playschooladdressTextBox().sendKeys("Sector 31");
			 String d1= lg.playschooladdress.getText();
			 System.out.println(d1);
			 if(d1.contains("Sector 31")) {
				 System.out.println("Sector 31 is visible");
			 }
	}
	  
	@Test
	public void verifyCityOfPlaySchoolField() throws IOException, InterruptedException
	{
		     
		     appLaunch();
		     scrollTo();
			 ChildsInformation lg = new ChildsInformation(driver);
			 String d=lg.playschoolcityTextBox().getText();
			 System.out.println(d);
			 if(d.contains("City of Play School"))
			 {
				 System.out.println("City of Play School field is visible");
			 }
			 if (driver.isKeyboardShown() )
			 { 
				 System.out.println("keyboard is visible");
				 
			 }
			 
			 lg.playschoolcityTextBox().sendKeys("Gurgaon,Haryana");
			 String d1= lg.playschoolcity.getText();
			 System.out.println(d1);
			 if(d1.contains("Gurgaon,Haryana")) {
				 System.out.println("Gurgaon,Haryana is visible");
			 }
	}
	 
	@Test
	public void verifyCountryOfPlaySchoolField() throws IOException, InterruptedException
	{
		     
		     appLaunch();
		     scrollTo();
			 ChildsInformation lg = new ChildsInformation(driver);
			 String d=lg.playschoolcountryTextBox().getText();
			 System.out.println(d);
			 if(d.contains("Country of Play School"))
			 {
				 System.out.println("Country of Play School field is visible");
			 }
			 if (driver.isKeyboardShown() )
			 { 
				 System.out.println("keyboard is visible");
				 
			 }
			 
			 lg.playschoolcountryTextBox().sendKeys("India");
			 String d1= lg.playschoolcountryTextBox().getText();
			 System.out.println(d1);
			 if(d.contains("India")) {
				 System.out.println("India is visible");
			 }
	}
	 
	@Test
	public void verifyFromDateField() throws IOException, InterruptedException
	{
		     appLaunch();
		     scrollTo();
			 ChildsInformation lg = new ChildsInformation(driver);
			 String d5=lg.fromDateTagName().getText();
			 System.out.println(d5);
				if(d5.contains("From Date"))
				{
					System.out.println("From Date tag name is visible");
					String d6=lg.frommonthBox().getText();
					System.out.println(d6);
						
						if(d6.contains("MM"))
						{
							System.out.println("MM is visible");
							lg.frommonth.sendKeys("12");
							String d7=lg.frommonth.getText();
							if(d7.contains("12"))
							{
								System.out.println("12 is visible");
							}
						}
						
						String d8=lg.fromdateBox().getText();
						System.out.println(d8);
						if(d8.contains("DD"))
						{
							System.out.println("DD is visible");
							lg.fromdd.sendKeys("31");
							String d9=lg.fromdd.getText();
							System.out.println(d9);
							if(d9.contains("31"))
							{
								System.out.println("31 is visible");
							}
						}
						
						String d10=lg.fromyearBox().getText();
						System.out.println(d10);
						if(d10.contains("YYYY"))
						{
							System.out.println("YYYY is visible");
							lg.fromyear.sendKeys("2020");
							String d11=lg.fromyear.getText();
							System.out.println(d11);
							if(d11.contains("2020"))
							{
								System.out.println("2020 is visible");
							}
						}
						
						System.out.println("From Date all fields are working fine");
						
					}
	}
	
	@Test
	public void verifyToDateField() throws IOException, InterruptedException
	{   

		appLaunch();
		scrollTo();
		ChildsInformation lg = new ChildsInformation(driver);
		String d5=lg.Todatetagname.getText();
		System.out.println(d5);
			if(d5.contains("To Date"))
				 {
					System.out.println("To Date tag name is visible");
					String d6=lg.TomonthBox().getText();
				    System.out.println(d6);
						
						if(d6.contains("MM"))
						{
							System.out.println("MM is visible");
							
							lg.Tomonth.sendKeys("11");
							String d7=lg.Tomonth.getText();
							System.out.println(d7);
							if(d7.contains("11"))
							{
								System.out.println("11 is visible");
							}
						}
						
						String d8=lg.TodateBox().getText();
						System.out.println(d8);
						if(d8.contains("DD"))
						{
							System.out.println("DD is visible");
							lg.Todd.sendKeys("31");
							String d9=lg.Todd.getText();
							System.out.println(d9);
							if(d9.contains("31"))
							{
								System.out.println("31 is visible");
							}
						}
						
						String d10=lg.ToyearBox().getText();
						System.out.println(d10);
						if(d10.contains("YYYY"))
						{
							System.out.println("YYYY is visible");
							lg.Toyear.sendKeys("2021");
							String d11=lg.Toyear.getText();
							System.out.println(d11);
							if(d11.contains("2021"))
							{
								System.out.println("2021 is visible");
							}
						}
						
						System.out.println("To Date all fields are working fine");
						
					}
	}
	
	
	@Test
	public void verifyNextButton() throws IOException, InterruptedException
	{
		appLaunch();
		ChildsInformation lg = new ChildsInformation(driver);
		
		lg.firstName().sendKeys("Ak1");
		lg.lastname.sendKeys("test");
		lg.birth_mm.sendKeys("02");
		lg.birth_dd.sendKeys("24");
		lg.birth_yy.sendKeys("2010");
		lg.citizenshipdropdown.click();
		lg.citizenshipvalue1.click();
		lg.ethnicitydropdown.click();
		SelectYourEthncityPage sl=new SelectYourEthncityPage(driver);
		sl.ethnicityvalue.get(0).click();
		sl.selectandcontinuebtn.click();
		lg.attendedplayschool.click();
		lg.attendedplayschool1.click();
		String s=lg.NextStep.getText();
		System.out.println(s);
		if(s.contains("Next Step"))
		{
			System.out.println("Next Step name is visible");
		}
		lg.NextStep.click();
		
		String s1 = lg.childformpopup.getText();
		
		if(s1.contains("Child profile saved successfully."))
		{
		System.out.println("Next Step button is clickable");
		}
		
	}
	
	@Test
	public void verifyOkButtonofPopup() throws IOException, InterruptedException
	{
		appLaunch();
		ChildsInformation lg = new ChildsInformation(driver);
		lg.firstName().sendKeys("Ak2");
		lg.lastname.sendKeys("test");
		lg.birth_mm.sendKeys("02");
		lg.birth_dd.sendKeys("24");
		lg.birth_yy.sendKeys("2010");
		lg.citizenshipdropdown.click();
		lg.citizenshipvalue1.click();
		lg.ethnicitydropdown.click();
		SelectYourEthncityPage sl=new SelectYourEthncityPage(driver);
		sl.ethnicityvalue.get(0).click();
		sl.selectandcontinuebtn.click();
		lg.attendedplayschool.click();
		lg.attendedplayschool1.click();
		lg.NextStep.click();
		lg.childformpopupok.click();
		ParentInformationPage p = new ParentInformationPage(driver);
		String s=p.ParentInformationTitle.getText();
		if(s.contains("Enter\nParent's Information!"))
		{
			System.out.println("OK button is working fine");
		}
	}
	 
	
	@Test
	public void verifyZcasToolBarText() throws IOException, InterruptedException
	{
		appLaunch();
		ChildsInformation pg = new ChildsInformation(driver);
		String actual=pg.zcastoolbartext.getText();
		String expected="ZCAS";
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		System.out.println("Zcas tool bar text is correct");
		
	}*/
	@Test
	public void verifySaveBtn() throws IOException, InterruptedException
	{
		driver =capabilities("zamitApp");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage1 btnk= new HomePage1(driver);
		btnk.letsBegin().click();
		Thread.sleep(10000);
		SelectYourChildProfile pg = new SelectYourChildProfile(driver);
		pg.childList.get(7).click();
		pg.continueBtn().click();
		Thread.sleep(4000);
		ChildsInformation cg = new ChildsInformation(driver);
		cg.saveexit.click();
		SaveMyAppPage ap=new SaveMyAppPage(driver);
		if(ap.pageHeader.isDisplayed())
		{
			System.out.println("Save button is working fine");
		}
		else
		{
			System.out.println("Save button is not working fine");
		}
		
		
	}
	@Test
	public void verifyToolBarStepText() throws IOException, InterruptedException
	{
		appLaunch();
		ChildsInformation pg = new ChildsInformation(driver);
		String actual=pg.toolbarsteptext.getText();
		String expected="Step 1 of 4";
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		System.out.println("Tool bar Step text is correct");
		
	}
	
		
	public static void appLaunch() throws IOException, InterruptedException
	{
		driver =capabilities("zamitApp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 HomePage1 btnk= new HomePage1(driver);
		 btnk.letsBegin().click();
		 Thread.sleep(10000);
		 ChildsInformation lg = new ChildsInformation(driver);
		 lg.createnewprofile.click();
		 Thread.sleep(4000);
		 
	}
	
	public static void scrollTo()
	{
		 MobileElement el = (MobileElement) driver
				    .findElementByAndroidUIAutomator("new UiScrollable("
				        + "new UiSelector().scrollable(true)).scrollIntoView("                      
				        + "new UiSelector().textContains(\"Play School Address\"));");
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

