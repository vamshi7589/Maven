package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\OneDrive\\Documents\\Selenium\\software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("Iphone");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String iphoneCost = driver.findElement(By.xpath("(//div[@class='yKfJKb row'])[1]/descendant::div[9]")).getText();
		System.out.println(iphoneCost);
		String cost = iphoneCost.replace("₹", "");
		System.out.println(cost);
		


	}

}
