package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Standalone {

	public static void main(String[] args) throws InterruptedException {
		
      /*  ChromeOptions options = new ChromeOptions();

//To set the zoom level in chromedriver as 90%

        options.addArguments("--force-device-scale-factor=0.9");

        options.addArguments("--high-dpi-support=1"); */
		String productname = "ZARA COAT 3";
		
           WebDriver driver=new ChromeDriver(); 
           
           driver.get("https://rahulshettyacademy.com/client");
           driver.manage().window().maximize();
           driver.findElement(By.id("userEmail")).sendKeys("vaibhavsyadav1101@gmail.com");
	       driver.findElement(By.id("userPassword")).sendKeys("Nita@1902");
	       driver.findElement(By.id("login")).click();
	       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
	       List<WebElement> products= driver.findElements(By.cssSelector(".mb-3"));
	       WebElement prod=products.stream().filter(product-> 
	       product.findElement(By.cssSelector("b")).getText().equals(productname)).findFirst().orElse(null); // stram section  // store produvt habing zara code
	       prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();    //adding to cart product
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
	       wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
	       driver.findElement(By.cssSelector("button[routerlink*='cart']")).click();
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".totalRow button")));
	       List<WebElement> cartproducts=driver.findElements(By.cssSelector(".cartSection h3"));
	       boolean b=cartproducts.stream().anyMatch(cartprod->  cartprod.getText().equalsIgnoreCase(productname));
	       Assert.assertTrue(b);                                // putting validation to verify product added in cart
	      // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".totalRow button")));
	       driver.findElement(By.cssSelector(".totalRow button")).click();  //checkout button
	       Actions a=new Actions(driver);
	       a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")),"india").build().perform();
	       JavascriptExecutor js=(JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,500)");
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
	       driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
	      // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='btnn action__submit ng-star-inserted']")));
	      // Thread.sleep(2000);
	       driver.findElement(By.cssSelector(".action__submit")).click();
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".hero-primary")));
	       String confirmessage=driver.findElement(By.cssSelector(".hero-primary")).getText();
	       
	       Assert.assertEquals(confirmessage, "THANKYOU FOR THE ORDER.");
	      
	}
	

}
