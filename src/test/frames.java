package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		// driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		 driver.switchTo().frame(0);
		 driver.findElements(By.tagName("iframe")).size(); // get list of iframes
		 WebElement a=driver.findElement(By.id("draggable"));
		 WebElement b=driver.findElement(By.id("droppable"));
		 
		Actions action=new Actions(driver);
				action.dragAndDrop(a, b).build().perform();
				
			
	}

}
