package com.axisrooms.channelManagerUserModule.test;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.testng.annotations.Test;

import com.axisrooms.channelManagerUserModule.basetest.BaseTest;
import com.axisrooms.channelManagerUserModule.dataProvider.DataProviderTest;
import com.axisrooms.channelManagerUserModule.pages.LoginPage;
import com.axisrooms.channelManagerUserModule.utils.GetCurrentUrl;

public class TestLogin2 extends BaseTest {

	@Test(dataProvider ="getData" , dataProviderClass = DataProviderTest.class)
	public void loginTest2(Map<String,String>data) {
		
		try {
			new LoginPage().enterEmailId(data.get("UserName"))
					.enterPassword(data.get("Password")).clickOnLoginButton().tableHeaderTxt();
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println(GetCurrentUrl.getUrl());
		assertEquals(GetCurrentUrl.getUrl(), false);

		/*
		 * Drivers.driver.findElement(By.xpath("//input[@type='email']")).clear();
		 * Drivers.driver.findElement(By.xpath("//input[@type='email']")).sendKeys(
		 * "demo@axisrooms.com");
		 * Drivers.driver.findElement(By.xpath("//input[@type='password']")).sendKeys(
		 * "Password123#");
		 * Drivers.driver.findElement(By.xpath("//button[@type='submit']")).click();
		 */

	}

}
