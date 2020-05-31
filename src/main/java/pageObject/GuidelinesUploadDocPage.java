package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GuidelinesUploadDocPage {

	AndroidDriver driver;
	public GuidelinesUploadDocPage(AppiumDriver driver) 
	{
		
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	  //Close button
	   @AndroidFindBy(id="com.zcas:id/ivGuideLinesClose")
	   public WebElement closebtn;
	   
	  //Guidelines page title
	   @AndroidFindBy(id="com.zcas:id/textGuideLineTitle")
	   public WebElement GuideLineTitle;
	   
	 //Guidelines page description
	   @AndroidFindBy(id="com.zcas:id/textGuideDescription")
	   public WebElement GuideLineDescription;
	   
	   
}
