package com.ActitimeGenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {
/**
 * this method is non-static method used to read from property file.
 * @param key
 * @return
 * @throws IOException
 */
	
	public String readdataFromPropertyFile(String Key) throws IOException {
	FileInputStream fis = new FileInputStream("./TestData/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String value=p.getProperty(Key);
	return value;
	}
/**
 * this method is non-static method used to read data from excel sheet.
 * @param sheet
 * @param row
 * @param cell
 * @return
 * @throws IOException
 * @throws EncryptedDocumentException
 * 
 */
	
	public String readdataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
    FileInputStream fis = new FileInputStream("./TestData/BANKINGInfo.xlsx");
    Workbook wb=WorkbookFactory.create(fis);
    String value=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
    return value;
	}
	
	
	}
