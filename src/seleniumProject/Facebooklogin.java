package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebooklogin

{
	
	public static void main(String[] args)  throws Exception{
		
	
	WebDriver driver = new 	ChromeDriver();                                              // launch browser
	
	driver.navigate().to("https://www.facebook.com/");                                    // enter url
	
	driver.findElement(By.name("email")).sendKeys("saimounikayadavalli228@gmail.com");        // enter login email id or phone number
	
	driver.findElement(By.name("pass")).sendKeys("facebook345");                            // enter password
	
	driver.findElement(By.name("login")).click();                                       // click login button

	
	driver.findElement(By.linkText("Log Out")).click();                         // click on logout 
	
	driver.close();                                                                 // close  application or browser
}
		

}
