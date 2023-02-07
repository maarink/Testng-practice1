package org.testCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Withknown implements IRetryAnalyzer {
        int mincount=0, maxcount=5;
	@Override
	public boolean retry(ITestResult result) {
		if(mincount<maxcount) {
			mincount++;
			return true;
		}
		return false;
	}

}
