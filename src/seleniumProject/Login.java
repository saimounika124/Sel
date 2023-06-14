package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login

{
	public static void main(String args[]) throws Exception
	
	{
		 
		WebDriver driver = new FirefoxDriver();                                   // launch browser
		
		driver.navigate().to("http://183.82.103.245/nareshit/index.php");
		
		
		Thread.sleep(3000);                                                      // wait for sometime
		
		System.out.println("application opened");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");        //enter username
		
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");        // enter password
		
		Thread.sleep(3000);                                                      // wait for sometime

		System.out.println("login completed");
		
		driver.findElement(By.name("Submit")).click();                            //click on login button
		
		Thread.sleep(3000);                                                      // wait for sometime
		
		driver.findElement(By.linkText("Logout")).click();                            //click on logout button
		
		Thread.sleep(3000);                                                      // wait for sometime
		
		System.out.println("logout completed");
		
		driver.close();                                                         //to close launched website
	}
}




