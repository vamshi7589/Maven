package demo;

import java.io.File;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOperation {

	static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\OneDrive\\Documents\\Selenium\\software\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Gaming']"))).perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Gaming Keyboards']"))).click().perform();
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		String fileWithPath = "C:\\Users\\krish\\OneDrive\\Documents\\Selenium";
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}
}