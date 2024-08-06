package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * ACTUAL URL: https://the-internet.herokuapp.com/basic_auth
 * MODIFIED URL: https://admin:admin@the-internet.herokuapp.com/basic_auth
 */

public class Authentication_Popup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get
		("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
