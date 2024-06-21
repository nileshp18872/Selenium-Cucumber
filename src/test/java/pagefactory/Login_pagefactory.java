package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_pagefactory {
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[1]/div/input")
	WebElement txt_useremail;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[2]/div/input")
	WebElement txt_userpass;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[3]/button")
	WebElement btn_continue;
	
	@FindBy(xpath = "//div/div/div[3]/div/div[1]/div[4]/div/div/div/div[2]/div[3]/button[2]")
	WebElement btn_logout;
	
	public void vaid_useremail() {
		
	}
	
	public void valid_userpass() {
		
	}
	
	public void valid_btncontinue() {
		
	}
	
	public void valid_btnlogout() {
		
	}
	
	
}
	
