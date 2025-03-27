package com.Testing_Project;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon_Test {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		Thread.sleep(6000);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Apple MacBook");
		
		Thread.sleep(000);
		
		WebElement searchbut = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbut.click();
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0, 500)");
		
		Thread.sleep(1000);
		
		WebElement product = driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));
		product.click();
		
		Thread.sleep(1000);
		
		Set<String> WindowHandles = driver.getWindowHandles();
		
		for(String tabid:WindowHandles)
		{
			if(!parentWindow.equals(tabid)) {
				driver.switchTo().window(tabid);
				break;
		     }
			
		}
		
		js.executeScript("window.scrollBy(0, 1000)");
		
		//WebElement cli = driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		
		//cli.click();
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
		
	}

}
