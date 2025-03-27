package com.raju;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_day_1 {
	
	public static void main(String[]args)
	{
		WebDriver driver = new ChromeDriver(); 
		
        driver.get("https://web.whatsapp.com/");
        
        String title = driver.getTitle();
        
        System.out.println(title);
        
        String currrentUrl = driver.getCurrentUrl();
        
        System.out.println(currrentUrl);
        		
	}

}
