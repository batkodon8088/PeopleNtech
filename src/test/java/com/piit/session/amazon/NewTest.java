package com.piit.session.amazon;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	public static WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  Home ui = new Home(driver);
	  ui.homeValueText("132000");
	  
	 Thread.sleep(1000);
	  ui.downPaymentOption("8000");
	  ui.it("3.25");
	  ui.buttoncl();
 }
  @BeforeClass
  @Parameters("browser")
  public void beforeClass() {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uyanga\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
			driver.navigate().to("https://www.mortgagecalculator.org");
  }
		/*public void beforeClass(String browser) throws Exception {
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uyanga\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
				driver.navigate().to("https://www.mortgagecalculator.org");
			   
			}else if(browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Uyanga\\eclipse-workspace\\Automation\\Driver\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
				driver.navigate().to("https://www.mortgagecalculator.org");
			}else {
				throw new Exception("Browser is not correct");
			}
			driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
			
			//openbrowser brows = new openbrowser();
			//brows.openingbrowser("http://www.facebook.com");

		}*/
  

  @AfterClass
  public void afterClass() {
  }

}
