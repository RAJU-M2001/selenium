package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filp {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		fashion.click();
		Thread.sleep(2000);
		
		Actions ac=new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
		ac.moveToElement(men).perform();
		Thread.sleep(2000);
		
		WebElement men2 = driver.findElement(By.xpath("//a[@class='_3490ry'][2]"));
		men2.click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
