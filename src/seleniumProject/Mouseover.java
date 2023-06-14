package seleniumProject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.interactions.Actions;

public class Mouseover {
	
	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver = new FirefoxDriver();                                    // launch browser
	
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");             // Enter url
		
		System.out.println(driver.getTitle());
		
		
		// enter user name
		
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("nareshit");
		
		//enter password
		
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("nareshit");
		
		Thread.sleep(3000);

		// click on login
	
		
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(4000);
		
		Actions ac= new Actions(driver);
		
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	
	System.out.println("mouse over completed");
	
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Add Employee")).click();
	
	System.out.println("clicked on submenu");
	
	//enter into frame
	
	driver.switchTo().frame("rightMenu");
	
	System.out.println("enter into frame");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("sai");         //first name
	
	Thread.sleep(500);
	
  driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("mounika");   //last  name
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//*[@id=\"txtEmpMiddleName\"]")).sendKeys("yadavalli");   //middile name
	
	Thread.sleep(4000);
	

	driver.findElement(By.xpath("//*[@id=\"txtEmpNickName\"]")).sendKeys("venkata");       //last name
	
Thread.sleep(4000);

driver.findElement(By.id("btnEdit")).click();

Thread.sleep(4000);

driver.findElement(By.className("editbutton")).sendKeys("edit");

Thread.sleep(500);

driver.findElement(By.xpath("//input[@id ='txtMilitarySer'],[@class='formInputText']")).sendKeys("military service");

Thread.sleep(3000);


driver.switchTo().defaultContent(); // Exit from frame

driver.close();
}
}


	 
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		