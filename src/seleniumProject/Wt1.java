package seleniumProject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org .openqa.selenium.By;

public class Wt1 
{
	
	//test steps//
	public static void main(String[] args)throws Exception {
		
		WebDriver driver= new FirefoxDriver();                                  //launch browser
		
		driver.navigate().to("file:///C:/Users/YV%20SAI%20MOUNIKA/Desktop/personal/Downloads/WebTable.html"); // enter url
		
		//count
		
		//int row = driver.findElement(By.xpath("//*[@id=\'idCourse\']/tbody/tr"))
		int row=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
		
		int col = driver.findElements(By.xpath("//*[@id=\'idCourse\']/tbody/tr[1]/td")).size();
		
		int row_col = driver.findElements(By.xpath("//*[@id=\'idCourse\']/tbody/tr/td")).size();
		
		System.out.println("Row count"     +row);
		
		System.out.println("col count "    +col);

		System.out.println("row_col count" +row_col);
		
		//data _cell
		
		String celldata=driver.findElement(By.xpath("//*[@id=\'idCourse\']/tbody/tr[4]/td[3]")).getText();
		
		System.out.println(celldata);
		
		//data table
		
		
		for(int k=1;k<=row;k++)
		{
				
		String data= driver.findElement(By.xpath("//*[@id=\'idCourse\']/tbody/tr["+k+"]")).getText();
			
			System.out.println(data);
			
			Thread.sleep(3000);
			
		}
		
		for(int j=1;j<=col;j++)
		
		{
			
			String data= driver.findElement(By.xpath("//*[@id=\'idCourse\']/tbody/tr["+j+"]")).getText();
			
			System.out.println(data);
			
			Thread.sleep(3000);
		}
	}

}