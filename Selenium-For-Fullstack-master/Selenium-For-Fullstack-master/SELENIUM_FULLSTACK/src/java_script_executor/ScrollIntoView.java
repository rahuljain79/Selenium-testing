package java_script_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * arguments[0].scrollIntoView(boolean)
 * -->it will perform scrolling with respect to a webelement
 * -->if we pass true-->until the webelement comes into top of the webpage
 * -->if we pass false-->until the webelement comes into bottom of the webpage
 * syntax:-
 * js.executeScript("js code",webelement-ref);
 */

public class ScrollIntoView {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//identify a webelement
		WebElement cart = driver.findElement(By.xpath
				("(//input[@value='Add to cart'])[1]"));
		//step 1
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//step 2
		js.executeScript("arguments[0].scrollIntoView(false)",cart);
	}

}
