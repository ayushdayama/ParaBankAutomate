package ParaBank.ParaBankAutomate;

import java.io.*;
import java.time.*;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.*;

public class paraBankMain
{
	/* DECLARATIONS */
		WebDriver driver;
		Properties loginProp;
	
	@BeforeTest
	public void setUp() throws Exception {
		try {
			FileReader propFileReader = new FileReader("./src/lib/login.properties");  
		    loginProp = new Properties();
		    loginProp.load(propFileReader);
		    
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
			paraBankTest();
		}
		catch(Exception e) {
    		System.out.println("Exception occured, issue desc: " + e.toString());
    	}
	}
	
    @Test
    public void paraBankTest() {
    	try {
	    	driver.get(loginProp.getProperty("url"));
	    	driver.findElement(By.xpath("//div[@id='loginPanel']/form/div[1]/input")).sendKeys(loginProp.getProperty("username"));
	    	driver.findElement(By.xpath("//div[@id='loginPanel']/form/div[2]/input")).sendKeys(loginProp.getProperty("password"));
	    	driver.findElement(By.xpath("//div[@id='loginPanel']/form/div[3]/input")).click();
    	}
    	catch(Exception e) {
    		System.out.println("Exception occured, issue desc: " + e.toString());
    	}
    }
}