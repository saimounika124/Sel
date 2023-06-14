package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ssk {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 List<WebElement> ssk=driver.findElements(By.tagName("a"));
		 System.out.println(ssk.size());
		                        
		 driver.close();
		 
		
		
		

	}

}
