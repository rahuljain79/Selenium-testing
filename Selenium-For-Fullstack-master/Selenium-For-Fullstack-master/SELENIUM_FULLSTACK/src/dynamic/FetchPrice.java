package dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchPrice {
	
	//fetch the price in demo blaze
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(3000);
		//identify price
		WebElement price = driver.findElement
		(By.xpath("//a[text()='Samsung galaxy s6']/../../h5"));
		System.out.println(price.getText());
		//quit
		driver.quit();
	}

}
