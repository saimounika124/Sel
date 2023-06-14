package seleniumProject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

public class WebTable {
	
public static void main(String[] args) throws Exception {
	
	//test steps
	
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("file:///C:/Users/YV%20SAI%20MOUNIKA/Desktop/personal/Downloads/WebTable.html");
	
	// count
	
	int row = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
	 
	
	int col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
	
	 
	int row_col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();

	System.out.println("Row Count " + row);
	
	System.out.println("Col Count " + col);
	
	System.out.println("Row_Col Count " + row_col);
	
	//Data - Cell
	
	String celldata = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
	
	System.out.println(celldata);
	
	//data table
	
	for(int i=1; i<=row;i++)          // for row

	{
	
	String data = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
	
	System.out.println(data);
	Thread.sleep(3000);
	}
	
	for(int j=1;j<=col;j++)     // for coloumn 
	{
		String data1 = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr/td["+j+"]")).getText();
		System.out.println(data1);
	}
	driver.close();
	}
	}
	
	
	
	
	
	