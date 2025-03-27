package com.mini_project;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soma_Test {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://poseidon1998.github.io/ecomerce_online_clothing/index.html");
		Thread.sleep(2000);
		
		String parentWindow = driver.getWindowHandle();
		
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(5000); 
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(5000);
	    WebElement Home = driver.findElement(By.xpath("//a[text()='Home']"));
	    Home.click();
	    Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,600)");
	    Thread.sleep(5000);
	    WebElement Men = driver.findElement(By.xpath("//a[@href='Clothify4Men.html']"));
	    Men.click();
	    Thread.sleep(5000);
	    WebElement Black=driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
	    Black.click();
	    Thread.sleep(2000);
	    
	    Set<String> windowHandles = driver.getWindowHandles();
		
		for(String tabid:windowHandles) {
			if(!parentWindow.equals(tabid)) {
				driver.switchTo().window(tabid);
				break;
			}
		}
		
	   WebElement chat = driver.findElement(By.xpath("//span[text()='Continue to Chat']"));
	   chat.click();
	   Thread.sleep(2000);
	   WebElement web=driver.findElement(By.xpath("//span[text()='use WhatsApp Web']"));
	   web.click();
	   Thread.sleep(2000);
	   driver.quit();
		
		
		
	}

}
