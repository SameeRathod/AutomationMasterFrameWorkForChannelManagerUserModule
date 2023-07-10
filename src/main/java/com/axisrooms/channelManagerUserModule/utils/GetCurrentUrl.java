package com.axisrooms.channelManagerUserModule.utils;

import com.axisrooms.channelManagerUserModule.driver.DriverManager;

public class GetCurrentUrl {

	public static String getUrl() {
		
		String currentUrl = DriverManager.getDriver().getCurrentUrl();
		return currentUrl;
		

	}

}
