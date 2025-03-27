package com.web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BMW_WebElement {
	
	//private static final String FileHandler = null;

	public static void main(String[]args) throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.bmw-motorrad.in/en/models/modeloverview.html");
		
		driver.manage().window().maximize();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);		
		
		WebElement MENU = driver.findElement(By.xpath("//span[@class='burger__label']"));
		
		MENU.click();
		
		Thread.sleep(3000);	
		
		WebElement Models = driver.findElement(By.xpath("(//span[@class='mainnavigation__headlineWrapper mnm-tracking-link-label'])[1]"));
		
		Models.click();
		
		Thread.sleep(3000);
		
		WebElement ADV = driver.findElement(By.xpath("(//span[@class='mainnavigation__linkWrapper mnm-tracking-link-label'])[7]"));
		
		ADV.click();
		
		Thread.sleep(3000);
		
		WebElement GS1250 = driver.findElement(By.xpath("(//span[@class='mainnavigation__linkWrapper'])[19]"));
		
		GS1250.click();
	
		Thread.sleep(3000);
		
		driver.quit();
		
		System.out.println("Prints");
		
	}
	

}
