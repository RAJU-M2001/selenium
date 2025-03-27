package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static void browserLaunch(String browserName, String url) {
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")) {
			driver=new SafariDriver();	
		}
		
		driver.manage().window().maximize();
		driver.get(url);		
	}
	public static void getTitle() {
		driver.getTitle();
	}
	public static void getCurrentUrl() {
		driver.getCurrentUrl();
	}
	public static void navigate(String option,String url) {
		
		if(option.equalsIgnoreCase("to")) {
			
		}
	}

}
