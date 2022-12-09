package com.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
   
	 public static ExtentTest test;
	
	public static void custom_Sendkeys(WebElement element,String values) {
		try {
		element.sendKeys(values);
		test.log(Status.PASS,"Value Succefully Send--"+values);
		}catch(Exception e) {
			test.log(Status.FAIL,e.getMessage());
			
	}
}
	public static void custom_click(WebElement element) {
		try {
			element.click();
			test.log(Status.PASS,"clicked Succesfully");
		}catch (Exception e) {
			test.log(Status.FAIL,e.getMessage());
		}
		
	}
	public static void Handle_DropDown(WebElement element,String text) {	
		try {
			Select sel=new Select(element);
		    sel.selectByVisibleText(text);
		    }catch(Exception e) {
		    	System.out.println(e.getMessage());
		    }
	}
	public static void ScrollIntoElment(WebDriver driver, WebElement element ) {
		try {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].ScrollIntoView()", element);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}