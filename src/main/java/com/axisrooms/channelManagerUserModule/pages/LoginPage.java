package com.axisrooms.channelManagerUserModule.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.channelManagerUserModule.driver.DriverManager;
import com.axisrooms.channelManagerUserModule.enums.WaitStrategy;
import com.axisrooms.channelManagerUserModule.factories.ExplicitWaitFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement emailTxtField;
	
	@FindBy(xpath = "//input[@type='password']")
	 WebElement passwordTxtField;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//button[@type='submit']/../a")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath = "//tbody/tr[3]/td[1]")
    private WebElement clickOnFirstHotelPresentInDestinationList;

	
	public LoginPage( ) {
		
		PageFactory.initElements(DriverManager.getDriver(),this);
	
	}
	
	public LoginPage enterEmailId(String enterEmailId) {
		new ExplicitWaitFactory().sendKeys(emailTxtField, enterEmailId, WaitStrategy.PRESENCE, "Enter User Name");
		
		//emailTxtField.sendKeys(enterEmailId);
		return this;
	
		
	}
	public LoginPage enterPassword(String entrePassword) {
		new ExplicitWaitFactory().sendKeys(passwordTxtField, entrePassword, WaitStrategy.PRESENCE, "Enter password");
		//passwordTxtField.sendKeys(entrePassword);
		return this;
	}
	
	
	public HomePage clickOnLoginButton() {
		try {
			new ExplicitWaitFactory().click(loginButton, WaitStrategy.CLICKABLE, "click on login button");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		//loginButton.click();
		return new HomePage();
	}
	
	public ForgotPasswordPage forgotPasswordLink() {
		try {
			new ExplicitWaitFactory().click(forgotPasswordLink, WaitStrategy.CLICKABLE, "click on forgot password link");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return new ForgotPasswordPage();
	}
	
	public DashBordPage clickOnFirstHotelPresentInDestinationList() {
		try {
			new ExplicitWaitFactory().click(clickOnFirstHotelPresentInDestinationList, WaitStrategy.CLICKABLE, "click on first hotel present in list");
		} catch (Exception e) {
			
			e.printStackTrace();
			
			
		}
		return new DashBordPage();
	}

}
