package seleniumProject;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium .firefox.FirefoxDriver;

import org.openqa.selenium.By;


public class Login1

{
	public static void main(String args[]) throws Exception 
	
	{

WebDriver driver = new FirefoxDriver();                             // launch browser

driver.navigate().to("http://183.82.103.245/nareshit/login.php");   // enter url

Thread.sleep(3000);

driver.findElement(By.name("txtUserName")).sendKeys("naresh");     // enter invalid user name

driver.findElement(By.name("txtPassword")).sendKeys("naresh");     // enter invalid password name

Thread.sleep(3000);

driver.findElement(By.name("Submit")).click();                     // click on login button

driver.close();                                                     // to close launched web browser


	}}

