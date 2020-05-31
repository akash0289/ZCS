package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ZamitSchoolFinderPage {

	AndroidDriver driver;
	public ZamitSchoolFinderPage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	    //ZCAS tool bar
	    @AndroidFindBy(xpath="//android.widget.TextView[@text='ZCAS']")
	    public WebElement zcastoolbartext;
	
	    //Step text tool bar
		@AndroidFindBy(id="com.zcas:id/txt_toolbar_step")
		public WebElement toolbarsteptext;
				
		//Page Header
		@AndroidFindBy(id="com.zcas:id/tv_user")
		public WebElement pageHeader;
		
		//Page sub Header
		@AndroidFindBy(id="com.zcas:id/textView4")
		public WebElement pagesubHeader;
		
		//city/location label text
		@AndroidFindBy(id="com.zcas:id/textView1")
		public WebElement locationlabeltext;
		
		//city/location search box
		@AndroidFindBy(id="com.zcas:id/et_search")
		public WebElement locationsearchbox;
		
		//description for detect my location
		@AndroidFindBy(id="com.zcas:id/textView5")
		public WebElement detectLocaDescription;
		
		//detect my location btn
		@AndroidFindBy(id="com.zcas:id/tvDelectLocation")
		public WebElement detectLocaBtn;
				
		//Back button
		@AndroidFindBy(id="com.zcas:id/iv_toolbar_back")
		public WebElement backBtn;
		
		//Continue button
		@AndroidFindBy(id="com.zcas:id/btn_continue")
		public WebElement continuebtn;
}
