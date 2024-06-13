package Cucumber2024Automation.PageObjects;

import org.openqa.selenium.By;

import Cucumber2024Automation.Base.Base;


public class LoginPage extends Base{
	
	public static By emailInputBox=By.id("user_email");
	public static By passwordInputBox=By.id("user_password");
	public static By SignInButton=By.xpath("//input[@class='ht-btn--main-action']");
	public static By allProjectText=By.id("ember57");
	public static By loginButton=By.xpath("//a[@title=\"Login\"]");
	public static By captureErrorText=By.xpath("//p[text()='Invalid email or password.']");
	
	public static void clickLoginButton() {
		
		try {
			driver.findElement(loginButton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void enterEmailId(String email) {
		
		try {
			driver.findElement(emailInputBox).clear();
			driver.findElement(emailInputBox).sendKeys(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void enterPassword(String pwd) {
		
		try {
			driver.findElement(passwordInputBox).sendKeys(pwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void clickSignInButton() {
		
		try {
			driver.findElement(SignInButton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String captureAllProjectText() {
		String actualText=driver.findElement(allProjectText).getText();
		return actualText;
		
	}

	public static String captureInvalidText() {
		String actualText=driver.findElement(captureErrorText).getText();
		return actualText;
		
	}
}
