package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailRightClick {

	static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\OneDrive\\Documents\\Selenium\\software\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.contextClick(driver.findElement(By.xpath("//a[text()='Gmail']"))).perform();
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
		
	}
}
