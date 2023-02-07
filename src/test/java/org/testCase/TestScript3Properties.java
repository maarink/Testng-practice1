package org.testCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.Home_Page;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestScript3Properties extends BaseClass {
	WebDriver driver;
	Properties p;

	@BeforeSuite
	public void setup() throws IOException {
		FileInputStream f = new FileInputStream("config.properties");
		p = new Properties();
		p.load(f);
	}

	@BeforeClass
	public void browserLaunch() {
		browserLaunch("chrome");
		launchUrl(p.getProperty("url"));
		maximize();
		implecitwait();

	}

	@BeforeMethod
	public void before() {
		Date d = new Date();
		System.out.println("Before date :" + d);
	}

	@Test
	public void test1() throws InterruptedException {
		Home_Page hp = new Home_Page();
		frame();
		fillTextBox(hp.getfName(), p.getProperty("fName"));
		fillTextBox(hp.getlName(), p.getProperty("lName"));
		fillTextBox(hp.getCityName(), p.getProperty("city"));
		fillTextBox(hp.getCountry(), p.getProperty("country"));
		fillTextBox(hp.getPhone(), p.getProperty("phone"));
		fillTextBox(hp.getMailId(), p.getProperty("mailid"));

	}

	@AfterMethod
	public void after() {
		Date d = new Date();
		System.out.println("After date :" + d);

	}

	@AfterClass
	public void after1() {
		quit();

	}
}
