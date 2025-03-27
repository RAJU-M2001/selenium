package com.raju;                             //DAY 2 CLASS

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Test_1 
{

	public static void main(String []args) throws InterruptedException 												
	{
		//Interface               //Class     // it happens upcasting
		WebDriver driver = new ChromeDriver() ;///it open new chrome page
	    
		driver.get("https://web.whatsapp.com/");
		
	    String title = driver.getTitle();
	    
	    System.out.println("Tittle 1:"+title);
	    
	    String currentUrl = driver.getCurrentUrl();
	    
	    System.out.println("current Url 1:"+currentUrl);
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://meet.google.com/acd-qzhb-ehj");
	    
	    Thread.sleep(5000);
	    
	    String currentUrl1 = driver.getCurrentUrl();
	    
	    System.out.println("current Url 2:"+currentUrl1);
	    
	    driver.navigate().back();
	    
	    Thread.sleep(3000);
	    
	    driver.navigate().forward();
	    
	    String title1 = driver.getTitle();
	    
	    System.out.println("Title 2 : "+title1);
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().refresh();
	    
	   driver.close();
	   
	   driver.quit();
	   
	   
	
	}
	
	
}
