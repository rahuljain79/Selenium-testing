package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSource {

	// 6-->getPageSource()
	// public String getPageSource()
	// used to fetch html source code
	// syntax-->driver.getPageSource();
	public static void main(String[] args) {
		// launch browser
		WebDriver driver = new ChromeDriver();
		// access fb
		driver.get("https://www.facebook.com/");
		//fetch html source code
		String src = driver.getPageSource();
		System.out.println(src);
		//quit
		driver.quit();
	}

}
