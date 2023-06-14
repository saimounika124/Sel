package seleniumProject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

import org.openqa.selenium.By;

public class Row_coloumn 
{
	public static void main(String[] args) throws Exception {
		
		//test steps

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("C:\\Users\\YV SAI MOUNIKA\\Desktop\\personal\\Downloads\\WebTable.html");
		
		// count row
		
		int row= driver.findElements(By.xpath("//*[@id=\'idCourse\']/tbody/tr")).size();
		
		int col = driver.findElements(By.xpath("//*[@id=\'idCourse\']/tbody/tr/td[1]")).size();
		
		int row_col =driver.findElements(By.xpath("//*[@id=\'idCourse\']/tbody/tr/td")).size();
		
		System.out.println("Row count "+row);
		
		System.out.println("col count"+col);
		
		System.out.println("row_col count"+row_col);
	
		//data-cell//
		

		String celldata= driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[3]/td[3]")).getText();
		
		System.out.println(celldata);
		
		// data table
		
		for( int i=1 ; i<=row; i++)
		{
		String data= driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
		
           System.out.println(data);

                Thread.sleep(3000);

		}
		
		for (int j=1; j<=col ;j++)
		{
			String data1= driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td["+j+"]")).getText();
			
			System.out.println(data1);
            Thread.sleep(3000);

			
			
		}
		
		driver.close();
	}

}