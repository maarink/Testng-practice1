package org.testCase;

import java.io.File;
import java.io.IOException;

import org.Base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends BaseClass implements ITestListener{

	public void onFinish(ITestContext arg0) {
		System.out.println(" -----Finished-----");
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println("------Excution Started-----");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
//		TakesScreenshot tk= (TakesScreenshot)driver;
//		
//		File from = tk.getScreenshotAs(OutputType.FILE);
//		File to=new File("/TestNGPractice1/Screenshot");
//		try {
//			FileUtils.copyFile(from, to);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			takeScreenshot("screenshot");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("------Test Failure------");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("------Test Started----------");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("--------Test Successfully---------");
		
	}

}
