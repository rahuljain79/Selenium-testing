package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheBrowser {

	// 4-->close()
	// public void close();
	// it will close the window in the front end
	// syntax-->driver.close()

	// 5-->quit()
	// public void quit();
	// it will close the browser in back end
	// syntax-->driver.quit();

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		WebDriver driver = new ChromeDriver();
		// access fb
		driver.get("https://www.facebook.com/");
		// close
		Thread.sleep(2000);
		driver.quit();//post condition
		driver.close();
		
	}

}
