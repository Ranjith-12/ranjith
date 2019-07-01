package ranjith;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class Phoneapp {

	public static void main(String[] args) throws Exception   {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a mobile number");
		String number=sc.nextLine();
		Runtime.getRuntime().exec("cmd.exe/c start cmd/k\"appium -a 127.0.0.1 -p 4723\"");
		Thread.sleep(5000);
		URL u=new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, "");
		dc.setCapability("device", "");
		dc.setCapability("version", "5.1.1");
		dc.setCapability("apppackage", "");
		dc.setCapability("appactivity", "");
		dc.setCapability("platformName","android");
		AndroidDriver driver=new AndroidDriver(u,dc);
		TouchAction tc=new TouchAction(driver);
		//tc.tap(ElementOption.element(e)).perform();
		//tc.press(ElementOption.element(e))).moveTo().release().perform();
		tc.press(ElementOption.point(400,1000)).moveTo(ElementOption.point(400, 600)).release().perform();
		Thread.sleep(2000);
		tc.release();
		TouchAction ta=new TouchAction(driver);
		ta.tap(ElementOption.point(100, 200)).perform();
		ta.press(ElementOption.point(500,500)).moveTo(ElementOption.point(400,400)).perform();
		//ta.longPress(ElementOption.);
		MultiTouchAction mt=new MultiTouchAction(driver);
		//mt.add(action)
		//driver
		ta.release();
		
	}

}
