package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectmodel.LoginPageObject;
import PageObjectmodel.SignUppageObjects;
import Resourses.Baseclass;
import Resourses.TestcaseData;
import Resourses.commonUtilities;

public class VerifySignUpTestcase extends Baseclass {
	@Test
	public void SignUp() throws IOException, InterruptedException {
	
	LoginPageObject lpo=new LoginPageObject(driver);
	
	lpo.tryforfree().click();
	
	Thread.sleep(5000);
	
	System.out.println(driver.getTitle());
	
	 SignUppageObjects spo=new  SignUppageObjects(driver);
	
	 spo.Enterfirstname().sendKeys(TestcaseData.firstName);
	 
	 spo.Enterlastname().sendKeys("Baviskar");
	 
	 spo.Enterworkemail().sendKeys("rb");
	 
	 
	 commonUtilities.dropdwonHandle(spo.selectJobtitle(),1);
	 
	//Select s=new Select(spo.selectJobtitle());
	//s.selectByIndex(1);
	
	spo.Entercompany().sendKeys("TCS");
	
	commonUtilities.dropdwonHandle(spo.selectemployee(),2);
	
	//Select s1=new Select(spo.selectemployee());
	//s1.selectByIndex(2);
	
	spo.EnterPhone().sendKeys("9511");
	
	commonUtilities.dropdwonHandle(spo.selectcountry(),3);
	
//	Select s2=new Select(spo.selectcountry());
//	s2.selectByIndex(3);
	
	
	
	}
}
