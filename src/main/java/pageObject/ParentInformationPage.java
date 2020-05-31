package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ParentInformationPage {
	
	
		AndroidDriver driver;
		public ParentInformationPage(AppiumDriver driver) 
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
		
		//Parent information Page title
		@AndroidFindBy(id="com.zcas:id/tvHead")
		public WebElement ParentInformationTitle;
		
		//Parent first Name
		@AndroidFindBy(id="com.zcas:id/et_first_name")
		public WebElement PfirstName;
		
		//Parent last Name
		@AndroidFindBy(id="com.zcas:id/et_last_name")
		public WebElement PlastName;
		
		//Parent email Name
		@AndroidFindBy(id="com.zcas:id/et_email")
		public WebElement email;
		
		//Parent contact Number
		@AndroidFindBy(id="com.zcas:id/et_contact_number")
		public WebElement contacNumber;
		
		//Parent employment
		@AndroidFindBy(id="com.zcas:id/sp_empluyement")
		public WebElement employment;
		
		//Parent employment list
		@AndroidFindBy(className="android.widget.TextView")
		public List<AndroidElement> employmentlist;
		
		//Parent profession
		@AndroidFindBy(id="com.zcas:id/sp_profession")
		public WebElement profession;
		
		//Parent profession list
		@AndroidFindBy(id="com.zcas:id/txt_value")
		public List<AndroidElement> professionlist;
		
		
		
		//Preferred contact dropdown
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Yes']")
		public WebElement preferredcontact;
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='No']")
		public WebElement preferredcontactNo;
		
		//Parent professionS
		@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
		public WebElement preferredContactLabel;
		
		//Preferred contact list
		@AndroidFindBy(id="com.zcas:id/txt_value")
		public List<AndroidElement> preferredcontactlist;
		
		//Preferred contact textfield
		@AndroidFindBy(id="com.zcas:id/et_Pre_contact_number")
		public WebElement preferredcontacttextfield;
		
		//Next Step button
		@AndroidFindBy(id="com.zcas:id/btn_next_step")
		public WebElement nextStepbtn;
		
		//Pop-up message
		@AndroidFindBy(id="android:id/message")
		public WebElement popupmsg;
		
		//Pop-up message
		@AndroidFindBy(id="android:id/button1")
		public WebElement popupOkbtn;
		
		//Upload document page title
		@AndroidFindBy(id="com.zcas:id/textUploadTitle")
		public WebElement uploaddocpagetitle;
	
		//Back button
		@AndroidFindBy(id="com.zcas:id/iv_toolbar_back")
		public WebElement backBtn;
		
}
