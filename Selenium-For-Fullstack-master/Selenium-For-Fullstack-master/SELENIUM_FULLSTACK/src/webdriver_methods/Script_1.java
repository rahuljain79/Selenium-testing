package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_1 {
	//test scenario
	//to verify user can access fb login page properly
	
	//test case
	//go to chrome
	//access url-->"https://www.facebook.com/"
	//verify fb login page displayed or not
	
	public static void main(String[] args) {
		//go to chrome
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//access url-->"https://www.facebook.com/"
		driver.get("https://www.facebook.com/");
		//verify fb login page displayed or not
			//-->we can validate with help of title and url
		String title = driver.getTitle();
		String cUrl = driver.getCurrentUrl();
		if(title.contains("Facebook")&& cUrl.contains("facebook"))
		{
			System.out.println("SCRIPT IS PASS-->USER NAVIGATED TO FB LOGIN PAGE PROPERLY");
		}
		else
		{
			System.out.println("SCRIPT IS FAIL");
		}
		//quit
		driver.quit();
	}
}
