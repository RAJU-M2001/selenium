package com.xpath_demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class X_Path {
	
	public static void main(String[]args) throws InterruptedException, IOException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://x.com/?lang=en");
		
		Thread.sleep(2000);
		
		WebElement signin = driver.findElement(By.linkText("Sign in"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", signin);
		//signin.click();
		
		Thread.sleep(3000);
		
		WebElement PEU = driver.findElement(By.xpath("//input[@name='text']"));
		
		PEU.sendKeys("rajutamilarasan1@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));

		next.click();
		
		driver.navigate();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=706230866815&hvpos=&hvnetw=g&hvrand=4420579811276024717&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9185283&hvtargid=kwd-64107830&hydadcr=14452_2391023&gad_source=1");
		
		Thread.sleep(2000);
		
		WebElement eletronic = driver.findElement(By.xpath("//a[@href='/primeday?ref_=nav_cs_td_pd_dt_cr']"));
		eletronic.click();
		
		//driver.navigate().to("https://x.com/?lang=en");
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		
		File source = sc.getScreenshotAs(OutputType.FILE);
		 
		File destination = new File("C:\\Users\\rajut\\OneDrive\\Desktop\\Selenium - Arun\\Project_Class\\Screenshot\\Homepage.png");
		 
		FileHandler.copy(source, destination);
		 
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	}
	

	

}
