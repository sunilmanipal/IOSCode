package demos;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class safari {

	@Test
	public void saf() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		IOSDriver<IOSElement>driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		//return driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

}
