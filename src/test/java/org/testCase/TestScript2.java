package org.testCase;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.Base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.pages.Home_Page;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestScript2 extends BaseClass {
	WebDriver driver;
//	ExtentReports extentReport;
//	ExtentHtmlReporter htmlReporter;
//	ExtentTest testCase;

	@BeforeClass
	public void browserLaunch() {
//		extentReport = new ExtentReports();
//		htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
//		extentReport.attachReporter(htmlReporter);
		browserLaunch("chrome");
		launchUrl("https://testautomationpractice.blogspot.com/");
		maximize();
		implecitwait();

		// testCase.log(Status.INFO, "Navigating to Automation");

	}

	@BeforeMethod
	public void before() {
		Date d = new Date();
		System.out.println("Before date :" + d);
	}

	@Test
	public void test1() throws InterruptedException {

//		testCase = extentReport.createTest("Verify Automation");
//		testCase.log(Status.PASS, "Actual title and Expected title");
		Home_Page hp = new Home_Page();
		frame();
		fillTextBox(hp.getfName(), "maari");
		fillTextBox(hp.getlName(), "nk7");
		fillTextBox(hp.getCityName(), "Chennai");
		fillTextBox(hp.getCountry(), "india");
		fillTextBox(hp.getPhone(), "87654444");
		fillTextBox(hp.getMailId(), randomString()+"@gmail.com");
		selectbyindex(hp.getBest(), 1);
		Click(hp.getDay());
		Assert.assertTrue(false);
	//	Click(hp.getSubmit());
	}

	@AfterMethod
	public void after() {
		Date d = new Date();
		System.out.println("After date :" + d);

	}

	@AfterClass
	public void after1() {
		driver.quit();
	//	extentReport.flush();
	}
}
