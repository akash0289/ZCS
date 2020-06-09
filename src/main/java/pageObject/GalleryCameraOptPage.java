package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GalleryCameraOptPage {
	
	AndroidDriver driver;
	public GalleryCameraOptPage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	   //Close button of Gallery and Camera options
		@AndroidFindBy(id="com.zcas:id/iv_dialog_close")
		public WebElement closebtngalleryCamera;
		
		//Gallery options
		@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView")
		public WebElement galleryoption;
		
		//Gallery image
		@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.ImageView")
		public WebElement galleryicon;
		
		
		//Camera options
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Use Camera']")
		public WebElement Cameraoption;
		
		//Camera icon
		@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.ImageView")
		public WebElement Cameraicon;
		
		//mobile camera option
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Camera']")
		public WebElement mobcameraopt;
		
		//mobile file option
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Files']")
		public WebElement mobfileopt;
		
		//mobile photo option
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Photos']")
		public WebElement mobphotoopt;
		
		//select photo from files
		@AndroidFindBy(id="com.android.documentsui:id/icon_mime_lg")
		public WebElement mobselectphoto;
		
		//photo crop option
		@AndroidFindBy(id="com.zcas:id/crop_image_menu_crop")
		public WebElement cropphoto;
		
		//uploade ok options
		@AndroidFindBy(id="android:id/button1")
		public WebElement uploadokbtn;
		
		
}
