package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UploadDocPage {

	AndroidDriver driver;
	public UploadDocPage(AppiumDriver driver)
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
	@AndroidFindBy(id="com.zcas:id/textUploadTitle")
	public WebElement pageHeader;
	
	//save & exit button
	@AndroidFindBy(id="com.zcas:id/txt_toolbar_save_exit")
	public WebElement saveexitbtn;
	
	//Guidelines
	@AndroidFindBy(id="com.zcas:id/textUploadGuidelines")
	public WebElement guidelines;
	
	//Child PhotoGraph
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")
	public WebElement childPhotograph;
	
	//Parent's Photograph
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView")
	public WebElement ParentPhotograph;
	
	//Proof of Residence Document
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView")
	public WebElement residenceDocument;
	
	//Child's Birth certificate
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
	public WebElement birthcertificate;
	
	//Back button
	@AndroidFindBy(id="com.zcas:id/iv_toolbar_back")
	public WebElement backBtn;
	
	//Next Step button
	@AndroidFindBy(id="com.zcas:id/btn_next_step")
	public WebElement nextStepbtn;
	
	
}
