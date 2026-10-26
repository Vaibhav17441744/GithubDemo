package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		int no=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	     System.out.println(no);
	    WebElement checkbox= driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
	    
	    checkbox.click();
	   // System.out.println(checkbox.isSelected());
        Assert.assertFalse(checkbox.isSelected());
	}

}
