package org.testCase;

import org.testng.annotations.DataProvider;

public class Datas {
	@DataProvider(name = "login")
	public Object[][] data() {
		Object[][] obj = new Object[][] { { "maari", "nk7", "chennai", "india", "8766544" }, 
			{ "arun","k7","delhi","india","98877665" } };
		return obj;
	}
}