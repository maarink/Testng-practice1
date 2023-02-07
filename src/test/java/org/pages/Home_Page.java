package org.pages;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page extends BaseClass {

	public Home_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="(//input[@name='RESULT_TextField-1'])")
	private WebElement fName;

	@FindBy(id = "RESULT_TextField-2")
	private WebElement lName;
	
	@FindBy(id = "RESULT_TextField-3")
	private WebElement phone;

	@FindBy(id = "RESULT_TextField-4")
	private WebElement country;

	@FindBy(id = "RESULT_TextField-5")
	private WebElement cityName;

	@FindBy(id = "RESULT_TextField-6")
	private WebElement mailId;

	@FindBy(xpath = "//label[contains(text(),'Male')]")
	private WebElement genderName;

	@FindBy(xpath = "//label[contains(text(),'Monday')]")
	private WebElement day;

	@FindBy(id = "RESULT_RadioButton-9")
	private WebElement best;

	@FindBy(id = "FSsubmit")
	private WebElement submit;

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCityName() {
		return cityName;
	}

	public WebElement getMailId() {
		return mailId;
	}

	public WebElement getGenderName() {
		return genderName;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getBest() {
		return best;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	

	

	

}
