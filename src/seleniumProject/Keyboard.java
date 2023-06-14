
package seleniumProject;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	
public static void main(String[] args) throws Exception {
		
		
		WebDriver driver = new FirefoxDriver();                                    // launch browser
	
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");             // Enter url
		
		System.out.println(driver.getTitle());
		
		
		// enter user name
		
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("nareshit");
		
		//enter password
		
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("nareshit");
		
		Thread.sleep(3000);
		
		//click on login button//
		
		Robot s = new Robot();             //object

		
		s.keyPress(KeyEvent.VK_TAB);       //
		
		s.keyRelease(KeyEvent.VK_TAB);
		
		System.out.println("TAB");
		
		Thread.sleep(3000);
		
		s.keyPress(KeyEvent.VK_ENTER);
		
		s.keyPress(KeyEvent.VK_ENTER);
		
		System.out.println("ENTER");
		
		Thread.sleep(3000);
		
		//enter into frame
		
 driver.switchTo().frame(0);
 
 driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")).click();
		
	Robot s1 = new Robot();
	
		s1.keyPress(KeyEvent.VK_TAB);
		
		s1.keyRelease(KeyEvent.VK_TAB);
				
		System.out.println("TAB");
		
			Thread.sleep(3000);
		
		s1.keyPress(KeyEvent.VK_ENTER);
		
		s1.keyRelease(KeyEvent.VK_ENTER);
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"txtEmpLastName\"]")).sendKeys("venkata sai");      // first name
		
		Thread.sleep(3000);
	
		
		  driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("mounika");   //middile  name
			
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"txtEmpMiddleName\"]")).sendKeys("yadavalli");    // last name
		
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//*[@id=\"txtEmpNickName\"]")).sendKeys("venkata");       //nick  name
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"txtEmpFirstName\"]")).sendKeys("sai ");         // last name
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("savebutton")).click();   // click 
		
		Thread.sleep(2000);
		
		
		
		
			
	
		
		
		
		
              //click on robot 
//		
//		Robot s2 = new Robot();
//		
//		s2.keyPress(KeyEvent.VK_TAB);
//		
//		s2.keyRelease(KeyEvent.VK_TAB);
//		
//		
//		System.out.println("TAB");
//		
//		Thread.sleep(3000);
//		
//		s2.keyPress(KeyEvent.VK_ENTER);
//		
//		s2.keyRelease(KeyEvent.VK_ENTER);
//		
//		Thread.sleep(3000);

		
			
			
		
		
		
		
		
		}  }
