package Resourses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonUtilities {
	
	
	public static void dropdwonHandle(WebElement dropdwonxpath,int dropdwonvalue) {
		
		Select s=new Select(dropdwonxpath);
		s.selectByIndex(dropdwonvalue);
		
		
		
	}

	public static void handleassertions(String actul,String Expected) {
		

		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(actul, Expected);
		
		assertion.assertAll();
		
		
		
	}
	
	
	
	
}
