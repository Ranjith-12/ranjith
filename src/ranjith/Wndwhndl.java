package ranjith;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wndwhndl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ranjith\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("http://demo.guru99.com/popup.php");
driver.manage().window().maximize();
driver.findElement(By.linkText("Click Here")).click();
String Mainwindow=driver.getWindowHandle();
Set<String>S=driver.getWindowHandles();
Iterator<String>i=S.iterator();
while (i.hasNext()) {
	String childwndw=i.next();
	if(!Mainwindow.equalsIgnoreCase(childwndw)) {
		
driver.switchTo().window(childwndw);
		driver.findElement(By.name("emailid")).sendKeys("ranjithkaranam29@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
driver.close();
		
	}
	driver.switchTo().window(Mainwindow);
	
}

}}