package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\OneDrive\\Documents\\Selenium\\software\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://money.rediff.com/gainers/bse/daily/groupz");
		driver.manage().window().maximize();
		int rowcount = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println("total number of rows in the table are "+rowcount);
		// total number of columns in second row
		int columncount = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[2]/td")).size();
		System.out.println("total number of columns in second row are "+columncount);

	}

}
