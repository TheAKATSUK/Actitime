package com.ActitimeGenericLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
	public WebDriver driver;
	public void databaseConnection() {
		Reporter.log("database connected",true);
		
	}
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/");
		Reporter.log("browser launched successfully",true);
		
	}
	public void loginToActitime() {
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Reporter.log("logged in successfully",true);
}
	public void closeBrowser() {
		driver.close();
		Reporter.log("Browser closed succesfully",true);
	}
	public void closedatabaseconnection() {
		Reporter.log("database disconnected",true);
	}
}
