package webdriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class To {

	// to(String url)
	// it is selenium implemented method
	// driver.navigate().to("url of the appliation")

	// to(URL url)
	// it is java implemented method
	// URL-->inbuilt class present in java.net package
	// syntax-->URL u=new URL("url of the application");
	// driver.navigate().to(u);
	public static void main(String[] args) throws MalformedURLException {
		// launch browser
		WebDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// access fb
		driver.navigate().to("https://www.facebook.com/");
		//to(URL url)
		URL u=new URL("https://www.amazon.in/");
		driver.navigate().to(u);
	}

}
