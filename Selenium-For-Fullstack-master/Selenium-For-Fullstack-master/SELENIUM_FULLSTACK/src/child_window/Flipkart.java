package child_window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * go to flipkart
 * search for iphone
 * click on first product
 * validate the current price
 */

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//search for iphones
		driver.findElement(By.name
				("q")).sendKeys("iphones",Keys.ENTER);
		Thread.sleep(3000);
		//click on first product
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		Thread.sleep(4000);
		//fetch pwid
		String pwid = driver.getWindowHandle();
		//fetch allwids
		Set<String> allWids = driver.getWindowHandles();
		for (String wid : allWids) {
			if(wid.equals(pwid))
			{
				
			}else {
				driver.switchTo().window(wid);
			}
		}
		//fetch the price
		WebElement price = driver.findElement(By.xpath
				("//span[@class='VU-ZEz']/../../../div[4]/div/div/div"));
		System.out.println(price.getText());
		//quit
		driver.quit();
	}

}
