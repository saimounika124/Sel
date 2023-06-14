package seleniumProject;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;


public class Practicemouse {

	public static void main(String[] args)  throws Exception {
		
		WebDriver driver = new ChromeDriver();                                          //url
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");             //navigate url
		
		//enter username
		
		
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("nareshit");
		
		//enter password
		
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("nareshit");
		
		Thread.sleep(3000);
		
	//click on login button
		
		
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(4000);
		
		// performing mouse over action for PIM module
		
	Actions ac= new Actions (driver);
	
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	
	Thread.sleep(3000);
	
	
	//performing mouse over action on employee list
	
	Actions cc = new Actions (driver);
	
	cc.moveToElement(driver.findElement(By.linkText("Employee List"))).perform();
	
Thread.sleep(3000);

//to  performing click action on employee list


driver.findElement(By.linkText("Employee List")).click();

Thread.sleep(5000);

//performing mouse over action on add employee

Actions ac1= new Actions (driver);

ac1.moveToElement(driver.findElement(By.linkText("PIM"))).perform();

Thread.sleep(3000);

//performing mouse over action on add employee

Actions dc= new Actions(driver);

dc.moveToElement(driver.findElement(By.linkText("Add Employee"))).perform();

Thread.sleep(3000);

//to performing the click action on add employee

driver.findElement(By.linkText("Add Employee")).click();

Thread.sleep(3000);

//click change password//

driver.findElement(By.linkText("Change Password")).click();

Thread.sleep(3000);




//click  action on log out

driver.findElement(By.linkText("Logout")).click();

Thread.sleep(4000);







	}


	}