package com.locators_demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_com {


	
		
		public static void main(String[]args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(1000);
			WebElement rrrr = driver.findElement(By.xpath("//span[text()='Electronics']"));
			rrrr.click();
			Thread.sleep(1000);
			driver.quit();
			
		}
	

	}

