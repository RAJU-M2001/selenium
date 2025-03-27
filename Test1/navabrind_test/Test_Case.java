package navabrind_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		WebElement mobile=driver.findElement(By.xpath("(//div[@class='YBLJE4'])[2]"));
		mobile.click();
		Thread.sleep(3000);
		
		driver. navigate(). back();
		
		WebElement Search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		Search.sendKeys("Iphone 15pro max");
		
		WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		
		Thread.sleep(3000);
		
		driver.quit();		
		
	}
	
	
	

}
