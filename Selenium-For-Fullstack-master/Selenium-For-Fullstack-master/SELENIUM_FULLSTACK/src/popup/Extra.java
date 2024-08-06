package popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Extra {

	public static void main(String[] args) throws InterruptedException {
		// step 1-->create an obj for ChromeOptions class
		ChromeOptions opt = new ChromeOptions();
		// step 2-->Use addArgument() and pass Chromium commands
		opt.addArguments("--incognito");
		// step 3-->pass the ChromeOptions ref
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//search for google pixel
		driver.findElement(By.name("q")).sendKeys("Google pixel");
		//click on search icon
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//fetch price of all products
		Thread.sleep(3000);
		List<WebElement> allPrice = driver.findElements(By.xpath
				("//div[@class='KzDlHZ']/../../div[2]/div[1]/div[1]/div[1]"));
		for (WebElement price : allPrice) {
			System.out.println(price.getText());
		}
		//quit
		driver.quit();
	}

}
