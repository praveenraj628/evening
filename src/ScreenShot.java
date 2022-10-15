import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","D:\\Users\\DELL\\eclipse-workspace\\Screenshot\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	TakesScreenshot t =(TakesScreenshot) driver;
	File screenshotAs = t.getScreenshotAs(OutputType.FILE);
	
	
	File f = new File("D:\\Users\\DELL\\eclipse-workspace\\Screenshot\\Screenshiot\\fb.png");
	FileUtils.copyFile(screenshotAs, f);
	
	System.out.println("done");
	
	
	
	
	
}
}
