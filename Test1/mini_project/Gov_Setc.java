package com.mini_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gov_Setc {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tnstc.in/");
		Thread.sleep(1000);
		WebElement From = driver.findElement(By.xpath("//input[@placeholder='From Place']"));
		From.sendKeys("Mayiladuthurai");
		Thread.sleep(1000);
		
		
	}

}
