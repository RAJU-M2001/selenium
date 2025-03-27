package com.mini_project;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Magento_Testing {
	
	public static void main(String[]args) throws InterruptedException, AWTException, IOException
	{
		WebDriver driver =new ChromeDriver();
	 	driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		
		String parentWindow = driver.getWindowHandle();
		
		Thread.sleep(3000);
	
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    WebElement createAccount = driver.findElement(By.linkText("Create an Account"));
		createAccount.click();
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstname']"));
		firstName.sendKeys("Raju");
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastname']"));
		lastName.sendKeys("M");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("rajumoffcial99@gmail.com");
		Thread.sleep(2000);
		
		WebElement passward = driver.findElement(By.id("password"));
		passward.sendKeys("RajuM@8989");
		Thread.sleep(2000);
		
		WebElement confirmPassword = driver.findElement(By.name("password_confirmation"));
		confirmPassword.sendKeys("RajuM@8989");
		Thread.sleep(2000);
		
		WebElement createAnAccount = driver.findElement(By.linkText("Create an Account"));
		createAnAccount.click();
		
		driver.navigate().back();
		
		Actions ac=new Actions(driver);
		
		WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
		ac.moveToElement(men).perform();
		Thread.sleep(1000);
		
		WebElement top = driver.findElement(By.xpath("(//span[text()='Tops'])[2]"));
		ac.moveToElement(top).perform();
		Thread.sleep(1000);

		WebElement Hoodies = driver.findElement(By.xpath("(//span[text()='Hoodies & Sweatshirts'])[2]"));
		ac.moveToElement(Hoodies ).perform();
		Hoodies.click();
		Thread.sleep(1000);
		
		WebElement sort = driver.findElement(By.id("sorter"));
		Select s = new Select(sort);
		s.selectByIndex(2);
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0, 100)");
		
		WebElement mat = driver.findElement(By.xpath("//div[text()='Material']"));
		mat.click();
		Thread.sleep(1000);
		
		
		WebElement hamp = driver.findElement(By.xpath("//a[@href=\"https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html?material=145&product_list_order=price\"]"));
		hamp.click();
		Thread.sleep(1000);
		
			WebElement prodect = driver.findElement(By.xpath("//li[@class=\"item product product-item\"]"));
			ac.contextClick(prodect).perform();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			
			Thread.sleep(1000);
			
			Set<String> WindowHandles = driver.getWindowHandles();
			
			for(String tabid:WindowHandles)
			{
				if(!parentWindow.equals(tabid)) {
					driver.switchTo().window(tabid);
					break;
			     }
				
			}
			Thread.sleep(2000);
		
		WebElement Size = driver.findElement(By.id("option-label-size-143-item-168"));
		Size.click();
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0, 100)");
		
		WebElement color = driver.findElement(By.id("option-label-color-93-item-53"));
		color.click();
		Thread.sleep(1000);
		
		WebElement QT = driver.findElement(By.id("qty"));
		QT.clear();
		QT.sendKeys("4");
		Thread.sleep(1000);
		
		driver.switchTo().window(parentWindow);  
		
		Thread.sleep(1000);
		
		WebElement clear= driver.findElement(By.xpath("//a[@class='action clear filter-clear']"));
		clear.click();
		
		Thread.sleep(1000);
		
		WebElement size1 = driver.findElement(By.xpath("(//div[@class='filter-options-title'])[1]"));
		size1.click();
		Thread.sleep(1000);
		
		WebElement option = driver.findElement(By.xpath("(//div[@class='swatch-option text '])[4]"));
		option.click();
		Thread.sleep(1000);
		
		WebElement color2 = driver.findElement(By.xpath("(//div[@class='filter-options-title'])[2]"));
		color2.click();
		Thread.sleep(1000);
		
		WebElement c3 = driver.findElement(By.xpath("(//div[@class='swatch-option color '])[9]"));
		c3.click();
		Thread.sleep(1000);
		
		WebElement hoodie = driver.findElement(By.xpath("(//li[@class='item product product-item'])[1]"));
		ac.moveToElement(hoodie).perform();
		Thread.sleep(1000);
		
		WebElement add2 = driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]"));
		add2.click();
		Thread.sleep(1000);
		
		WebElement home = driver.findElement(By.xpath("(//a[@href=\"https://magento.softwaretestingboard.com/\"])[2]"));
		home.click();
		Thread.sleep(1000);
		
		
		WebElement card = driver.findElement(By.xpath("//*[@data-block=\"minicart\"]"));
	    card.click();
        Thread.sleep(3000);
	
        WebElement view = driver.findElement(By.xpath("//span[text()='View and Edit Cart']"));
		view.click();
		Thread.sleep(3000);
		
		WebElement QUT = driver.findElement(By.xpath("//input[@title='Qty']"));
		QUT.clear();
		QUT.sendKeys("2");
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./Screenshot/SSS.png");
		FileHandler.copy(source, destination);
		
		WebElement update = driver.findElement(By.xpath("//button[@name='update_cart_action'][2]"));
		update.click();
		Thread.sleep(1000);

		WebElement pro = driver.findElement(By.xpath("//button[@data-role='proceed-to-checkout']"));
		js.executeScript("arguments[0].click();", pro);
		Thread.sleep(2000);
		
		WebElement em = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
		em.sendKeys("rajumofficial99@gmail.com");
		Thread.sleep(2000);
	
		WebElement firstname= driver.findElement(By.name("firstname"));
		firstname.sendKeys("Raju");
		Thread.sleep(2000);
		
		WebElement name1 = driver.findElement(By.name("lastname"));
		name1.sendKeys("M");
		Thread.sleep(2000);
		
		WebElement street = driver.findElement(By.name("street[0]"));
		street.sendKeys("M.H Colony");
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Chennai");
		Thread.sleep(2000);
		
		WebElement c = driver.findElement(By.name("country_id"));
		Select s4=new Select(c);
		s4.selectByVisibleText("India");
		Thread.sleep(2000);
		
		WebElement sstate = driver.findElement(By.name("region_id"));
		Select s3=new Select(sstate);
		s3.selectByVisibleText("Tamil Nadu");
		Thread.sleep(2000);
		
		WebElement postcode = driver.findElement(By.name("postcode"));
		postcode.sendKeys("600029");
		Thread.sleep(2000);
		
		WebElement phone = driver.findElement(By.name("telephone"));
		phone.sendKeys("9629113839");
		Thread.sleep(3000);
		
		WebElement next = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		next.click();
		Thread.sleep(3000);
		
		WebElement placeorder = driver.findElement(By.xpath("//span[text()='Place Order']"));
		placeorder.click();
	    Thread.sleep(3000);
		
	
		File source1 = ts.getScreenshotAs(OutputType.FILE);
		File destination1=new File("./Screenshot/SS.png");
		FileHandler.copy(source1, destination1);
		
		
		System.out.println("Automation test has been Susscessfully completed");
		
		
		driver.quit();
		
	}

}
