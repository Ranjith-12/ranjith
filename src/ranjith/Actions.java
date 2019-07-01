package ranjith;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Actions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ranjith\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		org.openqa.selenium.interactions.Actions builder=new org.openqa.selenium.interactions.Actions(driver);
	WebElement ele=driver.findElement(By.xpath("//*[@type='email']"));
Action Keyboardaction=builder.moveToElement(ele).keyDown(ele, Keys.SHIFT).sendKeys("hello").keyUp(ele, Keys.SHIFT).doubleClick(ele).contextClick(ele).build();
	Keyboardaction.perform();
	System.out.println();
		
		
		
		

	};
	
	

	}


