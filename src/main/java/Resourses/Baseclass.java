package Resourses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public WebDriver driver;
	
	public Properties Prop;
	
	public WebDriver browesrnewLuanch() throws IOException {
		
		FileInputStream File=new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\Resourses\\data.properties");
	
	     Prop =new  Properties();
	    
	    Prop.load(File);
	    
	    String browserName =Prop.getProperty("browser");
	    
	    if (browserName.equalsIgnoreCase("chrome")) {
	    	
	    	WebDriverManager.chromedriver().setup();
	    	driver=new ChromeDriver();
	    	  	
	    }
	    
	    else if(browserName.equalsIgnoreCase("Firefox")) {
	    	
	    }
         else if(browserName.equalsIgnoreCase("Edge")) {
	    	
	    }
	    
         else {
        	 System.out.println("Browser not found");
        	 
         }
	    
	    return driver;
	}
     @BeforeMethod
	public void launchBrowser() throws IOException {
		
    	 browesrnewLuanch();
 		
 		driver.get(Prop.getProperty("url"));
 		
		
	}
	
	@AfterMethod
     public void windowclose() {
    	 
    	 driver.quit();
    	 
     }
     
}

