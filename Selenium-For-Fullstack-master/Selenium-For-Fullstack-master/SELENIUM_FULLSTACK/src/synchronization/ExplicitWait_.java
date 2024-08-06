package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_ {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//click on gift cards link
		driver.findElement(By.xpath
				("(//a[contains(text(),'Gift Cards')])[3]")).click();
		//click on add to cart
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"))
														.click();
		//explicit wait
		//step 1:we need to crate an object for WebDriverWait 
			//class and we should pass 2 parameters.
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//step 2:we need to use an method called until() and we should specify
				//conditions
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.id("giftcard_1_RecipientName")));
		//enter name
		driver.findElement(By.id("giftcard_1_RecipientName")).
														sendKeys("ROCKY");
	}

}
