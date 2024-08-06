package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_2 {

	// launch chrome
	// navigate to amazon
	// verify
	// fetch size and position
	public static void main(String[] args) {
		// go to chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// access url
		driver.get("https://www.amazon.in/");
		// verify
		String title = driver.getTitle();
		String cUrl = driver.getCurrentUrl();
		if (title.contains("Online") && cUrl.contains("amazon.in")) {
			System.out.println(driver.manage().window().getSize());
			System.out.println(driver.manage().window().getPosition());
		} else {
			System.out.println("TEST CASE IS FAIL");
		}
		// quit
		driver.quit();
	}
}
