package com.Testing_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vivo {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Vivo T3 5G");
		Thread.sleep(1000);
		
		WebElement select = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		select.click();
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
