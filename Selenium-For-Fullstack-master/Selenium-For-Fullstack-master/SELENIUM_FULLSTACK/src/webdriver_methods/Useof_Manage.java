package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Useof_Manage {
	
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		//maximize
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//access fb
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
//		//minimize
//		//driver.manage().window().minimize();
	}

}
