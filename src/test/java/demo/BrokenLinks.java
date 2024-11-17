package demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, Throwable {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\OneDrive\\Documents\\Selenium\\software\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com");
		HttpURLConnection huc;
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			//System.out.println(links.get(i).getText() + "       "+links.get(i).getAttribute("href"));
			String url=links.get(i).getAttribute("href");
			huc=(HttpURLConnection)(new URL(url).openConnection());
			// HttpURLConnection is interface, new URL(url) is calling prameterized constructor
			//openConnection method is using to retrieve the status of given url
			int responseCode=huc.getResponseCode();
			if(responseCode>=400 && responseCode <=599)
			{
				System.out.println(url +" is  a broken link and response code is "+responseCode);
			}
			else
			{
				System.out.println(url +" is not a broken link and response code is "+responseCode);
			}
		}
	}
}
