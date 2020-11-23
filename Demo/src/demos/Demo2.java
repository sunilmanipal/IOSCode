package demos;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import static java.time.Duration.ofSeconds;

public class Demo2 extends demo1{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		IOSDriver<IOSElement>driver = capability();
		driver.findElement(MobileBy.AccessibilityId("Alert Views")).click();
		driver.findElement(By.xpath("//*[@text='Text Entry']")).click();
		driver.findElement(By.className("XCUIElementTypeTextField")).sendKeys("sunil");
		driver.findElement(By.name("OK")).click();
		driver.navigate().back();
		
		
		 Dimension size = driver.manage().window().getSize();
			int x =size.getWidth() / 2;
			int starty = (int) (size.getHeight() * 0.60);
			int endy =(int) (size.getHeight() * 0.10);
			driver.swipe(x, starty, x, endy, 2000);
			//new TouchAction(driver).press(starty, x).waitAction(Duration.ofSeconds(3)).moveTo(endy, x).release().perform();
			driver.findElement(MobileBy.AccessibilityId("Steppers")).click();

		

	}

	

}
