package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOf_Navigate {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		WebDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		//access fb
		driver.get("https://www.facebook.com/");
		//access amazon
		driver.get("https://www.amazon.in/");
		//back
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		//forward
		driver.navigate().forward();
		//refresh
		Thread.sleep(1000);
		driver.navigate().refresh();
	}

}
