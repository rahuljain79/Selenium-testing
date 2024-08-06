package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FK_Mobiles_AllNames {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//search for google pixel
		driver.findElement(By.name("q")).sendKeys("mobiles");
		//click on search icon
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//fetch name of all products
		List<WebElement> allNames = driver.findElements
				(By.xpath("//div[@class='KzDlHZ']"));
		for (WebElement name : allNames) {
			System.out.println(name.getText());
		}
		//quit
		driver.quit();
	}

}
