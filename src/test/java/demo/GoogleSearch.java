package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	 WebDriver driver;

	 void OpenBrowser(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\OneDrive\\Documents\\Selenium\\software\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get(url);

	}

	void closeBrowser() {
		driver.close();
	}
	void srchKeyEnter(String keyword) {
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(keyword);
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.ENTER);
		
	}
	 void clickLoancalculator()
	 {
		 driver.findElement(By.linkText("Loan Calculator")).click();
		 driver.navigate().back();
	 }
	 
	 void clickAutoLoanCalculator()
	 {
		 driver.findElement(By.linkText("Auto Loan Calculator")).click();
		 driver.navigate().back();
	 }
	 void ClickLinks() throws InterruptedException {
		    List<WebElement> links = driver.findElements(By.xpath("//ul[@id='hl1']//a"));
		    int size = links.size();
		    
		    for (int i = 1; i < size; i++) {
		        // Re-fetch the list of links every time you navigate back
		        links = driver.findElements(By.xpath("//ul[@id='hl1']//a"));
		        WebElement clicklinks = links.get(i);	        
		        clicklinks.click();
		        Thread.sleep(3000);
		        driver.navigate().back();
		        driver.navigate().refresh();
		    }
		}

	 

	public static void main(String[] args) throws InterruptedException {

		GoogleSearch srch = new GoogleSearch();
		srch.OpenBrowser("https://www.calculator.net/");
		srch.ClickLinks();
	//	srch.clickLoancalculator();
	//	srch.clickAutoLoanCalculator();
		Thread.sleep(3000);
		srch.closeBrowser();

	}

}
