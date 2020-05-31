package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SaveMyAppPage {

	
	AndroidDriver driver;
	
	public SaveMyAppPage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	   //Page Header
	   @AndroidFindBy(id="com.zcas:id/txtUser")
	   public WebElement pageHeader;
	   
	   //Page Text
	   @AndroidFindBy(id="com.zcas:id/txtProfileDis")
	   public WebElement pagetext;
	   
	   //Save My Application button
	   @AndroidFindBy(id="com.zcas:id/button")
	   public WebElement savemyappbtn;
	   
	  //Close button
	   @AndroidFindBy(id="com.zcas:id/ivClose")
	   public WebElement closebtn;
	   
	
}
