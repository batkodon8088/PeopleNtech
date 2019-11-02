package com.piit.session.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
WebDriver driver;
@FindBy(id="homeval")
WebElement homeValueText;

@FindBy(id="downpayment")
WebElement downPaymentOption;

@FindBy(id="loanamt")
WebElement loanFl;

@FindBy(id="intrstsrate")
WebElement it;

@FindBy(name="ratebutton")
WebElement buttoncl;

public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void homeValueText(String digits) {
	homeValueText.clear();
	homeValueText.sendKeys(digits);
}
public void downPaymentOption(String digits) {
	downPaymentOption.clear();
	downPaymentOption.sendKeys(digits);
}
public void loanFl(String digits) {
	loanFl.clear();
	loanFl.sendKeys();
}

public void it(String digits) {
	it.clear();
	it.sendKeys(digits);
}
public void buttoncl() {
	
	buttoncl.click();
}
}
