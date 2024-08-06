package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessWebApplication {
	
	//get(String url)
	//public void get(String url)
	//which is used to access the web application
	//syntax-->driver.get("url of the application")
	public static void main(String[] args) throws InterruptedException {
		//launch chrome
		WebDriver driver=new ChromeDriver();
		//access facebook
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
	}

}
