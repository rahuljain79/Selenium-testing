package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Popup {
	public static void main(String[] args) {
		//step 1-->create an obj for ChromeOptions class
		ChromeOptions opt=new ChromeOptions();
		//step 2-->Use addArgument() and pass Chromium commands
		opt.addArguments("--disable-notifications");
		//step 3-->pass the ChromeOptions ref
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.redbus.in/");
		
	}

}
