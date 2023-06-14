package seleniumProject;


import org.openqa.selenium .WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Facebooklogin1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://accounts.google.com/");
		
		driver.findElement(By.name("identifier")).sendKeys("mounikasaiyadavalli228@gmail.com");
		
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		
		
		
		driver.findElement(By.name("Passwd")).sendKeys("Mouni@228");
	
		
		
		
	}

}
