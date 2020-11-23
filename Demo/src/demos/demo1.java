package demos;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class demo1 {
	

	public static  IOSDriver<IOSElement> capability() throws MalformedURLException {
		// TODO Auto-generated method stub
		File fp = new File("src//UICatalog.app");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		cap.setCapability(MobileCapabilityType.APP, fp.getAbsolutePath());
		IOSDriver<IOSElement>driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
		
	}

}
