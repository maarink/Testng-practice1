package org.testCase;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestScript1 {
	WebDriver driver;
	ExtentReports extentReport;
	ExtentHtmlReporter htmlReporter;
	ExtentTest testCase;
//@BeforeSuite
//public void browser() {
//	
//}

	@BeforeClass
	public void browserLaunch() {
		extentReport = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
		extentReport.attachReporter(htmlReporter);
		System.setProperty("webdriver.chrome.driver", "C:\\Axyya\\chromedriver_win321\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://testautomationpractice.blogspot.com/");
		// testCase.log(Status.INFO, "Navigating to Automation");

	}

	@BeforeMethod
	public void before() {
		Date d = new Date();
		System.out.println("Before date :" + d);
	}

	@Test
	public void test1() {

		testCase = extentReport.createTest("Verify Automation");
		testCase.log(Status.PASS, "Actual title and Expected title");
		driver.findElement(By.xpath("(//input[@name='RESULT_TextField-1'])")).sendKeys("maari");
		
//		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
//		Alert a = driver.switchTo().alert();
//		a.accept();
//		driver.findElement(By.id("datepicker")).click();
//		driver.findElement(By.xpath("(//a[contains(text(),'21')])[1]")).click();
//		WebElement files = driver.findElement(By.id("files"));
//		Select s = new Select(files);
//		s.selectByIndex(2);
//
//		WebElement mgs = driver.findElement(By.xpath("(//div[@class='widget-content'])[4]"));
//		System.out.println(mgs.getText());
//
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//		Actions a1 = new Actions(driver);
//		a1.dragAndDrop(drag, drop).perform();
//
//		WebElement drag1 = driver.findElement(By.xpath("(//h5[contains(text(),'Mary')])[1]"));
//		WebElement drop1 = driver.findElement(By.id("trash"));
//		// Actions a1=new Actions(driver);
//		a1.dragAndDrop(drag1, drop1).perform();
//		try {
//			Thread.sleep(3000);
//		} catch (Exception e) {
//
//		}
//		Assert.assertEquals("Automation Testing Practice", driver.getTitle());
	}

	@Test
	public void test2() {
		// testCase.log(Status.INFO, "Navigating to Table");

//		testCase = extentReport.createTest("Verify Table");
//		testCase.log(Status.PASS, "Actual title and Expected title");
//
//		List<WebElement> companyName = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[1]"));
//
//		List<WebElement> price = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[4]"));
//		for (int i = 0; i < companyName.size(); i++) {
//			if (companyName.get(i).getText().equalsIgnoreCase("Master In Selenium")) {
//				System.out.println("price: " + price.get(i).getText());
//			}
//		}

	}

	@AfterMethod
	public void after() {
		Date d = new Date();
		System.out.println("After date :" + d);

	}

	@AfterClass
	public void afterclass() {
		driver.quit();
		extentReport.flush();
	}
}
