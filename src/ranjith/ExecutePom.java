package ranjith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ExecutePom {
	@Test
	public void exe() {
		
WebDriver driver=new FirefoxDriver();
		driver.get("http://srssprojects.in/home.aspx");
		driver.manage().window().maximize();

RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
RHP.Login();}
	

}
