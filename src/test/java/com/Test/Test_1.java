package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.Loginpom;
import com.utility.BaseClass;
import com.utility.Library;

public class Test_1 extends  BaseClass{
  
	@Test
	public void VerifyLoginPage() {
		Loginpom login=PageFactory.initElements(driver, Loginpom.class);
		Library.custom_Sendkeys(login.getText_email(),"test");
		Library.custom_Sendkeys(login.getText_pass(), "123456789");
		Library.custom_click(login.getBtn_login());
		
		Library.Handle_DropDown(null, null);
		Library.ScrollIntoElment(driver, null);
	}
}
