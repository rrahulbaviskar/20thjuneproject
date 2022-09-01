package PageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUppageObjects {
	
public WebDriver driver;
	
	private By firstname= By.xpath("//input[@name='UserFirstName']");
	
	private By lastname= By.xpath("//input[@name='UserLastName']");
	
	private By workemail=By.xpath("//input[@name='UserEmail']");
	
	private By Jobtitle=By.xpath("//select[@name='UserTitle']");
	
	private By company=By.xpath("//input[@name='CompanyName']");
	
	private By employee=By.xpath("//select[@name='CompanyEmployees']");
	
	private By Phone=By.xpath("//input[@name='UserPhone']");
	
	private By country=By.xpath("//select[@name='CompanyCountry']");
	
	
public SignUppageObjects(WebDriver driver2) {
		this.driver=driver2;
		
	}

public WebElement Enterfirstname() {
		
		return driver.findElement(firstname);
}

public WebElement Enterlastname() {
	
	return driver.findElement(lastname);
	
}

public WebElement Enterworkemail() {
	
	return driver.findElement(workemail);
	
}



public WebElement selectJobtitle() {
	
	return driver.findElement(Jobtitle);
	
}
	
public WebElement Entercompany() {
	
	return driver.findElement(company);
}
	
	
	
public WebElement selectemployee() {
	
	return driver.findElement(employee);
	
	
	
}
	
public WebElement EnterPhone() {
	
	return driver.findElement(Phone);
	
}
	

public WebElement selectcountry() {
	
	return driver.findElement(country);

}



}
