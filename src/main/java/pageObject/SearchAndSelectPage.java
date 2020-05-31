package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchAndSelectPage {
	
	AndroidDriver driver;
	public SearchAndSelectPage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	    //ZCAS tool bar
	    @AndroidFindBy(xpath="//android.widget.TextView[@text='ZCAS']")
	    public WebElement zcastoolbartext;
	
	    //Step text tool bar
		@AndroidFindBy(id="com.zcas:id/txt_toolbar_step")
		public WebElement toolbarsteptext;
		
		//save & exit button
		@AndroidFindBy(id="com.zcas:id/txt_toolbar_save_exit")
		public WebElement saveexitbtn;
				
		//Page Title
		@AndroidFindBy(id="com.zcas:id/textSearchSelectTile")
		public WebElement pageTitle;
		
		
		
		//School search box
		@AndroidFindBy(id="com.zcas:id/etSearchSchool")
		public WebElement schoolsearchbox;
		
		//description for detect my location
		@AndroidFindBy(id="com.zcas:id/ivClear")
		public WebElement clearoptioninSearchbox;
		
		//No data text
		 @AndroidFindBy(xpath="//android.widget.TextView[@text='Please search for school.']")
		 public WebElement nodatatext;
		
		//Filter button
		@AndroidFindBy(id="com.zcas:id/textFilter")
		public WebElement filterBtn;
		
		//NearBy 5KM
		@AndroidFindBy(id="com.zcas:id/textNearBy")
		public WebElement NearBy;
		
		//BookMarks
		@AndroidFindBy(id="com.zcas:id/textBookMark")
		public WebElement bookmarks;
		
		//Moreoption
		@AndroidFindBy(id="com.zcas:id/ivMore")
		public WebElement Moreoption;
		
		//Moreoption
		@AndroidFindBy(id="com.zcas:id/textSchoolSelected")
		public WebElement selectedschoolsnum;
		
		
		//SchoolFeeLabelText
		@AndroidFindBy(id="com.zcas:id/textSchoolFeeTitle")
		public WebElement SchoolFeeLabelText;
		
		//Schoolcheckbox
		@AndroidFindBy(id="com.zcas:id/cbSearchSelect")
		public WebElement Schoolcheckbox;
		
		//Back button
		@AndroidFindBy(id="com.zcas:id/iv_toolbar_back")
		public WebElement backBtn;
		
		//Next Step button
		@AndroidFindBy(id="com.zcas:id/btn_next_step")
		public WebElement nextStepbtn;

}
