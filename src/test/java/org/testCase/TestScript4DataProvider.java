package org.testCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pages.Home_Page;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestScript4DataProvider extends BaseClass {
	WebDriver driver;
	Home_Page hp;

	@BeforeClass
	public void browserLaunch() {
		browserLaunch("chrome");
		launchUrl("https://testautomationpractice.blogspot.com/");
		maximize();
		implecitwait();
		 hp = new Home_Page();
		frame();
	}

	@BeforeMethod
	public void before() {
		Date d = new Date();
		System.out.println("Before date :" + d);
	}

	@Test(dataProvider = "login", dataProviderClass = Datas.class)
	public void test1( String user, String pass, String city, String country, String phone)
			throws InterruptedException {
		
		fillTextBox(hp.getfName(), user);
		Thread.sleep(3000);
		fillTextBox(hp.getlName(), pass);
		fillTextBox(hp.getCityName(), city);
		Thread.sleep(3000);
		fillTextBox(hp.getCountry(), country);
		Thread.sleep(3000);
		fillTextBox(hp.getPhone(), phone);
		Thread.sleep(3000);

	}

	@AfterMethod
	public void after() {
		Date d = new Date();
		System.out.println("After date :" + d);

	}

	@AfterClass
	public void after1() {
		// quit();

	}
}
