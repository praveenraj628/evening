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

public class Task12 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\DELL\\eclipse-workspace\\DNNVNVNVN\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement f1 = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		f1.sendKeys("hp laptop");
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.xpath("(//span[@class='searchTextSpan'])"));
		findElement.click();
		TakesScreenshot t = (TakesScreenshot)driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		File f = new File("D:\\Users\\DELL\\eclipse-workspace\\Screenshot\\Screenshiot\\Task12.png");
	
		FileUtils.copyFile(screenshotAs, f);
	}

}
