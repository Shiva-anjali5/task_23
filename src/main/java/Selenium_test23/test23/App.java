package Selenium_test23.test23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main(String[] args) {
	        // Set the path to chromedriver.exe
		 System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			
	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the desired webpage
	        driver.get("https://google.com");

	        driver.manage().window().maximize();
	        // Get list of WebElements with tagname 'a'
	        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

	        // Traverse through the list using for-each loop
	        for (WebElement link : allLinks) {
	            // Print the link text using getText() along with its address using getAttribute("href")
	            System.out.println(link.getText() + " - " + link.getAttribute("href"));
	            System.out.println();
	            }

	        // Close the WebDriver
	        driver.quit();
	    }
}
