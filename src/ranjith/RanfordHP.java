package ranjith;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP {
	@FindBy (name="txtuId")
	WebElement 	UserName;
	@FindBy (name="txtPword")
	WebElement Password;
	@FindBy (name="login")
	WebElement Login;		
	
	public void Login() {
		UserName.sendKeys("Admin");
		Password.sendKeys("Admin");
	Login.click();
	
		
	}
	
	
	
	

}
