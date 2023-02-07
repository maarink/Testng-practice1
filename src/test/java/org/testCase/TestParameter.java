package org.testCase;

import java.util.Date;

import org.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pages.Home_Page;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestParameter extends BaseClass {
	WebDriver driver;

	@BeforeClass
	public void browserLaunch() {

		browserLaunch("chrome");
		launchUrl("https://testautomationpractice.blogspot.com/");
		maximize();
		implecitwait();

	}

	@BeforeMethod
	public void before() {
		Date d = new Date();
		System.out.println("Before date :" + d);
	}

	@Test(parameters = {"fName","lName","city","country","phone"})
	public void test1(String fname,String lname,String city,String country,String phone) throws InterruptedException {

		Home_Page hp = new Home_Page();
		frame();
		fillTextBox(hp.getfName(), fname);
		fillTextBox(hp.getlName(), lname);
		Thread.sleep(3000);
		fillTextBox(hp.getCityName(), city);
		fillTextBox(hp.getCountry(), country);
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
		quit();
		// extentReport.flush();
	}
}
