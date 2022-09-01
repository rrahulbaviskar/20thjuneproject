package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectmodel.LoginPageObject;
import PageObjectmodel.SignUppageObjects;
import Resourses.Baseclass;
import Resourses.TestcaseData;

public class VerifyLoginTestcase extends Baseclass {
	
	
	@Test
	public void login() throws IOException {
		
		
		
		LoginPageObject lpo=new LoginPageObject(driver);
		
		lpo.EnterUsername().sendKeys(TestcaseData.username);
		
		lpo.Enterpassword().sendKeys(TestcaseData.password);
		
		lpo.EnterLoginButton().click();
		
		String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String actul=driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(actul,expected );
		System.out.println("Hello after test");
		assertion.assertAll();
		
		
		
		
	}
	
	

}
