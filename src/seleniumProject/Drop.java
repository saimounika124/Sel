package seleniumProject;

import org.openqa.selenium .WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;


public class Drop {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");        // url
	
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");         //username
		
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");          // password
		
		driver.findElement(By.name("Submit")).click();            // login
		
		Thread.sleep(3000);
		
		System.out.println("login completed");
		
		// enter into frame
		
		driver.switchTo().frame("rightMenu");
		
		//select the value from search by  drop down
		
		Select st = new Select(driver.findElement(By.name("loc_code")));
		
		st.selectByVisibleText("Emp. ID");
		
		st.selectByValue("0");
		
		st.selectByIndex(1);
		
		st.selectByValue("0");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("loc_name")).sendKeys("8557");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();          //click on search button
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("chkLocID[]")).click();                      //click on check box
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Delete']")).click();        //click on delete button
		
		Thread.sleep(3000);
		
		//Exit from frame
		
		driver.switchTo().defaultContent();   
		
		driver.findElement(By.linkText("Logout")).click();                    //click on logout button
		
		Thread.sleep(3000);

		driver.close();

		}
	
}
