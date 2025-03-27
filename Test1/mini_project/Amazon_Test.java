package com.mini_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Test {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement Search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		Search.sendKeys("Iphone16Pro");
		Thread.sleep(3000);
		WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0, 1500)");
		
		WebElement cl = driver.findElement(By.id("productRating_LSTMOBH4DQFQR3BH2VTHEFSV3_MOBH4DQFQR3BH2VT_"));
		cl.click();
		Thread.sleep(3000);
		
		WebElement dd = driver.findElement(By.xpath("//button[@class='QqFHMw AMnSvF v6sqKe']"));
		dd.click();
		
		driver.navigate().back();

		Thread.sleep(3000);
		driver.quit();
		
	}

}
