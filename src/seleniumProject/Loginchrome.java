package seleniumProject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

public class Loginchrome {
	
	public static void main(String args[]) throws Exception 
	{
		 
		WebDriver driver = new ChromeDriver();                                            // Launch browser
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");                      //enter url
		
		Thread.sleep(3000);                                                               // wait for some time
		
		System.out.println("application opened");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");                  // enter user name
		
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");                  // enter password
		
		Thread.sleep(3000);                                                              // wait for some time
		
		driver.findElement(By.name("Submit")).click();                                  // click on login button
		
		Thread.sleep(3000);                                                            // wait for some time
		
//		driver.findElement(By.li("Logout")).click();
		// click on logout 
		driver.findElement(By.linkText("Logout")).click(); 
		                                                             
		Thread.sleep(3000);                                                            
		
		driver.close();                                                          // to close launched  web browser
		
		
	}

}
