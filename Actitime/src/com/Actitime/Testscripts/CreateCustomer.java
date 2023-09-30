package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskPage;
import com.ActitimeGenericLibrary.BaseClass;
import com.ActitimeGenericLibrary.FileLibrary;
import com.ActitimeGenericLibrary.ListnerImplementation;
@Listeners(ListnerImplementation.class)
public class CreateCustomer extends BaseClass {
	
	
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getReportstab().click();
		
		TaskPage tp=new TaskPage(driver);
		tp.getAddnew().click();
		tp.getAddnewcustomer().click();
		FileLibrary f=new FileLibrary();
		String name = f.readdataFromExcel("Sheet1", 1, 1);
		tp.getCustname().sendKeys(name);
		String desp = f.readdataFromExcel("Sheet1", 1, 2);
		tp.getCustdesp().sendKeys(desp);
		tp.getCreatecust().click();
		
		String expectedresult =name;
		String actualresult = driver.findElement(By.xpath("(//div[.='"+name+"'])[1]")).getText();
		SoftAssert s = new SoftAssert();
		s.assertEquals(expectedresult, actualresult);
		s.assertAll();
				
	}

}
