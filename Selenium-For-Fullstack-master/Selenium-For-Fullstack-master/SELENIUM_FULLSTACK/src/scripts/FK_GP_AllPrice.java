package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FK_GP_AllPrice {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
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
