package seleniumProject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

public class Tc001

{
	public static void main(String args[])throws Exception

	
	{
		WebDriver driver = new ChromeDriver(); 
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(3000);
		driver.close();
  
	}
	}

