package com.mv.zamit.ZamitZcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Base1 {
	

	public static AppiumDriverLocalService service;
	public static AndroidDriver<AndroidElement> driver;
	
	
	 
	
	//Appium Server Start
	public AppiumDriverLocalService startServer() 
	{
		boolean flag=checkIfServerIsRunning(4723);
		if(!flag)
		{
		 service = AppiumDriverLocalService.buildDefaultService();
		 service.start();
		}
		 
		 return service;
	}
public static boolean checkIfServerIsRunning(int port) {
		
		boolean isServerRunning=false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();
		}catch(IOException e){
			//If Control comes here, then it means that the port is in use
			isServerRunning=true;
		}finally {
			serverSocket=null;
		}
		return isServerRunning;
	}

	
	  public static void startEmulator() throws IOException, InterruptedException 
	  {
	  Runtime.getRuntime().exec("C:\\Users\\MV\\eclipse-workspace\\ZamitZcs\\resources\\startEmulator.bat");
	  
	  }
	 

    
      public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException, InterruptedException
         {                                                                         
    	   FileInputStream fis=new FileInputStream("C:\\Users\\MV\\eclipse-workspace\\ZamitZcs\\resources\\global.properties");
    		Properties prop=new Properties();
    		//load properties file
    		prop.load(fis);
    		//Print or get key
    		
    	   
    	   File f=new File("src");
   		   File fs= new File(f,(String) prop.get(appName));
	
    	   DesiredCapabilities cap=new DesiredCapabilities();
    	   String device=(String) prop.get("device");
		
		  if(device.contains("Pixel_2_XL_API_29"))
		  { 
			  startEmulator();
		      Thread.sleep(10000);
		  }
		 
    	   
    	  
    	   
    	cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"android" );
   		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
   		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
   		cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
   		//cap.setCapability(MobileCapabilityType.SUPPORTS_JAVASCRIPT, true);
   		
   		//cap.setCapability("appPackage", "com.todoist");//for incorrect package and activity.
   		//cap.setCapability("appActivity","com.todoist.activity.HomeActivity");
   		
   		//cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE_DIR, "C:\\Users\\MV\\Downloads\\chromedriver_win32 (1)");
   		
   		
   		
   		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
   		
   		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
         }
	  
	
}
