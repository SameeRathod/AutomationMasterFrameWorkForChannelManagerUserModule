package com.axisrooms.channelManagerUserModule.utils;

import com.axisrooms.channelManagerUserModule.driver.DriverManager;

public class GetTitle {

	public static String CurrentpageTitle() {

		return DriverManager.getDriver().getTitle();
		
	
	}

}
