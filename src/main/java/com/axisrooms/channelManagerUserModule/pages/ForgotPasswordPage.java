package com.axisrooms.channelManagerUserModule.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.channelManagerUserModule.driver.DriverManager;

public class ForgotPasswordPage {
	
	@FindBy(xpath = "//input[@placeholder='Enter your Email']")
	private WebElement enterYourEmailIdTextFiled;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement sendMeInstructionsBtn;
	
	public ForgotPasswordPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
		
	}
	
	
	

}
