package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_intro {

	public static void main(String[] args) throws InterruptedException {
		//Invoking browser
		//ChromeDriver  interfaces enforce contract/rules class must follow)
		WebDriver driver=new ChromeDriver();
		  
		driver.get("https://www.flipkart.com/");
		String originalWindow = driver.getWindowHandle(); 
		Thread.sleep(5000);
	//	driver.navigate().to("https://www.amazon.in/");
	//	driver.navigate().back();
	     driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().window(originalWindow); //switch back to original
		System.out.println("after switcg back"+driver.getCurrentUrl());
		Thread.sleep(3000);
        driver.close();
        
	}

}
