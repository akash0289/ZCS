package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage1 {
	
	public HomePage1(AppiumDriver<AndroidElement> driver) 
	{
		
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Let's begin button
	@AndroidFindBy(id="com.zcas:id/btn_lets_begin")
	public WebElement letsbeginbtn;
	
	//Know More link
	@AndroidFindBy(id="com.zcas:id/tvKnowMore")
	public WebElement knowmore;
	
	//close button of know more link
	@AndroidFindBy(id="com.zcas:id/imgClose")
	public WebElement closebtn;
	
	
	public WebElement letsBegin() 
    {
    	//if you want to print this before nameField call so use this way or if you want some log
       System.out.println("find lets begin Button");
    	return letsbeginbtn;
    }
	
	public WebElement knowMore()
	{
		System.out.println("find know more link");
		return knowmore;
	}
	
	public WebElement closeButton()
	{
		System.out.println("close button of know more home page");
		return closebtn;
	}

}
