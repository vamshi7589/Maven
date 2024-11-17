package demo;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\OneDrive\\Documents\\Selenium\\software\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("gb_A")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("app");
		List <WebElement> GoogleApps = driver.findElements(By.className("Rq5Gcb"));
		for(int i =0; i<GoogleApps.size(); i++)
		{
			if(GoogleApps.get(i).getText().equalsIgnoreCase("Maps"))
			{
				GoogleApps.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.close();
		
		
		}
	}

//driver.findElement(By.xpath("//span[text()='Maps']")).click();
