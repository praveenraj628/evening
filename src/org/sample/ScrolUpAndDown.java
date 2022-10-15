package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolUpAndDown {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\DELL\\eclipse-workspace\\DNNVNVNVN\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		driver.manage().window().maximize();
		JavascriptExecutor j = (JavascriptExecutor)driver;
	WebElement f1 = driver.findElement(By.xpath("(//img[@src='images/loadrunner-training.png'])[1]"));
	j.executeScript("arguments[0].scrollIntoView(true)", f1);
	TakesScreenshot t = (TakesScreenshot)driver;
	File screenshotAs = t.getScreenshotAs(OutputType.FILE);
	
	File f = new File("D:\\Users\\DELL\\eclipse-workspace\\Screenshot\\Screenshiot\\fb3.png");
	FileUtils.copyFile(screenshotAs,f );
	
	Thread.sleep(3000);
	WebElement f2 = driver.findElement(By.xpath("(//img[@src='images/greenstechnologys_logo.png'])[1]"));
Object executeScript = j.executeScript("arguments[0].scrollIntoView(true)", f2);


	

	}

}
