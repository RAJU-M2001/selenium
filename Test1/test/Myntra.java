package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Actions sc=new Actions(driver);
		WebElement b = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
		sc.moveToElement(b).perform();
		Thread.sleep(2000);
		
		WebElement oil = driver.findElement(By.xpath("//a[text()='Hair Oil']"));
		oil.click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
