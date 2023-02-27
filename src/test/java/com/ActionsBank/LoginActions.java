package com.ActionsBank;

import com.LocatorBank.LoginLacator;
import com.UtilityBank.BaseBank;
import com.UtilityBank.TestData;

public class LoginActions  extends BaseBank {
	
	
	LoginLacator loginLacator = new  LoginLacator();

	public void Entervaliduserid() {
		loginLacator.idField.sendKeys(TestData.validId);
		
		}
	
	public void Entervalidpassword() {
		
		loginLacator.passwordField.sendKeys(TestData.validPassword);
	}
	public void Clickonlogin() {
		loginLacator.loginBtn.click();
		
	}
	public void Verifythetitleofhomepage(){
		System.out.println("Title of the home page is : " +driver.getTitle());
		
	}
	
	public void EnterInvaliduserid() {
		loginLacator.idField.sendKeys(TestData.inValidId);
		
	}
	
	public void EnterInvalidpassword() {
		loginLacator.passwordField.sendKeys(TestData.inValidPassword);
	}
	
	
	public void Verifyusercannotloginsuccessfully() {
		driver.switchTo().alert().accept();
		
	}
	
		
	
	
	
	
}
