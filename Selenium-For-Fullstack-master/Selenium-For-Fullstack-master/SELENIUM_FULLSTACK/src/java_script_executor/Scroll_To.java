package java_script_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_To {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//step 1
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//step 2
		js.executeScript("window.scrollTo(0,800)");
		System.out.println("completed");
	}

}
