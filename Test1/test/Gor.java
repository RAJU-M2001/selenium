package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gor {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gor-pathology.web.app/dashboard");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("rajutamilarasan1@gmail.com");
		
		WebElement f = driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[13]"));
		f.click();
		Thread.sleep(2000);
		
		WebElement d = driver.findElement(By.xpath("//div[@class='MuiBox-root jss460']"));
		d.click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
