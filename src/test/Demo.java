package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="vaib";
		
		WebDriver driver=new ChromeDriver();
		String pass=getpassword(driver);  //passing password
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// implicity wait global wait
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(pass); //p
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
		  driver.findElement(By.cssSelector(".reset-pwd-btn")).click();//
		  System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		  
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		String [] passarry=passwordText.split("'");
		String password=passarry[1].split("'")[0].trim();
		
		return password;
	}

}
