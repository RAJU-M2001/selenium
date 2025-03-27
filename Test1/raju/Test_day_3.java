package com.raju;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test_day_3 {
	
	public static void main(String[]args) throws InterruptedException, IOException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//WebElement email = driver.findElement(By.id("email"));
		WebElement e = driver.findElement(By.xpath("//input[@id='email']"));
		e.sendKeys("rajutamilarasan1@gmail.com");
		
		Thread.sleep(3000);
				
		WebElement password= driver.findElement(By.id("pass"));
		password.sendKeys("raju123");
		
		WebElement cr = driver.findElement(By.xpath("//a[text()='Create new account']"));
		cr.click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./sfssgg/dgdh.png");
		FileHandler.copy(source, des);
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
