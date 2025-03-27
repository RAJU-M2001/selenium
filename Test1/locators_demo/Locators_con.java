package com.locators_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_con {
	
	public static void main(String[]args) throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//driver.getElement = driver.findElement(By.id("email"));
		WebElement email = driver.findElement(By.id("email")); 
		
		email.sendKeys("rajutamilarasan1@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		
		password.sendKeys("Raju@1234");
		
		Thread.sleep(2000);
		
		password.clear();
		
		Thread.sleep(1000);
		
		password.sendKeys("Raju@12345");
		 
		WebElement icon = driver.findElement(By.className("_9lsa"));
		
		icon.click();
		
		WebElement login = driver.findElement(By.name("login"));
		
		login.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		WebElement create = driver.findElement(By.linkText("Create new account"));
		
	    create.click();
	    
	    Thread.sleep(2000);
	     
	    WebElement FirstName = driver.findElement(By.name("firstname"));
	    
	    FirstName.sendKeys("Raju");
	    	
	    Thread.sleep(2000);	
	    
	    WebElement LastName = driver.findElement(By.name("lastname"));
	    
	    LastName.sendKeys("Muthukumar");
	    
	   // Thread.sleep(2000);
	    
	    
	    WebElement ME = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	    
	    ME.sendKeys("rajutamilarasan1@gmail.com");
	    
	    Thread.sleep(2000);
	    
	    ME.clear();
	    
	    ME.sendKeys("9629113839");
	    
	    Thread.sleep(2000);
	    
	    WebElement NP = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		
		NP.sendKeys("123654789");
		
		Thread.sleep(2000);
		
		NP.clear();
		
		NP.sendKeys("LaraM&123!");
		
		//NP.clear();
		
		WebElement day = driver.findElement(By.id("Day"));
		
		day.sendKeys("11");
		
		WebElement month = driver.findElement(By.id("Month"));
		
		month.sendKeys("Aug");
		
		WebElement year = driver.findElement(By.id("Year"));
		
		year.sendKeys("2000");
		
		WebElement female = driver.findElement(By.name("Female"));
		
		female.click();
		
		Thread.sleep(2000);
		
		
		female.clear();
		
		WebElement male = driver.findElement(By.name("Male"));
		
		male.click();
		
		//WebElement GO = driver.findElement(By.name("Sign Up"));
		
		//GO.click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
