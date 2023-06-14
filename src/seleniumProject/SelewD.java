 package seleniumProject;

 import org .openqa.selenium.WebDriver;
 
 import org.openqa.selenium.firefox.FirefoxDriver;
 
 import org.openqa.selenium.chrome.ChromeDriver;
 
 import org.openqa.selenium.By;
 
   public class SelewD 
   
   {
	   public static void main(String args[]) throws Exception
	   {
	
	   WebDriver driver = new FirefoxDriver();                                 // launch browser
	   
	   driver.navigate().to("http://183.82.103.245/nareshit/login.php");       // enter url
	   
	   
	   
	   System.out.println("Application Opnened");
	   
	   
	   
	   // verify application titile (or) page titile//
	   
	   // comparision of actual result into expected result//
	   
	   if(driver.getTitle().equals("Hrms"))
	      
	   {
		   System.out.println("titile matched");
		   
	   }
	   
	   else
	   {
		   System.out.println("titile not matched");
 
	   }
 
	   driver.findElement(By.name("txtUserName")).sendKeys("nareshit");         // enter user  name
	   
	   Thread.sleep(3000);
	   	   
	   driver.findElement(By.name("txtPassword")).sendKeys("nareshit");         // enter password

	   Thread.sleep(3000);
	   
	   driver.findElement(By.name("Submit")).click();                           // click on login button
	   
	   System.out.println("Login completed"); 
	   
	   Thread.sleep(3000);
	   
	   // verify application title or page title//
	   
	   //comaprision of actual result and expected result//
	   
	   
	   if(driver.getTitle().equals("orange HRMS"))
	   
	   {
		   System.out.println("title is  matched");
	   }
	   
	   else
		   
	   {
		  System.out.println("title is not matched");
		  
		  
		  System.out.println(driver.getTitle());
		  
	   }
	   
	   driver.findElement(By.linkText("Logout")).click();                         // click on logout button
	   
	   System.out.println("logout completed");
	   
	   Thread.sleep(3000);
	 
	   
	   driver .close();                                                      // to close launched browser
	   
   }
   }
   
	   

   

	   
	   

	   
	   
	   
	   
	   

	   

	   
	   
	   
	   
 


