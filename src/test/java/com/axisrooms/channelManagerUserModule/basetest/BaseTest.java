package com.axisrooms.channelManagerUserModule.basetest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.axisrooms.channelManagerUserModule.driver.Drivers;

public class BaseTest {

	@BeforeMethod
	public void setUp() {

		Drivers.initDrivers();

		// DriverManager.getDriver().navigate().to("https://rm.axisrooms.com/#/login");

	}

	@AfterMethod
	public void tearDown() {

		Drivers.quitDriver();

	}

}
