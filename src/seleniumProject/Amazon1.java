package seleniumProject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

public class Amazon1 

{
	
	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();
		
driver.navigate().to("https://www.amazon.com/");

driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();

driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();	
		
	}

}
