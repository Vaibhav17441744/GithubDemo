package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="vaibhav";
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// implicity wait global wait
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("sam");
		driver.findElement(By.className("signInBtn")).click();
		String s=driver.findElement(By.cssSelector("p.error")).getText(); //css Selector
		System.out.println(s);
		driver.findElement(By.linkText("Forgot your password?")).click();//linkedtext
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("vaibhav"); //xpath
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("vaib@gmail.com");//xpath
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();   // clear email using xpath indexing
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("vaib@gmail.com");
		//driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("1234");
		  driver.findElement(By.xpath("//form/input[3]")).sendKeys("123");
		  driver.findElement(By.cssSelector(".reset-pwd-btn")).click();// click on reset button
		
		  System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		  driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("vaib");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); //regula expression css
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); // regular expression xpath
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
	   Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	   driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		;
	
	}

}
