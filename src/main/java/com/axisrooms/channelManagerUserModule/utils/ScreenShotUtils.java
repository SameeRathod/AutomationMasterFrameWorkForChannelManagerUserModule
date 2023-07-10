package com.axisrooms.channelManagerUserModule.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.axisrooms.channelManagerUserModule.driver.DriverManager;

public class ScreenShotUtils {
	
	public static String getBase64Image() {
		return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
	}

}
