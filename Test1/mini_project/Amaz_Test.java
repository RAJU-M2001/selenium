package com.mini_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amaz_Test {
	
   public static void main(String[]args) throws InterruptedException
   {
	   WebDriver driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.amazon.in/");
	   Thread.sleep(1000);
	   
	   WebElement Search = driver.findElement(By.xpath("//input[@type='text']"));
	   Search.sendKeys("Rynox Gloves");
	   Thread.sleep(1000);
	   
	   WebElement Sub = driver.findElement(By.xpath("//input[@type='submit']"));
	   Sub.click();
	   Thread.sleep(1000);

	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0, 1000)");
	   Thread.sleep(1000);
	   
	   WebElement clic = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[5]"));
	   clic.click();
	   
	   //js.executeScript("window.scrollBy(0, 1000)");
	   Thread.sleep(5000);
	   
	   WebElement siz = driver.findElement(By.xpath("//li[@id='size_name_2']"));
	   siz.click();
	   Thread.sleep(1000);
	   
	   
	   System.out.println("Amazon Web Testing Is Succesfully Completed");
	   
	   
	   driver.quit();
	   
	   
	   }
}
