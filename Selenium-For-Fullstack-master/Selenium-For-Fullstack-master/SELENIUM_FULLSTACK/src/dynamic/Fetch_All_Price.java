package dynamic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_All_Price {

	// fetch price of all products
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(3000);
		//fetch all price
		List<WebElement> allPrice = driver.findElements
		(By.xpath("//a[@class='hrefch']/../../h5"));
		for (WebElement price : allPrice) {
			System.out.println(price.getText());
		}
		//quit
		driver.quit();
	}

}
