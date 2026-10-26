package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		 driver.findElement(By.xpath("//a[text()='Free Access to InterviewQues/ResumeAssistance/Material']")).click();
		 Set<String> windows=driver.getWindowHandles();
		 Iterator<String> ids=windows.iterator();
		 String parentid=ids.next();
		 String childid=ids.next();
		 driver.switchTo().window(childid);
		 
	}

}
