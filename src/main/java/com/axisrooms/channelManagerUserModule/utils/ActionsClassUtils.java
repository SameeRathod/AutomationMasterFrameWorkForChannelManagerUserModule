package com.axisrooms.channelManagerUserModule.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.axisrooms.channelManagerUserModule.driver.DriverManager;

public class ActionsClassUtils {
	
	public static  Actions actions = new Actions(DriverManager.getDriver());
	
	public static void mouseHoverActions(WebElement element) {
		
		actions.moveToElement(element).build().perform();
	}
	
	public static void rightClickActions(WebElement element) {
		actions.moveToElement(element).contextClick().build().perform();
	}
	
	public static void doubleClickActions(WebElement element){
		actions.moveToElement(element).doubleClick().build().perform();
		
	}

}
