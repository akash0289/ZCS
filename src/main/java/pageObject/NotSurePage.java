package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NotSurePage {

	AndroidDriver driver;
	public NotSurePage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	   //Close button
	   @AndroidFindBy(id="com.zcas:id/ivSearchFinderClose")
	   public WebElement closebtn;
	   
	  //Image Icon
	   @AndroidFindBy(className="android.widget.ImageView")
	   public WebElement imageIcon;
	   
	  //NotSure page title
	   @AndroidFindBy(id="com.zcas:id/textNotSure")
	   public WebElement NotSureTitle;
	   
	  //NotSure page description
	   @AndroidFindBy(id="com.zcas:id/tvDesc")
	   public WebElement NotSureDescription;
	   
	   //lets Find Button
	   @AndroidFindBy(id="com.zcas:id/btnLestFind")
	   public WebElement letsFindBtn;
	   
	  //Find Manually Button
	   @AndroidFindBy(id="com.zcas:id/btnFindManually")
	   public WebElement FindManuallyBtn;
	   
	   //Or Text
	   @AndroidFindBy(id="com.zcas:id/txtOr")
	   public WebElement OrText;
	   
	   
}
