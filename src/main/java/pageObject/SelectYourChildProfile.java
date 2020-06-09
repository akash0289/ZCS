package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelectYourChildProfile {
	
	
	public SelectYourChildProfile(AppiumDriver<AndroidElement> driver) 
	{
		
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	    //ZCAS tool bar
        @AndroidFindBy(xpath="//android.widget.TextView[@text='ZCAS']")
        public WebElement zcastoolbartext;

        //Step text tool bar
	    @AndroidFindBy(id="com.zcas:id/txt_toolbar_step")
	    public WebElement toolbarsteptext;
	
	    //back button
	    @AndroidFindBy(id="com.zcas:id/iv_toolbar_back")
	    public WebElement backBtn;
			
	   //Page Title
	   @AndroidFindBy(id="com.zcas:id/txtSelect")
	    public WebElement pageTitle;
	   
	 //Page description
	   @AndroidFindBy(id="com.zcas:id/txtProfileDis")
	    public WebElement pagedescription;
	   
	    //Create New Profile
	    @AndroidFindBy(className="android.widget.RadioButton")
	    public List<WebElement> childList;
	
	    //Create New Profile
		@AndroidFindBy(id="com.zcas:id/btnCreateProfile")
		public static WebElement CreateProfilebtn;
		
		//Continue Button
		@AndroidFindBy(id="com.zcas:id/btnContinue")
		public static WebElement Continuebtn;
		
		//select your child profile text
		@AndroidFindBy(id="com.zcas:id/tvHead")
		public static WebElement selectyourchildtext;

		
		public static WebElement createProfileBtn()
		{
			System.out.println("CreateProfile Locator is find");
			return CreateProfilebtn;
		}
		
		public static WebElement continueBtn()
		{
			System.out.println("CreateProfile Locator is find");
			return Continuebtn;
		}
}
