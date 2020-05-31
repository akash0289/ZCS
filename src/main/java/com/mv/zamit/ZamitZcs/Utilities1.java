package com.mv.zamit.ZamitZcs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.HomePage1;

public class Utilities1 extends Base1 {
	
	public static AndroidDriver<AndroidElement> driver;
		public Utilities1(AndroidDriver<AndroidElement> driver)
		{
			this.driver=driver;
		}
		
		//scroll page
		public void scrollToText(String Text)
		{
			/* MobileElement elementToClick = (MobileElement) driver
					    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
					        + ".resourceId(\"android:id/content\")).scrollIntoView("
					        + "new UiSelector().text(\"Text\"));");
					//elementToClick.click();*/
			
			MobileElement el = (MobileElement) driver
				    .findElementByAndroidUIAutomator("new UiScrollable("
				        + "new UiSelector().scrollable(true)).scrollIntoView("                      
				        + "new UiSelector().textContains(\"Text\"));");
			         el.click();
		}
		
		public void appLaunch() throws IOException, InterruptedException
		{
			driver =capabilities("zamitApp");
		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 //HomePage1 btnk= new HomePage1(driver);
			 //btnk.letsBegin().click();
			 
		}
		
		


}
