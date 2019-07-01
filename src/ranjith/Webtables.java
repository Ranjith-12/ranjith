package ranjith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ranjith\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/accessing-nested-table.html");
	System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]//table/tbody/tr[1]/td[1]")).getText());

	}

}
