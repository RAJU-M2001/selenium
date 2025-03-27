package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Test {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
			
		WebElement Try = driver.findElement(By.xpath("//a[text()='Try different image']"));
		
		Try.click();
		
		js.executeScript("window.scrollBy(0, 100)");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		search.sendKeys("sony mark 4");
		
		WebElement se = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		se.click();
		
		WebElement po = driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[2]"));
		
		po.click();
		
		Thread.sleep(1000);

		Thread.sleep(8000);  
		
		driver.quit();
		
	}

}
