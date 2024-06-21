package poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PomLogin {
	
	WebDriver driver;
	
	By txt_useremail = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[1]/div/input");
	By txt_userpass = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[2]/div/input");
	By btn_continue = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[3]/button");
	
	By btn_logout = By.xpath("//div/div/div[3]/div/div[1]/div[4]/div/div/div/div[2]/div[3]/button[2]");
	
	
	public PomLogin(WebDriver driver) {
		this.driver = driver;
	}
	
public void valid_useremail(String useremail) {
		
		driver.findElement(txt_useremail).sendKeys(useremail);	
		
	}

public void valid_userpass(String userpass) {
	
	driver.findElement(txt_userpass).sendKeys(userpass);
	
}

public void clicklogin() {
	
		driver.findElement(btn_continue).click();
}

public void clicklogout() {
	  driver.findElement(btn_logout);
}

	public void valid_login(String useremail,String userpass) {
		
		driver.findElement(txt_useremail).sendKeys(useremail);	
		driver.findElement(txt_userpass).sendKeys(userpass);
		driver.findElement(btn_continue).click();
	}

}
