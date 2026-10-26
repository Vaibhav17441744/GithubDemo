package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Scrrenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File source=ts.getScreenshotAs(OutputType.FILE);
		 File Destination=new  File("C:\\Users\\Vaibhav\\eclipse-workspace\\Introduction\\target\\image.png");
		 FileUtils.copyFile(source, Destination);
		 

	}

}
