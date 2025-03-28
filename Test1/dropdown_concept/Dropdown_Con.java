package com.dropdown_concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Con {
	
	public static void main(String[]args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		driver.manage().window().maximize();
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		Select s = new Select(fruits);
		
		boolean multipe = s.isMultiple();
		System.out.print(multipe);
		
		s.selectByValue("2");
		
		List<WebElement> options = s.getOptions();
		
		System.out.print("Using for each");
		
		for(WebElement alloptions : options)
		{
			String text = alloptions.getText();
			System.out.println(text);
		}
		
		//WebElement sp = driver.findElement(By.id("superheros"));
		

		
		
		driver.quit();
		
		}
}

