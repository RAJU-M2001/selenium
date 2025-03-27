package com.raju;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test123 {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://api.whatsapp.com/send/?phone=919003581835&text=Hello%2C+I%27m+interested+in+Men%27s+Black+Shirt+priced+at+%E2%82%B91999.&type=phone_number&app_absent=0");
		Thread.sleep(2000);
		 WebElement chat = driver.findElement(By.xpath("//span[text()='Continue to Chat']"));
		    chat.click();
		    Thread.sleep(2000);
		    WebElement web=driver.findElement(By.xpath("//span[text()='use WhatsApp Web']"));
		    web.click();
		    Thread.sleep(2000);
	}

}
