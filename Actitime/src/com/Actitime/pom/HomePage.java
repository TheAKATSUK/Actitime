package com.Actitime.pom;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//declaration
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement tasktab;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement reportstab;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement usertab;
	
	
	@FindBy(id="logoutLink")
	private WebElement logloutlink;
	
	
	//intilization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}



	
	//utilization

	public WebElement getReportstab() {
		return reportstab;
	}


	public WebElement getUsertab() {
		return usertab;
	}


	public WebElement getLogloutlink() {
		return logloutlink;
	}






	public WebElement getTasktab() {
		return tasktab;
	}



	

}
