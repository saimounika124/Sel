package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileuploading1 {
	
	public static void main(String args[]) throws Exception{
		
      //  System.setProperty("webdriver.gecko.driver", "");

		
	WebDriver driver = new FirefoxDriver();
	
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");            // user name
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("nareshit"); // password
	
	driver.findElement(By.xpath("//input[@type='Submit']")).click();       // login
	
	Thread.sleep(2000);
	
	//enter into the frame
	driver.switchTo().frame("rightMenu");
	
    driver.findElement(By.xpath("//input[@value='Add']")).click();  //click on add button
	
	Thread.sleep(2000);
			

	driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("sai");         //first name
	
	driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("mounika"); //last name

// to upload a file
	
	WebElement fileInput = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']")); 
		

fileInput.sendKeys("C:\\flower jpg\\Leucanthemum_vulgare_'Filigran'_Flower_2200px.jpg");
	Thread.sleep(2000);
	
	   System.out.println("File uploaded successfully");

	 	driver.findElement(By.id("btnEdit")).click();
	 	
	 	Thread.sleep(2000);
	 	
	 	 System.out.println("file upload succesfully");
	
	 	driver.switchTo().defaultContent();
	 	
	 	driver.findElement(By.linkText("Logout")).click();
	 	
	 	Thread.sleep(2000);
	 	
	 	driver.close();
	
	
	}

	
}
