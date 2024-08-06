package java_script_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_By {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//scrolling
		//step 1-->downcast
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//step 2-->use JavaScriptExecutor interface method
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)");
		}

}
