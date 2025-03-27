package com.web_elements;

import org.openqa.selenium.By;
//	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements_concept {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=11493828326540706208&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9179966&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    js.executeScript("window.scrollBy(0, 3000)");
	     
		
		WebElement out = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		boolean displayed = out.isDisplayed();
		
		System.out.println(displayed);
		
		boolean displayed2 = out.isEnabled();
		
		System.out.println(displayed2);
		
		boolean selected = out.isSelected();
		
		System.out.println(selected);
		
		out.sendKeys("one pluse");
		
				
		Thread.sleep(3000);
		
		out.clear();
		
		Thread.sleep(3000);
		
		out.sendKeys("iphone");
		
		WebElement in = driver.findElement(By.id("nav-search-submit-button"));
		
		in.click();
		
		Thread.sleep(3000);
		
    	driver.quit();
		
		System.out.println("The Testing is Succusfully Executer");
		
		
	}

}
