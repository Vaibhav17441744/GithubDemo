package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.switchTo().alert();
		driver.switchTo().alert().dismiss();
		System.out.println("abc");
		System.out.println("xyz");
		System.out.println("hello");
		System.out.println("word");
	}
}
