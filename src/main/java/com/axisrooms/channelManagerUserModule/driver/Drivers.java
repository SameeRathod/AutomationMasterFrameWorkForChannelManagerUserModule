package com.axisrooms.channelManagerUserModule.driver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.axisrooms.channelManagerUserModule.enums.ConfigProperties;
import com.axisrooms.channelManagerUserModule.utils.PropertyUtils;

public class Drivers {

	public static void initDrivers() {

		if (Objects.isNull(DriverManager.getDriver())) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/test/resources/Executables/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			DriverManager.setDriver(driver);

			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			try {
				DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}

	}

	public static void quitDriver() {

		if (Objects.nonNull(DriverManager.getDriver())) {

			DriverManager.getDriver().quit();
			DriverManager.unload();

		}

	}

}
