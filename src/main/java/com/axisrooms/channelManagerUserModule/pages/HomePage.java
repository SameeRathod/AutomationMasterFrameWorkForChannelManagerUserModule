package com.axisrooms.channelManagerUserModule.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.channelManagerUserModule.driver.DriverManager;
import com.axisrooms.channelManagerUserModule.enums.WaitStrategy;
import com.axisrooms.channelManagerUserModule.factories.ExplicitWaitFactory;

public class HomePage {
	
	@FindBy(xpath = "//div[@class='brandname']")
	private WebElement brandNametxt;
	
	@FindBy(xpath = "//a[@id='megadropdownbutton']")
	private WebElement filtersDropDpwnBtn; 
	
	@FindBy(xpath = "(//a[@id='profile-setting'])[1]")
	private WebElement hamburgerIcon;
	
	@FindBy(xpath = "(//a[@id='profile-setting'])[2]")
	private WebElement profileDropDown;
	
	@FindBy(xpath = "//input[@placeholder='Hotel Search']")
	private WebElement hotelSearchField;
	
	@FindBy(xpath = "//tbody/tr/td[1]")
	private WebElement tableHeaderTxt;
	
	
	public HomePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	public HomePage tableHeaderTxt() {
		
		new ExplicitWaitFactory().getText(tableHeaderTxt, WaitStrategy.VISIBLE, "text is visible");
		//brandNametxt.getText();
		return this;
	}
	
	

}
