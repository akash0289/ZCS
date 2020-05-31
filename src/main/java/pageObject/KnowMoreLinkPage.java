package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class KnowMoreLinkPage {
	
	public KnowMoreLinkPage(AppiumDriver<AndroidElement> driver) 
	{
		
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	    //Know More link
		@AndroidFindBy(id="com.zcas:id/tvKnowMore")
		public WebElement knowmorelink;

	   //Close button
	   @AndroidFindBy(id="com.zcas:id/imgClose")
	   public WebElement closeButton;
	
	   //Title of page
	   @AndroidFindBy(id="com.zcas:id/tvTital")
	   public WebElement title;
	
	    //line 1 text
		@AndroidFindBy(xpath="android.widget.TextView[@text='Know more about ZCAS']")
		public WebElement textline1;
		
		//line 2 text
		@AndroidFindBy(xpath="android.widget.TextView[@text='Welcome to zamit Centralised Admissions Services.']")
		public WebElement textline2;
		
		//line 3 text
		@AndroidFindBy(xpath="android.widget.TextView[@text='You can start applying to choice of your schools in 4 simple steps.']")
		public WebElement textline3;
		
		//line 4 text
		@AndroidFindBy(xpath="android.widget.TextView[@text='Step 1 - Create a profile']")
		public WebElement textline4;
		
		//line 5 text
		@AndroidFindBy(xpath="android.widget.TextView[@text='Add details of the child & parent and upload documents']")
		public WebElement textline5;
		
		//line 6 text
		@AndroidFindBy(xpath="android.widget.TextView[@text='Step 2 - Search & Shortlist']")
		public WebElement textline6;
		
		//line 7 text
		@AndroidFindBy(xpath="android.widget.TextView[@text='Find schools of your choice or add from your bookmark']")
		public WebElement textline7;
		
		//line 8 text
		@AndroidFindBy(xpath="android.widget.TextView[@text='Step 3 - Final selection']")
		public WebElement textline8;
		
		//line 9 text
		@AndroidFindBy(xpath="android.widget.TextView[@text='Make your final selection of Schools']")
		public WebElement textline9;
		
		//line 10 text
		@AndroidFindBy(xpath="android.widget.TextView[@text='Step 4 - Confirm & Applu']")
		public WebElement textline10;
		
		//line 11 text
		@AndroidFindBy(xpath="android.widget.TextView[@text='Confirm your Applications & make final Payment']")
		public WebElement textline11;
		
		//line 12 text
		@AndroidFindBy(xpath="android.widget.TextView[@text='Fees and Charges']")
		public WebElement textline12;
		
		//line 13 text
		@AndroidFindBy(xpath="android.widget.TextView[@text='- There is a fixed charge of Rs. 250 for Profile Creation and completion of each child by a parent/user']")
		public WebElement textline13;
		
		//line 14 text
		@AndroidFindBy(xpath="android.widget.TextView[@text='- Other Fee Related information ca be shown here']")
		public WebElement textline14;
}
