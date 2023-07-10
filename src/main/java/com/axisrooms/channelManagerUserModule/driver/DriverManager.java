package com.axisrooms.channelManagerUserModule.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	public static ThreadLocal<WebDriver> dri = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return dri.get();

	}

	public static void setDriver(WebDriver driver) {
		dri.set(driver);

	}
		public static void unload() {
		dri.remove();

	}

}
