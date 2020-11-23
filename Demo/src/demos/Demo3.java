package demos;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Demo3 extends demo1{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		IOSDriver<IOSElement>driver = capability();
		
		//Exercise 1
		
		driver.findElement(MobileBy.AccessibilityId("Increment")).click();
		driver.findElement(MobileBy.AccessibilityId("Increment")).click();
		String  first = driver.findElements(By.className("XCUIElementTypeStaticText")).get(1).getText();
		System.out.println(first);
		driver.findElement(MobileBy.AccessibilityId("Decrement")).click();
		String  decrement1 = driver.findElements(By.className("XCUIElementTypeStaticText")).get(1).getText();
		System.out.println(decrement1);
	}

}
