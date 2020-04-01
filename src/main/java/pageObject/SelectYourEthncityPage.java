package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelectYourEthncityPage {
	
	AndroidDriver<AndroidElement> driver;
	public SelectYourEthncityPage(AppiumDriver<AndroidElement> driver) 
	{
		
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//child's information page back button
	@AndroidFindBy(id="com.zcas:id/et_search")
	public WebElement searchbox;
	
	
	public WebElement searchBox() {
		
		System.out.println("find search box element");
		return searchbox;
	}

}