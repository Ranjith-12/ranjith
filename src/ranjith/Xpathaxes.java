package ranjith;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathaxes {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\ranjith\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");
        //driver.findElement(By.xpath("//*[@title='Software Testing']//self::a"));
        driver.findElements(By.xpath("//*[@title='Software Testing']//self::a"));
        Thread.sleep(2000);

        
        driver.close();
        	
	}

}
