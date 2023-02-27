package com.LocatorBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import com.UtilityBank.BaseBank;

public class LoginLacator extends BaseBank{
	
	public LoginLacator() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//*[@name='uid']")
	public WebElement idField;
	
	@FindBy(xpath = "//*[@name='password']")
	public WebElement passwordField;
	
	@FindBy(name = "btnLogin")
	public WebElement loginBtn;

}
