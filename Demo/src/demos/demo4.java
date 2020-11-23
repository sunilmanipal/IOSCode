package demos;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class demo4 extends demo1{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		IOSDriver<IOSElement>driver = capability();
		driver.findElement(MobileBy.AccessibilityId("Picker View")).click();
		driver.findElement(By.name("Green color component value")).sendKeys("220");
		driver.findElements(By.className("XCUIElementTypePickerWheel")).get(0).sendKeys("55");
		driver.findElement(By.xpath("//*[@name='blue color component value']")).sendKeys("130");
	}

}
