package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class TaskPage {
	
	@FindBy(xpath ="//div[.='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath ="//div[.='+ New Customer']")
	private WebElement addnewcustomer;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy(xpath ="//textarea[@placeholder='Enter Customer Description']" )
	private WebElement custdesp;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcust;
	
	@FindBy (xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancel;
	
	
	//initialization
	public TaskPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	
	public WebElement getAddnewcustomer() {
		return addnewcustomer;
	}
	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getCustname() {
		return custname;
	}
	public WebElement getCustdesp() {
		return custdesp;
	}
	public WebElement getCreatecust() {
		return createcust;
	}

	

	
	
	

}
