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
