package ranjith;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.TouchAction;

public class Appium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("devicename", "ZY2245TF53");
		dc.setCapability(CapabilityType.VERSION, "7.0");
		dc.setCapability("appPackage", "com.google.android.calculator");
		dc.setCapability("appActivity", "com.android.Calculator2.Calculator");
		//AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	//	Thread.sleep(8000);
		//WebElement ele=driver.findElement(null);
		//TouchActions tc=
		
		

	}

}
