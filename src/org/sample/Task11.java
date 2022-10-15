package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
	private void tamil() {
		System.out.println("praveen");
	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\DELL\\eclipse-workspace\\DNNVNVNVN\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement f1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		f1.click();
		WebElement f2 = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		f2.sendKeys("iphone13pro max");
		WebElement f3 = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		f3.click();
		TakesScreenshot t = (TakesScreenshot)driver;
		File f = t.getScreenshotAs(OutputType.FILE);
		File fi = new File("D:\\Users\\DELL\\eclipse-workspace\\Screenshot\\Screenshiot\\task11.png");
		FileUtils.copyFile(f, fi);
		System.out.println("done");
		
	}

}
