package com.akn.MovieChallengeYassir;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Base {
	public AndroidDriver driver;

	@BeforeClass
	public void configureAppium() throws MalformedURLException {
		
		//create capabilities
				UiAutomator2Options options = new UiAutomator2Options();
				options.setDeviceName("AKNDevice");
				options.setApp(System.getProperty("user.dir")+"\\src\\test\\java\\ressources\\movie-app.apk");
				
				//create object for android driver
				AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
				driver.quit();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
