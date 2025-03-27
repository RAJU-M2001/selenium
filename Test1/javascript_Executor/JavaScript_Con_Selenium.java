package com.javascript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript_Con_Selenium {
	
	public static void main(String[]args) throws InterruptedException
	{
			
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dainese.com/us/en/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement ind = driver.findElement(By.xpath("(//div[contains(text(),'India')])[2]"));
		ind.click();
		
		WebElement accept = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
		accept.click();
		
		WebElement MC = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle')]"));
		MC.click();
		
		Actions ac=new Actions(driver);
		ac.moveToElement(MC).perform();
		
		Thread.sleep(2000);
		
		WebElement jack = driver.findElement(By.linkText("Jackets"));
		ac.moveToElement(jack).perform();
		jack.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    js.executeScript("window.scrollBy(0, 2000)");
	    
	    Thread.sleep(2000);
	    
	   // js.executeScript("window.scrollBy(0, -1000)");
	    
	   // Thread.sleep(2000);
	    
	    WebElement jk = driver.findElement(By.xpath("//h2[contains(text(),'SPRINGBOK 3L ABSOLUTESHELL™ JACKET')]"));  
	    
	    jk.click();
	    //WebElement MR = driver.findElement(By.xpath("//button[contains(text(),'More Results')]"));
	    //MR.click();	
	    
	    WebElement size = driver.findElement(By.xpath("(//span[text()=44])[2]"));
	    size.click();
	    
	    Thread.sleep(2000);
	    
	    WebElement Add = driver.findElement(By.xpath("(//button[contains(text(),'Add to Cart')])[2]"));
	    js.executeScript("arguments[0].click();", Add);
		//Add.click();
		
		driver.navigate().back();
		
		WebElement card = driver.findElement(By.xpath("(//a[@href='https://www.dainese.com/us/en/cart/'])[2]"));
		card.click();
		
		driver.navigate().back();
		
		System.out.println("Cart Has been click Sucessfully");
		driver.quit();
		
		
		
		
		
	}
	
	
	

}
