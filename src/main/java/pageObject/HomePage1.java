package pageObject;

import java.util.List;

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
	
	//verify image on home screen
	@AndroidFindBy(id="com.zcas:id/imgIcon")
	public WebElement imageIcon;
	
	// Hello username
	@AndroidFindBy(id="com.zcas:id/txtUser")
	public WebElement hellousername;
	
	//ToolbarText1
	@AndroidFindBy(className="android.widget.TextView")
	public WebElement toolbartext1;
	
	//ToolbarText1
	@AndroidFindBy(id="com.zcas:id/txt_toolbar_step")
	public WebElement toolbartext2;
	
	//Welcome text
	@AndroidFindBy(id="com.zcas:id/txtWelcome")
	public WebElement welcometext;
	
	//Welcome text1
	@AndroidFindBy(id="com.zcas:id/txtTitle")
	public WebElement welcometext1;
	
	//Welcome text2
	@AndroidFindBy(xpath="//android.widget.TextView[@text='You can apply in choice of your school in few simple steps.']")
	public WebElement welcometext2;
	
	//Let's begin button
	@AndroidFindBy(id="com.zcas:id/btn_lets_begin")
	public WebElement letsbeginbtn;
	
	//Know More link
	@AndroidFindBy(id="com.zcas:id/tvKnowMore")
	public WebElement knowmorelink;
	
	//Know More link
	@AndroidFindBy(xpath="//android.widget.TextView[@text='You can start applying to choice of your schools in 4 simple steps.']")
	public WebElement knowmorepage;
	
	//Know More Screen Text
	@AndroidFindBy(className="android.widget.TextView")
	public List<AndroidElement> knowMorePageText;
	
	//Select your child's profile text
	@AndroidFindBy(id="com.zcas:id/txtSelect")
	public WebElement selectyourchild;
	
	
	
	//close button of know more link
	@AndroidFindBy(id="com.zcas:id/imgClose")
	public WebElement closebtn;
	
	
	public WebElement letsBegin() 
    {
    	//if you want to print this before nameField call so use this way or if you want some log
       System.out.println("find lets begin Button");
    	return letsbeginbtn;
    }
	
	public WebElement knowMorelink()
	{
		System.out.println("find know more link");
		return knowmorelink;
	}
	
	public WebElement closeButton()
	{
		System.out.println("close button of know more home page");
		return closebtn;
	}

}
