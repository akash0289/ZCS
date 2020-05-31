package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChildsInformation {
	AndroidDriver driver;
	public ChildsInformation(AppiumDriver driver) 
	{
		
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//ZCAS tool bar
	@AndroidFindBy(xpath="//android.widget.TextView[@text='ZCAS']")
	public WebElement zcastoolbartext;
			
	//Step text tool bar
	@AndroidFindBy(id="com.zcas:id/txt_toolbar_step")
	public WebElement toolbarsteptext;
	
	//child's information page back button
	@AndroidFindBy(id="com.zcas:id/iv_toolbar_back")
	public WebElement backbtn;
	
	//child's information save button
	@AndroidFindBy(id="com.zcas:id/txt_toolbar_save_exit")
	public WebElement saveexit;
	
	//Form heading
	@AndroidFindBy(id="com.zcas:id/tvHead")
	public WebElement formHeading;
	
	//first name
	@AndroidFindBy(id="com.zcas:id/et_fname")
	public WebElement fname;
	
	//Last Name
	@AndroidFindBy(id="com.zcas:id/et_last_name")
	public WebElement lastname;
	
	//birth month
	@AndroidFindBy(id="com.zcas:id/et_birth_mm")
	public WebElement birth_mm;
	
	//birth date
	@AndroidFindBy(id="com.zcas:id/et_birth_dd")
	public WebElement birth_dd;
	
	//birth year
	@AndroidFindBy(id="com.zcas:id/et_birth_yyyy")
	public WebElement birth_yy;
	
	//gender dropdown
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Male']")
	public WebElement genderdropdown;
	
	//for female selection
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Female']")
	public WebElement genderdropdown1;
	
	//citizenship drop down
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Citizenship']")
	public WebElement citizenshipdropdown;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='India']")
	public WebElement citizenshipvalue1;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Others']")
	public WebElement citizenshipvalue2;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='UK']")
	public WebElement citizenshipvalue3;
	
	//ethnicity dropdown 
	@AndroidFindBy(id="com.zcas:id/tvEthnicity")
	public WebElement ethnicitydropdown;
	
	//child live with
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Mother']")
	public WebElement childlivewith;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Father']")
	public WebElement childlivewith1;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Both Parents']")
	public WebElement childlivewith2;
	
	//Attended Play School
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Yes']")
	public WebElement attendedplayschool;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='No']")
	public WebElement attendedplayschool1;
	
	//edit box play school name
	@AndroidFindBy(id="com.zcas:id/et_play_school_name")
	public WebElement playschoolname;
	
	//play school address
	@AndroidFindBy(id="com.zcas:id/et_play_school_address")
	public WebElement playschooladdress;
	
	//play school city
	@AndroidFindBy(id="com.zcas:id/et_play_school_city")
	public WebElement playschoolcity;
	
	//play school country
	@AndroidFindBy(id="com.zcas:id/et_play_school_country")
	public WebElement playschoolcountry;
	
	//from date tag name
	@AndroidFindBy(xpath="//android.widget.TextView[@text='From Date']")
	public WebElement fromdatetagname;
	
	//from date month box
	@AndroidFindBy(id="com.zcas:id/et_from_mm")
	public WebElement frommonth;
	
	//from date date box
	@AndroidFindBy(id="com.zcas:id/et_from_dd")
	public WebElement fromdd;
	
	//from date year box
	@AndroidFindBy(id="com.zcas:id/et_from_yyyy")
	public WebElement fromyear;
	
	//To date tag name
	@AndroidFindBy(xpath="//android.widget.TextView[@text='To Date']")
	public WebElement Todatetagname;
	
	//To date month box
	@AndroidFindBy(id="com.zcas:id/et_from_mm")
	public WebElement Tomonth;
		
	//from date date box
	@AndroidFindBy(id="com.zcas:id/et_from_dd")
	public WebElement Todd;
		
	//from date year box
	@AndroidFindBy(id="com.zcas:id/et_from_yyyy")
	public WebElement Toyear;
	
	//Next Step
	@AndroidFindBy(id="com.zcas:id/btn_next_step")
	public WebElement NextStep;
	
	//Child form saved successfully pop-up text
	@AndroidFindBy(id="android:id/message")
	public WebElement childformpopup;
	
	//Child form saved successfully pop-up Ok button
	@AndroidFindBy(id="android:id/button1")
	public WebElement childformpopupok;
	
	//Create profile button
	@AndroidFindBy(id="com.zcas:id/btnCreateProfile")
	public WebElement createnewprofile ;
	
	
	
	public WebElement backButton()
	{
		System.out.println("find back button");
		return backbtn;
	}
	
	public WebElement firstName()
	{
		System.out.println("first name field");
		return fname;
	}
	public WebElement lastName()
	{
		System.out.println("last name field");
		return lastname;
	}
	public WebElement dateofbirthMM()
	{
		System.out.println("MM name field");
		return birth_mm;
	}
	public WebElement dateofbirthDD()
	{
		System.out.println("DD name field");
		return birth_dd;
	}
	public WebElement dateofbirthYY()
	{
		System.out.println("YY name field");
		return birth_yy;
	}
	
	public WebElement genderDropDown()
	{
		System.out.println("Gender drop down is click");
		return genderdropdown;
	}
	public WebElement femaleSelect()
	{
		System.out.println("Female option");
		return genderdropdown1;
	}
	
	public WebElement citizenshipDropDown()
	{
		System.out.println("citizenship DropDown field");
		return citizenshipdropdown;
	}
	
	public WebElement ethnicityDropDown()
	{
		System.out.println("ethnicity dropdown field");
		return ethnicitydropdown;
	}
 
	public WebElement childLiveWithDropDown()
	{
		System.out.println("parentsselection dropdown field");
		return childlivewith;
	}
	public WebElement attendedplayschoolDropDown()
	{
		System.out.println("attendedplayschool dropdown field");
		return attendedplayschool;
	}
	
	public WebElement playschoolnameTextBox()
	{
		System.out.println("playschoolname field");
		return playschoolname;
	}
	
	public WebElement playschooladdressTextBox()
	{
		System.out.println("playschooladdress field");
		return playschooladdress;
	}
	public WebElement playschoolcityTextBox()
	{
		System.out.println("playschoolcity field");
		return playschoolcity;
	}
	public WebElement playschoolcountryTextBox()
	{
		System.out.println("playschoolcountry field");
		return playschoolcountry;
	}
	
	public WebElement fromDateTagName()
	{
		System.out.println("fromDateTagName locator is find");
		return fromdatetagname;
	}
	
	public WebElement frommonthBox()
	{
		System.out.println("frommonthBox field");
		return frommonth;
	}
	
	public WebElement fromdateBox()
	{
		System.out.println("fromdateBox field");
		return fromdd;
	}
	
	public WebElement fromyearBox()
	{
		System.out.println("fromyearBox field");
		return fromyear;
	}
	
	public WebElement ToDateTagName()
	{
		System.out.println("ToDateTagName locator is find");
		return Todatetagname;
	}
	
	public WebElement TomonthBox()
	{
		System.out.println("TomonthBox field");
		return Tomonth;
	}
	
	public WebElement TodateBox()
	{
		System.out.println("TodateBox field");
		return Todd;
	}
	
	public WebElement ToyearBox()
	{
		System.out.println("ToyearBox field");
		return Toyear;
	}
	
	public WebElement NextStepButton()
	{
		System.out.println("NextStep button");
		return NextStep;
	}
	public WebElement formHeadingText()
	{
		System.out.println("formHeadingText is visible");
		return formHeading;
	}
	public WebElement saveExitButton()
	{
		System.out.println("saveExitButton is visible");
		return saveexit;
	}
	
}
