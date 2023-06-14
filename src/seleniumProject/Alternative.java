package seleniumProject;

import org.openqa.selenium .WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

public class Alternative {

	public static void main(String[] args)  throws Exception{
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		driver.findElement(By.name("Submit")).click();
		
		// enter into the frame
		
		driver.switchTo().frame("rightMenu");
		

		driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[a]/td[1]/input")).click();

		
		int empidcheckboxes=driver.findElements(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[1]/td[1]/input")).size();
		
		for(int i=1; i<=empidcheckboxes; i=i++)
		{
		
			//if(empidcheckboxes%2==0)
			
				System.out.println(i);

			
		
			
	}
	
	
	}
}